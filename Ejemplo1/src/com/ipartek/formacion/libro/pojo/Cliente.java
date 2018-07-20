
package com.ipartek.formacion.libro.pojo;

import java.util.List;

public class Cliente {
	private long id;
	private String dni; //TODO: private Dni dni;
	private String nombre;
	private String apellidos;
	private List<Libro> librosPrestados;

	
	public Cliente(long id, String dni, String nombre, String apellidos, List<Libro> librosPrestados) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.librosPrestados = librosPrestados;
	}

	public Cliente() throws InstantiationException, IllegalAccessException {
		this(-1, "", "","",null);
	}
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public List<Libro> getLibrosPrestados() {
		return librosPrestados;
	}
	public void setLibrosPrestados(List<Libro> librosPrestados) {
		this.librosPrestados = librosPrestados;
	}
	
	
}