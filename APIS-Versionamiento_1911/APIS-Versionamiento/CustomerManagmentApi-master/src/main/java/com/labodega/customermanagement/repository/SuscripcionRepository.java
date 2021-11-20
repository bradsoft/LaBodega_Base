package com.labodega.customermanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labodega.customermanagement.model.Suscripcion;

public interface SuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
	
	public List<Suscripcion> findByIdcliente(Integer idcliente);
	
}
