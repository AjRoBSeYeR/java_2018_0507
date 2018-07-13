package com.ipartek.formacion.ejercicio1.poo;

/*Se crear� una nueva clase llamada DatosPersonales, que tendr� como
atributos el nombre del ave (String) y el nombre del due�o (String). Tendr� un
constructor de clase en el que se inicialicen estos atributos y los m�todos
get/set para cada uno de los atributos, por separado 
 * */
public class DatosPersonales {
	private String nombreAve;
	private String nombreDuenyo;
	
	public DatosPersonales(String nombreAve, String nombreDuenio) {
		setNombreAve(nombreAve);
		setNombreDuenyo(nombreDuenio);
	}

	public String getNombreAve() {
		return nombreAve;
	}

	public void setNombreAve(String nombreAve) {
		this.nombreAve = nombreAve;
	}

	public String getNombreDuenyo() {
		return nombreDuenyo;
	}

	public void setNombreDuenyo(String nombreDuenyo) {
		this.nombreDuenyo = nombreDuenyo;
	}
	

}
