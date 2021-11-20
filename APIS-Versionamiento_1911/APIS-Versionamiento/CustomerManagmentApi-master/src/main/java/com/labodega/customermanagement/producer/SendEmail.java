package com.labodega.customermanagement.producer;

import java.io.Serializable;

import lombok.Data;

public class SendEmail implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idpersona;
	private String correo;
	private String tipocorreo;
	private Usuario usuario;
	
	private boolean envio;

	public Integer getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTipocorreo() {
		return tipocorreo;
	}

	public void setTipocorreo(String tipocorreo) {
		this.tipocorreo = tipocorreo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isEnvio() {
		return envio;
	}

	public void setEnvio(boolean envio) {
		this.envio = envio;
	}
	
	
}
