package com.labodega.customermanagement.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.labodega.customermanagement.model.Direccion;
import com.labodega.customermanagement.model.Persona;

public interface ICustomerManagementService {

	public Persona registrarCliente(@RequestBody Persona persona) throws Exception;

	public Persona actualizarCliente(@RequestBody Persona persona) throws Exception;
	
	public Persona obtenerCliente(Integer idpersona) throws Exception;

	public Direccion registrarDireccion(Direccion direccion);

	public Direccion obtenerDireccion(Integer idpersona);

	public Direccion updateDireccion(Direccion direccion);

}
