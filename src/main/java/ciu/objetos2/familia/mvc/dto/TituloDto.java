package ciu.objetos2.familia.mvc.dto;

import ciu.objetos2.familia.mvc.model.Titulo;

public class TituloDto {
	private String descripcion;
	
	//Constructores
	
	public TituloDto(String descripcionTitulo) {
		this.descripcion = descripcionTitulo;
	}
	
	public TituloDto() {
		
	}
	
	//Métodos
	public Titulo toEntity() {
		Titulo t = new Titulo();
		t.setDescripcionTitulo(descripcion);
		return t;
	}
	
	//Getters & Setters
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}