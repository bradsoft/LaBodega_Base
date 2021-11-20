package com.labodega.app.oauth.entity;

import java.io.Serializable;

import lombok.Data;

public class Rol implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
  
    private Integer idperfil;
    
    private String descripcion;
    
    private String estado;

	public Integer getIdperfil() {
		return idperfil;
	}

	public void setIdperfil(Integer idperfil) {
		this.idperfil = idperfil;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    

}