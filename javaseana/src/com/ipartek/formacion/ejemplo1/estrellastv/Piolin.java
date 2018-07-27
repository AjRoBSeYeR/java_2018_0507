package com.ipartek.formacion.ejemplo1.estrellastv;

import com.ipartek.formacion.ejemplo1.DatosPersonales;
import com.ipartek.formacion.ejemplo1.aves.pajaros.Canario;

/**
 * @class abstracta hereda de Canario Tiene como atributos el sexo (M/H), la
 *        edad (entero) y el n�mero de pel�culas (entero). � Su constructor
 *        inicializa todos los atributos con valores que le llegan como
 *        par�metros. � En esta clase se encuentra el programa principal en el
 *        cual se crea una instancia de la clase Piolin y otro de la clase loro.
 *        � Llamar al m�todo quienSoy de las dos instancias � Llamar al m�todo
 *        altura con la instancia del Piol�n � Invocar al m�todo deDondeEres con
 *        la instancia del Loro � Modificar el tama�o del Piol�n y volver a
 *        invocar al m�todo altura � Modificar la regi�n del Loro � Mostrar el
 *        n�mero de Aves creadas.
 * @author AnaMAMM
 *
 */
public class Piolin extends Canario {

	/**
	 * atributos de instancia
	 */
	private int numeroPeliculas;

	/**
	 * Constructor con argumentos
	 * 
	 * @param sexo
	 * @param edad
	 * @param tamano
	 * @param numeroPeliculas
	 */
	public Piolin(char sexo, int edad, Integer tamano, int numeroPeliculas,DatosPersonales dp) {

		super(sexo, edad, tamano,dp);
		this.numeroPeliculas = numeroPeliculas;
	

	}

	/**
	 * La clase Ave tendr� un m�todo abstracto que ser� cantar. Para un Piol�n
	 * cantar ser� sacar el mensaje �Pio-pio soy un Piol�n�
	 */
	@Override
	public void cantar() {
		System.out.println("Pio-pio soy un Piol�n");

	}

}
