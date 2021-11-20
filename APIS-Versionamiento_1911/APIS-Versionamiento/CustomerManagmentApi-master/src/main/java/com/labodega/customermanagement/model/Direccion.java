package com.labodega.customermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "direccionentrega")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddireccionentrega;

	private String direccionentrega;

	private String tipo;
	private String numero;
	private String distrito;
	private String pisodep;
	private String referencia;
	private String tipestadoo;
	private Integer idpersona;
	public Integer getIddireccionentrega() {
		return iddireccionentrega;
	}
	public void setIddireccionentrega(Integer iddireccionentrega) {
		this.iddireccionentrega = iddireccionentrega;
	}
	public String getDireccionentrega() {
		return direccionentrega;
	}
	public void setDireccionentrega(String direccionentrega) {
		this.direccionentrega = direccionentrega;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getPisodep() {
		return pisodep;
	}
	public void setPisodep(String pisodep) {
		this.pisodep = pisodep;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getTipestadoo() {
		return tipestadoo;
	}
	public void setTipestadoo(String tipestadoo) {
		this.tipestadoo = tipestadoo;
	}
	public Integer getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(Integer idpersona) {
		this.idpersona = idpersona;
	}	
	
}
