package com.terpel.microservicedates.model;

public class Model {
	
	private String periodo;
	private String fecha;
	private String dia;
	
	public Model(String periodo, String fecha, String dia) {
		super();
		this.periodo = periodo;
		this.fecha = fecha;
		this.dia = dia;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}
	
}
