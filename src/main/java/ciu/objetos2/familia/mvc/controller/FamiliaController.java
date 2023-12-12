package ciu.objetos2.familia.mvc.controller;

import java.util.ArrayList;
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
import ciu.objetos2.familia.mvc.dto.IntegranteDto;
import ciu.objetos2.familia.mvc.dto.RespetableDto;
import ciu.objetos2.familia.mvc.model.Integrante;
import ciu.objetos2.familia.mvc.store.IntegranteStore;

@RestController
@RequestMapping("/integrantes")
public class FamiliaController {
	
	@GetMapping("/listar")
	public Collection<IntegranteDto> lista() {
		Collection<Integrante>integrantes = IntegranteStore.getInstance().findAll();
		Collection<IntegranteDto>integrantesDto = new ArrayList<IntegranteDto>();
		integrantes.forEach(i -> integrantesDto.add(i.toDto()));
		return integrantesDto;
	}
	
	@GetMapping("/listarIntegrante/{id}")
	public Integrante findById(@PathVariable Integer id) {
		return IntegranteStore.getInstance().findById(id);
	}
	
	@PostMapping("/agregarCriminal")
	public void agregar(@RequestBody CriminalDto cDto) {
		IntegranteStore.getInstance().addIntegrante(cDto.toEntity());
		
	}
	
	@PostMapping("/agregarRespetable")
	public void agregar(@RequestBody RespetableDto r) {
		IntegranteStore.getInstance().addIntegrante(r.toEntity());
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