package com.example.demo.controllers;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entities.Productos;
import com.example.demo.repositories.ProductosRepository;

@RestController
public class ApiController {

	@Autowired
    private ProductosRepository productosRepository;
	
	@GetMapping("/products")
    public List<Productos> getProductos() {
        return productosRepository.findAll();
    }
	
	@PostMapping("/actualizar-precios-uf")
	public JSONObject actualizaProductos() {
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
				float valorUf = series.getJSONObject(0).getFloatValue("valor");
				int res = productosRepository.updatePrecioProductosUf(valorUf);
				respuesta.put("code", 200);
				respuesta.put("message","Se han modificado exitosamente "+res+" filas");
			}
		} catch (Exception e) {
			respuesta.put("code", "500");
			respuesta.put("message",e.toString());
			e.printStackTrace();
		}
		return respuesta;
	}
}
