package ciu.objetos2.familia.mvc.dto;

import ciu.objetos2.familia.mvc.model.Ametralladora;
import ciu.objetos2.familia.mvc.model.Arma;
import ciu.objetos2.familia.mvc.model.Bomba;
import ciu.objetos2.familia.mvc.model.Cuchillo;

public class ArmaDto {
	private String tipo;
	private Integer puntosDeHonor;
	private Integer potenciaDestructiva;
	
	public ArmaDto(String tipo, Integer puntosDeHonor, Integer potenciaDestructiva) {
		this.tipo = tipo;
		this.puntosDeHonor = puntosDeHonor;
		this.potenciaDestructiva = potenciaDestructiva;
	}
	
	public Arma toEntity() {
		if(this.tipo.equalsIgnoreCase("Cuchillo")) {
			Cuchillo c = new Cuchillo();
			c.setTipo(tipo);
			c.setPuntosDeHonorArma(puntosDeHonor);
			c.setPotenciaDestructiva(potenciaDestructiva);
			return c;
		} else if(this.tipo.equalsIgnoreCase("Bomba")) {
			Bomba b = new Bomba();
			b.setTipo(tipo);
			b.setPotenciaDestructiva(potenciaDestructiva);
			b.setPuntosDeHonorArma(puntosDeHonor);
			return b;
		} else {
			Ametralladora a = new Ametralladora();
			a.setTipo(tipo);
			a.setPotenciaDestructiva(potenciaDestructiva);
			a.setPuntosDeHonorArma(puntosDeHonor);
			return a;
		}
	}
	
	//Getters & Setters

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getPuntosDeHonor() {
		return puntosDeHonor;
	}

	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonor = puntosDeHonor;
	}

	public Integer getPotenciaDestructiva() {
		return potenciaDestructiva;
	}

	public void setPotenciaDestructiva(Integer potenciaDestructiva) {
		this.potenciaDestructiva = potenciaDestructiva;
	}
}
