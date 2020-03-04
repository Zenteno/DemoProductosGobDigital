package com.example.demo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entitiy.Productos;
import com.example.demo.repository.ProductosRepository;
import com.example.demo.service.ProductosService;
import com.example.demo.service.impl.ProductosServiceImpl;

@RunWith(SpringRunner.class)
public class ProductosServiceImplTest {

	@TestConfiguration
    static class ProductosServiceImplTestContextConfiguration {
  
        @Bean
        public ProductosService employeeService() {
            return new ProductosServiceImpl();
        }
    }
	
	@MockBean
    private ProductosRepository productosRepository;
	
	@Autowired
	ProductosServiceImpl prodService;
	
	@Test
	public void testUpdatePricesFromUf() {
		// if the uf value is below or equal to zero
		 assertTrue("Zero value uf",prodService.updatePricesFromUf(0)==0);
		 assertTrue("negative value uf",prodService.updatePricesFromUf(-1)==0);
		 
		 List<Productos> productos = prodService.findAll();
		 
	 	//the number of updates rows, should be the same number of products in the database
		 assertTrue("all the products should be updated with a positive number",prodService.updatePricesFromUf(12) == productos.size());
	}

}
