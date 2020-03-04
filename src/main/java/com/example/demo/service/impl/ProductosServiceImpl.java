package com.example.demo.service.impl;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ProductosRepository;
import com.example.demo.service.ProductosService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entitiy.Productos;

@Service
public class ProductosServiceImpl implements ProductosService{
	
	@Autowired
	ProductosRepository productRepository;
	Logger logger = LoggerFactory.getLogger(ProductosServiceImpl.class);
	
	
	/**
	 * List all the products of the database
	 *
	 * @return list of the products
	 */
	public List<Productos> findAll() {
		return productRepository.findAll();
	}

	
	/**
	 * Update the prices of all the products in the database
	 
	 * @param uf
	 * @return number of rows updated
	 */
	@Override
	public int updatePricesFromUf(float uf) {
		if(uf<=0)
			return 0;
		return productRepository.updatePrecioProductosUf(uf);
	}
	
	/**
	 * Fetch the uf value of the day, from https://mindicador.cl/api/uf 
	 * 
	 * @param url
	 * @return JSONObject
	 */
	public JSONObject requestUfValue() {
		JSONObject respuesta = new JSONObject();
		HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	          .uri(URI.create("https://mindicador.cl/api/uf"))
	          .build();

	    try {
			HttpResponse<String> response =
			      client.send(request, BodyHandlers.ofString());
			JSONObject js = (JSONObject) JSON.parse(response.body());
			if(js.containsKey("serie")){
				JSONArray series = js.getJSONArray("serie");
				if(series.size()>0 && series.getJSONObject(0).containsKey("valor")  && series.getJSONObject(0).containsKey("fecha")){
					float valorUf = series.getJSONObject(0).getFloatValue("valor");
					String fecha = series.getJSONObject(0).getString("fecha");
					int res = updatePricesFromUf(valorUf); 
					respuesta.put("code", 200);
					respuesta.put("message", String.format("Se han modificado exitosamente %d filas.",res));
					respuesta.put("valoruf",valorUf);
					respuesta.put("fechauf",fecha);
					logger.info(String.format("Modificados %d produtos. Valor UF: %f. Fecha UF: %s.",res,valorUf,fecha));
				}else {
					logger.info("No se han modificado los productos porque api no contiene valor de UF.");
					respuesta.put("code", "500");
					respuesta.put("message","No se han actualizado los productos");
				}
			}
		} catch (Exception e) {
			respuesta.put("code", "500");
			respuesta.put("message","Houston, tenemos un problema.");
			logger.error(e.toString());
		}
		return respuesta;
	}
}
