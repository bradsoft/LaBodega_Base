package com.labodega.customermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labodega.customermanagement.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}
