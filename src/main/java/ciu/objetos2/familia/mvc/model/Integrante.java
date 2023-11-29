package ciu.objetos2.familia.mvc.model;

public abstract class Integrante {
	protected Integer idIntegrante;
	protected Integer puntosDeHonorBase;
	protected String nombre;
	
	public Integrante() {
		
	}
	
	public Integrante(String nombre, Integer idIntegrante, Integer puntosDeHonorBase) {
		this.nombre = nombre;
		this.idIntegrante = idIntegrante;
		this.puntosDeHonorBase = puntosDeHonorBase;
	}
	
	public abstract Integer getPuntosDeHonor();
	public abstract Boolean esCapo();
	
	public Integer getPuntosDeHonorBase() {
		return this.puntosDeHonorBase;
	}
	
	public void setPuntosDeHonorBase(Integer puntosDeHonorBase) {
		this.puntosDeHonorBase = puntosDeHonorBase;
	}
	
	public Integer getIdIntegrante() {
		return this.idIntegrante;
	}
	
	public void setIdIntegrante(Integer idIntegrante) {
		this.idIntegrante = idIntegrante;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}