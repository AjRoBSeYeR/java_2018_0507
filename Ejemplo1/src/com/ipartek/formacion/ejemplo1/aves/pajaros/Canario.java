package com.ipartek.formacion.ejemplo1.aves.pajaros;

import com.ipartek.formacion.ejemplo1.DatosPersonales;
import com.ipartek.formacion.ejemplo1.aves.Ave;

/**
 * @class clase abstracta hereda de Ave
 * 
 *        Tiene como atributos el sexo (M/H), la edad (entero) y el tama�o
 *        (real). � La clase canario tiene dos constructores, uno inicializa el
 *        sexo y la edad seg�n dos par�metros que le llegan y otro tambi�n
 *        inicializa el tama�o. � Tiene un m�todo altura que dependiendo del
 *        tama�o del canario saca un mensaje por pantalla (�Alto� si tama�o >
 *        30, �Mediano� si tama�o [15..30] y �Bajo� si tama�o < 15)
 * 
 * @author AnaMAMM
 *
 */

public abstract class Canario extends Ave {

	/**
	 * variable tamano
	 */
	private Integer tamano;

	/**
	 * 
	 * @param sexo
	 * @param edad
	 */
	public Canario(char sexo, int edad) {

		super(sexo, edad);

	}

	
	
	public Canario() {
		super();
		
	}



	/**
	 * 
	 * @param sexo
	 * @param edad
	 * @param tamano
	 */
	public Canario(char sexo, int edad, Integer tamano, DatosPersonales dp) {

		super(sexo, edad, dp);
		this.tamano = tamano;
	}

	/**
	 * setter
	 * 
	 * @param tamano
	 */
	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}

	/**
	 * Tiene un m�todo altura que dependiendo del tama�o del canario saca un mensaje
	 * por pantalla (�Alto� si tama�o > 30, �Mediano� si tama�o [15..30] y �Bajo� si
	 * tama�o < 15)
	 */
	public void altura() {

		if (tamano != null) {

			if (tamano > 30) {

				System.out.println("Alto");

			} else if (tamano < 15) {
				System.out.println("Bajo");

			} else {
				System.out.println("Mediano");
			}

		}
	}

	/**
	 * metodo abstracto
	 */
	@Override
	public abstract void cantar();

}
