package com.ipartek.formacion.editorialrestspring.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ipartek.formacion.editorialrestspring.modelos.Editorial;
import com.ipartek.formacion.editorialrestspring.repositories.CrudAble;

@RestController
public class EditorialController implements RestAble<Editorial>{
	@Autowired
	private final CrudAble<Editorial> repositorio = null;
	
	@Override
	@GetMapping("/api/editoriales")
	public List<Editorial> obtenerTodos() {
		return repositorio.getAll();
	}
	
	@Override
	@GetMapping("/api/editoriales/{id}")
    public Editorial obtenerPorId(@PathVariable("id") Long id) {
    	return repositorio.getById(id);
    }
	
	@Override
	@PostMapping("/api/editoriales")
	public Long crear(@RequestBody Editorial editorial) {
		return (Long) repositorio.insert(editorial);
	}
	
	@Override
	@PutMapping("/api/editoriales")
	public void modificar(@RequestBody Editorial editorial) {
		repositorio.update(editorial);
	}
	
	@Override
	@DeleteMapping("/api/editoriales/{id}")
	public void borrar(@PathVariable("id") Long id) {
		repositorio.delete(id);
	}
}
