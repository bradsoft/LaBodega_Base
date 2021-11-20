package com.labodega.customermanagement.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.labodega.customermanagement.clients.ClientesFeign;
import com.labodega.customermanagement.commons.Constant;
import com.labodega.customermanagement.commons.Util;
import com.labodega.customermanagement.model.Carrito;
import com.labodega.customermanagement.model.Cliente;
import com.labodega.customermanagement.model.Direccion;
import com.labodega.customermanagement.model.Persona;
import com.labodega.customermanagement.model.Rol;
import com.labodega.customermanagement.model.Usuario;
import com.labodega.customermanagement.repository.CarritoRepository;
import com.labodega.customermanagement.repository.ClienteRepository;
import com.labodega.customermanagement.repository.DireccionRepository;
import com.labodega.customermanagement.repository.PersonaRepository;

@Service
public class CustomerManagementBusiness {

	@Autowired
	private ClienteRepository clienteRepo;

	@Autowired
	private PersonaRepository personaRepo;

	@Autowired
	private ClientesFeign clientesFeign;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private SuscriptionManagementBusiness suscriptionManagementBusiness;
	
	@Autowired
	private CarritoRepository carritoRepo;
	
	@Autowired
	private DireccionRepository direccionRepo;

	public Persona registrarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		persona = personaRepo.save(persona);

		Cliente cliente = new Cliente();
		cliente.setIdcliente(persona.getIdpersona());
		cliente.setEstado("1");
		cliente.setFecharegistro(new Date());
		cliente.setCodcliente(Util.generateCodCliente(persona.getIdpersona() + ""));
		persona.setCodcliente(clienteRepo.save(cliente).getCodcliente());

		persona.setIdsuscripcion(suscriptionManagementBusiness
				.registrarSuscripcion(persona.getIdpersona(), Constant.PLAN_FREE).getIdsuscripcion());

		Usuario usuario = new Usuario();
		usuario.setEstado("1");
		usuario.setIdpersona(persona.getIdpersona());
		usuario.setUsuario(persona.getUsuario());
		System.out.println("persona.getPassword().trim() : " + persona.getPassword().trim());
		usuario.setPassword(passwordEncoder.encode(persona.getPassword().trim()));
		List<Rol> roles = new ArrayList<Rol>();
		Rol rol = new Rol();
		rol.setIdperfil(2);
		rol.setDescripcion("ROLE_USER");
		roles.add(rol);
		usuario.setRoles(roles);
		System.out.println("usuario : " + usuario.toString());
		clientesFeign.guardarUsuario(usuario);

		//enviarMensajeKafka(persona);

		return persona;
	}

	/*
	 * private void enviarMensajeKafka(Persona persona) throws
	 * JsonProcessingException { SendEmail send = new SendEmail();
	 * send.setIdpersona(persona.getIdpersona());
	 * com.labodega.customermanagement.producer.Usuario usuario = new
	 * com.labodega.customermanagement.producer.Usuario();
	 * usuario.setUsuario(persona.getUsuario());
	 * usuario.setPassword(persona.getPassword()); send.setUsuario(usuario);
	 * customerProducer.sendMessage(send); }
	 */

	public Persona actualizarCliente(Persona persona) throws Exception {
		// TODO Auto-generated method stub
		return personaRepo.save(persona);
	}

	public Persona obtenerCliente(Integer idpersona) throws Exception {
		Persona persona = personaRepo.findById(idpersona).orElse(new Persona());
		/*
		 * persona.setIdsuscripcion(suscriptionManagementBusiness.retornarSuscripcion(
		 * idpersona).getIdsuscripcion());
		 * 
		 * List<Carrito> listCarritos = carritoRepo.findByIdclienteAndEstado(idpersona,
		 * "P");
		 * 
		 * if(listCarritos!=null && listCarritos.size()>0)
		 * persona.setShoppingid(listCarritos.get(0).getIdcarrito());
		 */
		
		return persona;
	}

	public Direccion registrarDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		return direccionRepo.save(direccion);
	}

	public Direccion obtenerDireccion(Integer idpersona) {
		// TODO Auto-generated method stub
		List<Direccion> lDireccion = direccionRepo.findByIdpersona(idpersona);
		if(lDireccion != null && lDireccion.size() > 0)
			return lDireccion.get(0);
		
		return new Direccion();
	}

	public Direccion updateDireccion(Direccion direccion) {
		// TODO Auto-generated method stub
		return direccionRepo.save(direccion);
	}

}
