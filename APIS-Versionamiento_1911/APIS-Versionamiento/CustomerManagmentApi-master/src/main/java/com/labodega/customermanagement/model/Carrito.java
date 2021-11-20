package com.labodega.customermanagement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="carrito_tmp")

public class Carrito implements Serializable {
	
	 private static final long serialVersionUID = 1L;
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer idcarrito;
	    
	    private Integer idcliente;
	    
	    private String estado;
	    
	    private Date fecha;
	    
	    private Double total;
	    
	    private Integer iddelivery;
	    
	    private Double costodelivery;
	    
	    private Double subtotalventa;
	    
	    private Double subtotalalquiler;
	    
	    private Double descuentoventa;
	    
	    private Double descuentoalquiler;
	    
	    private Date fechaactualizacion;

		public Integer getIdcarrito() {
			return idcarrito;
		}

		public void setIdcarrito(Integer idcarrito) {
			this.idcarrito = idcarrito;
		}

		public Integer getIdcliente() {
			return idcliente;
		}

		public void setIdcliente(Integer idcliente) {
			this.idcliente = idcliente;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}

		public Integer getIddelivery() {
			return iddelivery;
		}

		public void setIddelivery(Integer iddelivery) {
			this.iddelivery = iddelivery;
		}

		public Double getCostodelivery() {
			return costodelivery;
		}

		public void setCostodelivery(Double costodelivery) {
			this.costodelivery = costodelivery;
		}

		public Double getSubtotalventa() {
			return subtotalventa;
		}

		public void setSubtotalventa(Double subtotalventa) {
			this.subtotalventa = subtotalventa;
		}

		public Double getSubtotalalquiler() {
			return subtotalalquiler;
		}

		public void setSubtotalalquiler(Double subtotalalquiler) {
			this.subtotalalquiler = subtotalalquiler;
		}

		public Double getDescuentoventa() {
			return descuentoventa;
		}

		public void setDescuentoventa(Double descuentoventa) {
			this.descuentoventa = descuentoventa;
		}

		public Double getDescuentoalquiler() {
			return descuentoalquiler;
		}

		public void setDescuentoalquiler(Double descuentoalquiler) {
			this.descuentoalquiler = descuentoalquiler;
		}

		public Date getFechaactualizacion() {
			return fechaactualizacion;
		}

		public void setFechaactualizacion(Date fechaactualizacion) {
			this.fechaactualizacion = fechaactualizacion;
		}
	    
	    
}
