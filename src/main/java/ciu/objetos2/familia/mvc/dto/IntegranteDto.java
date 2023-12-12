package ciu.objetos2.familia.mvc.dto;

import java.util.ArrayList;

public class IntegranteDto {
	private String nombre;
	private Integer idIntegrante;
	private Integer puntosDeHonorBase;
	private Boolean tieneCargoPolitico;
	private ArrayList<ArmaDto> armas;
	private ArrayList<TituloDto> titulos;
	
	public IntegranteDto(String nombre, Integer idIntegrante, Integer puntosHonorBase) {
		this.nombre =nombre;
		this.idIntegrante = idIntegrante;
		this.puntosDeHonorBase = puntosHonorBase;
	}
	
	public void addArmaDto(ArmaDto arma) {
		this.armas.add(arma);
	}
	
	public void removeArmaDto(ArmaDto arma) {
		this.armas.remove(arma);
	}
	
	public void addTituloDto(TituloDto titulo) {
		this.titulos.add(titulo);
	}
	
	public void removeTituloDto(TituloDto titulo) {
		this.titulos.remove(titulo);
	}
	
	public IntegranteDto() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdIntegrante() {
		return idIntegrante;
	}

	public void setIdIntegrante(Integer idIntegrante) {
		this.idIntegrante = idIntegrante;
	}

	public Integer getPuntosDeHonorBase() {
		return puntosDeHonorBase;
	}

	public void setPuntosDeHonorBase(Integer puntosDeHonorBase) {
		this.puntosDeHonorBase = puntosDeHonorBase;
	}

	public void setTieneCargoPolitico(Boolean tieneCargoPolitico) {
		this.tieneCargoPolitico = tieneCargoPolitico;
		
	}
	
	public Boolean getTieneCargoPolitico() {
		return this.tieneCargoPolitico;
	}

	public ArrayList<ArmaDto> getArmas() {
		return armas;
	}

	public void setArmas(ArrayList<ArmaDto> armas) {
		this.armas = armas;
	}

	public ArrayList<TituloDto> getTitulos() {
		return titulos;
	}

	public void setTitulos(ArrayList<TituloDto> titulos) {
		this.titulos = titulos;
	}
	
}
