package com.labodega.customermanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labodega.customermanagement.model.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Integer>{

	List<Direccion> findByIdpersona(Integer idpersona);

}
