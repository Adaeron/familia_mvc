package ciu.objetos2.familia.mvc.dto;

import ciu.objetos2.familia.mvc.model.Ametralladora;
import ciu.objetos2.familia.mvc.model.Arma;
import ciu.objetos2.familia.mvc.model.Bomba;
import ciu.objetos2.familia.mvc.model.Cuchillo;

public class ArmaDto {
	private String tipo;
	
	public ArmaDto(String tipo, Integer puntosDeHonor, Integer potenciaDestructiva) {
		this.tipo = tipo;
	}
	
	public Arma toEntity() {
		if(this.tipo.equalsIgnoreCase("Cuchillo")) {
			Cuchillo c = new Cuchillo();
			c.setTipo(tipo);
			return c;
		} else if(this.tipo.equalsIgnoreCase("Bomba")) {
			Bomba b = new Bomba();
			b.setTipo(tipo);
			return b;
		} else {
			Ametralladora a = new Ametralladora();
			a.setTipo(tipo);
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
}
