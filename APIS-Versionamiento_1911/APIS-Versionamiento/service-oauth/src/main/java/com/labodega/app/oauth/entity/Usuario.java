package com.labodega.app.oauth.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;


public class Usuario implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Integer idusuario;

    private String usuario;

    private String password;

    private Integer idpersona;

    private String estado;

    private List<Rol> roles;

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
    
    

}
