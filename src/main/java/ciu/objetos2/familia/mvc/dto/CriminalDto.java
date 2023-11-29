package ciu.objetos2.familia.mvc.dto;

import java.util.ArrayList;

import ciu.objetos2.familia.mvc.model.Arma;
import ciu.objetos2.familia.mvc.model.Criminal;

public class CriminalDto {
	
	private String nombre;
	private Integer idIntegrante;
	private Integer puntosDeHonorBase;
	private ArrayList<ArmaDto> armas;
	
	public CriminalDto(String nombre, Integer idIntegrante, Integer puntosDeHonor) {
		this.nombre = nombre;
		this.idIntegrante = idIntegrante;
		this.puntosDeHonorBase = puntosDeHonor;
		this.armas = new ArrayList<ArmaDto>();
	}
	
	public CriminalDto() {
		this.armas = new ArrayList<ArmaDto>();
	}
	
	public void addArmaDto(ArmaDto arma) {
		this.armas.add(arma);
	}
	
	public Criminal toEntity() {
		Criminal c = new Criminal();
		c.setNombre(this.nombre);
		c.setArmas(this.armasAEntity(armas));
		c.setIdIntegrante(this.idIntegrante);
		c.setPuntosDeHonorBase(this.puntosDeHonorBase);
		return c;
	}
	
	private ArrayList<Arma> armasAEntity(ArrayList<ArmaDto> armasDto) {
		ArrayList<Arma> armasEntity = new ArrayList<Arma> ();
		armasDto.forEach(a -> armasEntity.add(a.toEntity()));
		return armasEntity;
	}
	
	//Getters & Setters
	
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

	public void setPuntosDeHonor(Integer puntosDeHonor) {
		this.puntosDeHonorBase = puntosDeHonor;
	}

	public ArrayList<ArmaDto> getArmas() {
		return armas;
	}

	public void setArmas(ArrayList<ArmaDto> armas) {
		this.armas = armas;
	}
}