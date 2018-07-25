package com.ipartek.formacion.javaee.modelos;

public class LoginForm {
	private String nombre;
	private String password;
	
	private String mensajeError;

	public LoginForm() {
		this("","","");
	}
	
	public LoginForm(String nombre, String password) {
		this(nombre,password,"");
	}

	public LoginForm(String nombre, String password, String mensajeError) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.mensajeError = mensajeError;
	}

	@Override
	public String toString() {
		return "LoginForm [nombre=" + nombre + ", password=" + password + ", mensajeError=" + mensajeError + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	
}	
