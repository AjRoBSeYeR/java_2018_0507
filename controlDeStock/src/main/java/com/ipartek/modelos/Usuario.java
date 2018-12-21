package com.ipartek.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class Usuario {
	
	private int id;
	private String nombre;
	private String password;
	private String admin;

}
