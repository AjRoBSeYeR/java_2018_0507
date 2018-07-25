package com.ipartek.formacion.javaee.servlets;

public class LoginForm {

	private String nombre = "";
	private String contrase�a = "";
	private String mensajeError;
	private String mensajeErrorUsuario;
	private String mensajeErrorClave;
	
	public LoginForm(String nombre, String contrase�a, String mensajeError,
			String mensajeErrorUsuario, String mensajeErrorClave) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
		this.mensajeError = mensajeError;
		this.mensajeErrorUsuario = mensajeErrorUsuario;
		this.mensajeErrorClave = mensajeErrorClave;
	}
	public LoginForm(String nombre, String contrase�a) {
		this.nombre = nombre;
		this.contrase�a = contrase�a;
	}
	public LoginForm() {
		this("","","","","");
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
	public String getMensajeErrorUsuario() {
		return mensajeErrorUsuario;
	}
	public void setMensajeErrorUsuario(String mensajeErrorUsuario) {
		this.mensajeErrorUsuario = mensajeErrorUsuario;
	}
	public String getMensajeErrorClave() {
		return mensajeErrorClave;
	}
	public void setMensajeErrorClave(String mensajeErrorClave) {
		this.mensajeErrorClave = mensajeErrorClave;
	}
	
	

	
}
