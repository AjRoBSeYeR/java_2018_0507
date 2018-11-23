package com.ipartek.formacion.librosspring.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

import com.ipartek.formacion.librosspring.models.Libro;

@Component
public class LibroMapRepository implements CrudAble<Libro>{
	private TreeMap<Long, Libro> libros = new TreeMap<Long, Libro>();

	public LibroMapRepository() {
		libros.put(1L, new Libro(1L, "El señor de los anillos", "1234567891235"));
		libros.put(2L, new Libro(2L, "Frankenstein", "3216549875632"));
	}

	@Override
	public List<Libro> getAll() {
		return new ArrayList<Libro>(libros.values());
	}

	@Override
	public Libro getById(Long id) {
		return libros.get(id);
	}

	@Override
	public Long insert(Libro e) {
		Long idAnterior;

		if (libros.size() == 0)
			idAnterior = 0L;
		else
			idAnterior = libros.lastKey();

		e.setId(idAnterior + 1);

		libros.put(e.getId(), e);

		return e.getId();
	}

	@Override
	public void update(Libro e) {
		libros.put(e.getId(), e); // Si ya existe el id sustituye el objeto en lugar de crear uno nuevo
	}

	@Override
	public void delete(Long id) {
		libros.remove(id);
	}
}