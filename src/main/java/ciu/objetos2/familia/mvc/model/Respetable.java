package ciu.objetos2.familia.mvc.model;

import java.util.ArrayList;

public class Respetable extends Integrante {
	
	
	private static final Integer PUNTOS_POR_TITULO = Integer.valueOf(10);
	
	private ArrayList<Titulo> titulos;
	private Boolean tieneCargoPolitico;
	
	public Respetable(String nombre, Integer idIntegrante, Integer puntosDeHonorBase, Boolean tieneCargoPolitico) {
		super(nombre, idIntegrante, puntosDeHonorBase);
		this.tieneCargoPolitico = tieneCargoPolitico;
		this.titulos = new ArrayList<Titulo>();
	}

	public Respetable() {
		
	}

	@Override
	public Integer getPuntosDeHonor() {
		return this.getPuntosDeHonorBase() + this.getPuntosDeHonorTitulos();
	}
	
	private Integer getPuntosDeHonorTitulos() {
		return this.titulos.size() * PUNTOS_POR_TITULO;
	}

	@Override
	public Boolean esCapo() {
		return this.getPuntosDeHonor() > 100 && this.tieneCargoPolitico;
	}
	
	//Getters & Setters
	public Boolean getTieneCargoPolitico() {
		return this.tieneCargoPolitico;
	}
	
	public void setTieneCargoPolitico(Boolean tieneCargo) {
		this.tieneCargoPolitico = tieneCargo;
	}
	
	public ArrayList<Titulo> getTitulos() {
		return this.titulos;
	}
	
	public void setTitulos(ArrayList<Titulo> titulos) {
		this.titulos = titulos;
	}
}
