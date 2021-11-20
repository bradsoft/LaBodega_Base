package com.labodega.customermanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labodega.customermanagement.model.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Integer>{
	
	public List<Carrito> findByIdclienteAndEstado(Integer idcliente, String estado);
	
}
