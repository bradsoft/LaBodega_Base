package com.labodega.customermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labodega.customermanagement.business.CustomerManagementBusiness;
import com.labodega.customermanagement.model.Direccion;
import com.labodega.customermanagement.model.Persona;

@Service
public class CustomerManagementService implements ICustomerManagementService {
	
	@Autowired
	private CustomerManagementBusiness customerManagementBusiness;
	
	@Override
	public Persona registrarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementBusiness.registrarCliente(persona);
	}

	@Override
	public Persona actualizarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementBusiness.actualizarCliente(persona);
	}

	@Override
	public Persona obtenerCliente(Integer idpersona) throws Exception {
		// TODO Auto-generated method stub
		return customerManagementBusiness.obtenerCliente(idpersona);
	}

	@Override
	public Direccion registrarDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		return customerManagementBusiness.registrarDireccion(direccion);
	}

	@Override
	public Direccion obtenerDireccion(Integer idpersona) {
		// TODO Auto-generated method stub
		return customerManagementBusiness.obtenerDireccion(idpersona);
	}

	@Override
	public Direccion updateDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		return customerManagementBusiness.updateDireccion(direccion);
	}

	
}
