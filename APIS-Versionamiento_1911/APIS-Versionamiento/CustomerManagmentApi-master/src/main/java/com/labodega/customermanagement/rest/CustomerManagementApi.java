package com.labodega.customermanagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.labodega.customermanagement.model.Direccion;
import com.labodega.customermanagement.model.Persona;
import com.labodega.customermanagement.service.ICustomerManagementService;

@RequestMapping("/customermanagement")
@RestController
public class CustomerManagementApi {

	@Autowired
	private ICustomerManagementService customerManagementService;

	@PostMapping(value = "/registerClient", produces = { "application/json" })
	public Persona registrarCliente(@RequestBody Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.registrarCliente(persona);
	}

	@PostMapping(value = "/updateClient", produces = { "application/json" })
	public Persona actualizarCliente(@RequestBody Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.actualizarCliente(persona);
	}
	
	@GetMapping(value = "/client/{idpersona}", produces = { "application/json" })
	public Persona obtenerCliente(@PathVariable (value ="idpersona") Integer idpersona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.obtenerCliente(idpersona);
	}
	
	@PostMapping(value = "/direccion", produces = { "application/json" })
	public Direccion registrarDireccion(@RequestBody Direccion direccion) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.registrarDireccion(direccion);
	}
	
	@GetMapping(value = "/direccionPersona/{idpersona}", produces = { "application/json" })
	public Direccion obtenerDireccion(@PathVariable (value ="idpersona") Integer idpersona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.obtenerDireccion(idpersona);
	}
	
	@PostMapping(value = "/updateDireccion", produces = { "application/json" })
	public Direccion updateDireccion(@RequestBody Direccion direccion) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementService.updateDireccion(direccion);
	}

}
