package ciu.objetos2.familia.mvc.dto;

import java.util.ArrayList;

import ciu.objetos2.familia.mvc.model.Respetable;
import ciu.objetos2.familia.mvc.model.Titulo;

public class RespetableDto {
	
	private String nombre;
	private Integer idIntegrante;
	private Integer puntosDeHonorBase;
	private Boolean tieneCargoPolitico;
	private ArrayList<TituloDto> titulos;
	
	public RespetableDto(String nombre, Integer idIntegrante, Integer puntosDeHonor, Boolean cargoPolitico) {
		this.nombre = nombre;
		this.idIntegrante = idIntegrante;
		this.puntosDeHonorBase = puntosDeHonor;
		this.tieneCargoPolitico = cargoPolitico;
		this.titulos = new ArrayList<TituloDto>();
	}
	
	public RespetableDto() {
		this.titulos = new ArrayList<TituloDto>();
	}
	
	public void addTituloDto(TituloDto tituloDto) {
		this.titulos.add(tituloDto);
	}
	
	public Respetable toEntity() {
		Respetable r = new Respetable();
		r.setNombre(nombre);
		r.setIdIntegrante(idIntegrante);
		r.setPuntosDeHonorBase(puntosDeHonorBase);
		r.setTieneCargoPolitico(tieneCargoPolitico);
		r.setTitulos(this.titulosToEntity(titulos));
		return r;
	}
	
	public ArrayList<Titulo> titulosToEntity(ArrayList<TituloDto> titulosDto){
		ArrayList<Titulo> titulos = new ArrayList<Titulo>();
		titulosDto.forEach(t -> titulos.add(t.toEntity()));
		return titulos;
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

	public void setPuntosDeHonorBase(Integer puntosDeHonor) {
		this.puntosDeHonorBase = puntosDeHonor;
	}

	public ArrayList<TituloDto> getTitulos() {
		return titulos;
	}

	public void setTitulos(ArrayList<TituloDto> titulos) {
		this.titulos = titulos;
	}
}
