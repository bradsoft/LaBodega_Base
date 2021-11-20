package com.labodega.customermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labodega.customermanagement.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
