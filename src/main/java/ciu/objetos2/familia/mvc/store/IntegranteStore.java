package ciu.objetos2.familia.mvc.store;

import java.util.ArrayList;
import java.util.Collection;

import ciu.objetos2.familia.mvc.model.Integrante;


public class IntegranteStore {
	private Collection<Integrante> integrantes;
	private static IntegranteStore instance = new IntegranteStore();
	
	private IntegranteStore() {
		this.integrantes = new ArrayList<Integrante>();
	}
	
	public void addIntegrante(Integrante integrante) {
		Integrante integranteExistente = this.findById(integrante.getIdIntegrante());
		if(integranteExistente == null) {
			this.integrantes.add(integrante);
			System.out.println("El integrante fue añadido exitosamente");
		}else {
			System.out.println("El integrante ya existe");
		}
		
	}
	
	public Collection<Integrante> findAll(){
		return this.integrantes;
	}
	
	public void delete(Integer id) {
		if(!(this.findById(id) == null)) {
			this.integrantes.remove(this.findById(id));
		}
	}
	
	public Integrante findById(Integer id) {
		return this.integrantes.stream()
				.filter(integrante -> integrante.getIdIntegrante().equals(id))
				.findFirst()
				.orElse(null);
	}
	
	public Integrante cambiarNombre(Integrante i) {
		Integrante integranteExistente = this.findById(i.getIdIntegrante());
		
		integranteExistente.setNombre(i.getNombre());
		
		return integranteExistente;
		
	}
	
	/*
	 * public Criminal agregarArma(Criminal c) { Criminal criminalExistente =
	 * (Criminal) this.findById(c.getIdIntegrante());
	 * 
	 * criminalExistente.addArma(c.getArmas());
	 * 
	 * }
	 * 
	 * public Respetable agregarTitulo(Respetable i) {
	 * 
	 * }
	 */
	
	//Getters & Setters
	
	public static IntegranteStore getInstance() { 
		return instance;
	}
}
