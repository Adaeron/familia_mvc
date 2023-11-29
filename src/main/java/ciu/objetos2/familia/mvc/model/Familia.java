package ciu.objetos2.familia.mvc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;


public class Familia {
	private Collection<Integrante> integrantes;
	
	public Familia() {
		super();
		this.integrantes = new ArrayList<Integrante>();
	}
	
	public void addIntegrante(Integrante integrante){
		this.integrantes.add(integrante);
	}
	
	public void borrarIntegrante(Integer idIntegrante) {
		
	}
	
	public Collection<Integrante> getIntegrantesCapos() {
		return this.integrantes.stream()
				.filter(Integrante :: esCapo)
				.collect(Collectors.toList());
	}
	
	public Integer honorTotalFamilia() {
		return this.integrantes.stream()
				.mapToInt(Integrante :: getPuntosDeHonor)
				.sum();
	}
	
	public Integer cantidadDeIntegrantes() {
		return this.integrantes.size();
	}
	
	public Double honorPerCapita() {
		return Double.valueOf(this.honorTotalFamilia() / this.cantidadDeIntegrantes());
	}
	
	public Boolean esFamiliaEjemplar() {
		return this.integrantes.stream()
				.allMatch(i -> i.getPuntosDeHonor() > Integer.valueOf(60));
	}
	//Getters & Setters
	public Collection<Integrante> getIntegrantes(){
		return this.integrantes;
	}
	
	
	
	
}
