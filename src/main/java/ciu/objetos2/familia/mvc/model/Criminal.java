package ciu.objetos2.familia.mvc.model;

import java.util.ArrayList;

public class Criminal extends Integrante {
	private ArrayList<Arma> armas;
	
	public Criminal(String nombre, Integer idCriminal, Integer puntosDeHonorBase) {
		super(nombre, idCriminal, puntosDeHonorBase);
		this.armas = new ArrayList<Arma>();
	}
	
	public Criminal() {
		this.armas = new ArrayList<Arma>();
	}

	@Override
	public Integer getPuntosDeHonor() {
		return this.getPuntosDeHonorBase() + this.getPuntosDeHonorArmas();
	}
	
	private Integer getPuntosDeHonorArmas() {
		return this.armas.stream()
				.mapToInt(Arma :: getPuntosDeHonorArma)
				.sum();
	}
	
	public void addArma(Arma arma) {
		this.armas.add(arma);
	}

	@Override
	public Boolean esCapo() {
		return this.getPuntosDeHonor() > 100 && this.cantidadArmasHeavy() >= 1;
	}
	
	public Integer cantidadArmasHeavy() {
		return this.armas.stream()
					.filter(Arma::isHeavy)
					.toList()
					.size();
	}
	
	
	//Getters & Setters
	public ArrayList<Arma> getArmas(){
		return this.armas;
	}
	
	public void setArmas(ArrayList<Arma> armas) {
		this.armas = armas;
	}
}
