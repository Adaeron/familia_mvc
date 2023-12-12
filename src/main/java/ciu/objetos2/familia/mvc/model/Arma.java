package ciu.objetos2.familia.mvc.model;

import ciu.objetos2.familia.mvc.dto.ArmaDto;

public abstract class Arma {
	protected String tipo;
	protected Integer puntosDeHonorArma;
	protected Integer potenciaDestructiva;
	
	public Arma() {
		
	}
	
	public Arma(Integer puntosDeHonorArma, Integer potenciaDestructiva) {
		super();
		this.puntosDeHonorArma = puntosDeHonorArma;
		this.potenciaDestructiva = potenciaDestructiva;
	}
	
	public boolean isHeavy() {
		return 
				this.puntosDeHonorMayorOIgualA10() || this.potenciaDestructivaMayorOIgualA200();
	}
	
	private boolean puntosDeHonorMayorOIgualA10() {
		return this.getPuntosDeHonorArma() >= Integer.valueOf(10);
	}
	
	private boolean potenciaDestructivaMayorOIgualA200() {
		return this.getPotenciaDestructiva() >= Integer.valueOf(200);
	}
	
	//Setters & Getters
	public Integer getPuntosDeHonorArma() {
		return this.puntosDeHonorArma;
	}
	
	public Integer getPotenciaDestructiva() {
		return this.potenciaDestructiva;
	}
	
	public void setPuntosDeHonorArma(Integer puntosDeHonor) {
		this.puntosDeHonorArma = puntosDeHonor;
	}
	
	public void setPotenciaDestructiva(Integer potenciaDestructiva) {
		this.potenciaDestructiva = potenciaDestructiva;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArmaDto toDto() {
		ArmaDto armaDto = new ArmaDto();
		
		armaDto.setTipo(tipo);
		
		return armaDto;
	}
	
	
	
}
