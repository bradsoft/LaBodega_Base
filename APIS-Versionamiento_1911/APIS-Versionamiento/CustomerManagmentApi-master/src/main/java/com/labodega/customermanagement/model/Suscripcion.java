package com.labodega.customermanagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="suscripcion")
@Entity

public class Suscripcion implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idsuscripcion;
	
	private Integer idcliente;
	private Date fechainicio;
	private String estado;
	private Integer idplan;
	private Date fechafin;
	public Integer getIdsuscripcion() {
		return idsuscripcion;
	}
	public void setIdsuscripcion(Integer idsuscripcion) {
		this.idsuscripcion = idsuscripcion;
	}
	public Integer getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}
	public Date getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getIdplan() {
		return idplan;
	}
	public void setIdplan(Integer idplan) {
		this.idplan = idplan;
	}
	public Date getFechafin() {
		return fechafin;
	}
	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	
	
	
}
