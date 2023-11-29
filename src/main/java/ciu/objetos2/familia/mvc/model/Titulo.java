package ciu.objetos2.familia.mvc.model;

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
}
