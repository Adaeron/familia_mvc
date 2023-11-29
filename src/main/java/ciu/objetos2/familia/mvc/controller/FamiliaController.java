package ciu.objetos2.familia.mvc.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciu.objetos2.familia.mvc.dto.CriminalDto;
import ciu.objetos2.familia.mvc.dto.RespetableDto;
import ciu.objetos2.familia.mvc.model.Integrante;
import ciu.objetos2.familia.mvc.store.IntegranteStore;

@RestController
@RequestMapping("/integrantes")
public class FamiliaController {
	
	@GetMapping("/listar")
	public Collection<Integrante> lista() {
		return IntegranteStore.getInstance().findAll();
	}
	
	@GetMapping("/listarIntegrante/{id}")
	public Integrante findById(@PathVariable Integer id) {
		return IntegranteStore.getInstance().findById(id);
	}
	
	@PostMapping("/agregarCriminal")
	public Integrante agregar(@RequestBody CriminalDto cDto) {
		return IntegranteStore.getInstance().addIntegrante(cDto.toEntity());
		
	}
	
	@PostMapping("/agregarRespetable")
	public Integrante agregar(@RequestBody RespetableDto r) {
		return IntegranteStore.getInstance().addIntegrante(r.toEntity());
	}
	
	@DeleteMapping("/borrarIntegrante/{id}")
	public void borrar(@PathVariable Integer id) {
		System.out.println("Lama capo");
		IntegranteStore.getInstance().delete(id);
	}
	
	@PutMapping("/actualizarCriminal")
	public void cambiarNombre(@RequestBody CriminalDto c) {
		IntegranteStore.getInstance().cambiarNombre(c.toEntity());
	}
	
	@PutMapping("/actualizarRespetable")
	public void cambiarNombre(@RequestBody RespetableDto r) {
		IntegranteStore.getInstance().cambiarNombre(r.toEntity());
	}
}