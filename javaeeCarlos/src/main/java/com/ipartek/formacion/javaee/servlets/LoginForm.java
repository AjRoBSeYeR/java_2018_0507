package com.ipartek.formacion.javaee.servlets;

public class LoginForm {

	private String nombre;
	private String contrase�a;
	private String mensajeError;
	
	public LoginForm(String nombre, String contrase�a, String mensajeError) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.mensajeError = mensajeError;
	}
	public LoginForm(String nombre, String contrase�a) {
		this.nombre = nombre;
		this.contrase�a = contrase�a;
	}
	public LoginForm() {
		this("","","");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public String getMensajeError() {
		return mensajeError;
	}
	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	
	

	
}
