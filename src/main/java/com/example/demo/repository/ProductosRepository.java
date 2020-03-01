package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entitiy.Productos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long>{

	@Transactional
	@Modifying
	@Query(value = "UPDATE productos SET preciounituf = preciounit * :uf", nativeQuery = true)
	int updatePrecioProductosUf(@Param("uf") float uf);
}
