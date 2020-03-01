package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entitiy.Productos;
import com.example.demo.service.impl.ProductosServiceImpl;

@RestController
public class ApiController {

	Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	@Autowired
    private ProductosServiceImpl productosServices;
	
	@GetMapping("/products")
    public List<Productos> getProductos() {
        return productosServices.findAll();
    }
	
	@PostMapping("/actualizar-precios-uf")
	public JSONObject actualizaProductos() {
		return productosServices.updatePricesFromUf();
	}
}
