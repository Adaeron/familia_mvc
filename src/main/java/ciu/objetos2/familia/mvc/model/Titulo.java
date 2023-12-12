package ciu.objetos2.familia.mvc.model;

import ciu.objetos2.familia.mvc.dto.TituloDto;

public class Titulo {
	private String descripcionTitulo;
	
	public Titulo(String descripcion) {
		this.descripcionTitulo = descripcion;
	}
	
	public Titulo() {
	
	}

	public String getDescripcionTitulo() {
		return this.descripcionTitulo;
	}
	
	public void setDescripcionTitulo(String descripcion) {
		this.descripcionTitulo = descripcion;
	}

	public TituloDto toDto() {
		TituloDto tituloDto = new TituloDto();
		
		tituloDto.setDescripcion(descripcionTitulo);
		
		return tituloDto;
	}
}
