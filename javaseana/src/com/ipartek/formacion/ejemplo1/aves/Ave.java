package com.ipartek.formacion.ejemplo1.aves;

import com.ipartek.formacion.ejemplo1.DatosPersonales;

/**
 * @class abstracta padre
 * 
 * 
 *        Tiene como atributos de instancia el sexo (M/H), la edad (entero) y
 *        como atributo de clase el n�mero de aves creadas, que se incrementa
 *        cada vez que se crea un nuevo Ave � Tiene como m�todo el constructor
 *        que inicializa, con los par�metros que recibe, los dos atributos de la
 *        clase. � Adem�s existe un m�todo de clase que indica el n�mero de Aves
 *        creadas � Adem�s tiene un m�todo quienSoy que saca los valores de los
 *        dos atributos por pantalla
 * 
 * 
 * 
 * @author AnaMAMM
 *
 */

public abstract class Ave {

	/**
	 * atributos de instancia
	 * 
	 */
	private char sexo;
	private int edad;

	private DatosPersonales nombres;

//getters y setters
	/**
	 * getter
	 * 
	 * @return sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * setter
	 * 
	 * @param sexo
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * getter
	 * 
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * setter
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * getter
	 * 
	 * @return nombres
	 */
	public DatosPersonales getNombres() {
		return nombres;
	}

	/**
	 * setter
	 * 
	 * @param nombres
	 */
	public void setNombres(DatosPersonales nombres) {
		this.nombres = nombres;
	}

	/**
	 * getter
	 * 
	 * @return numAvesCreadas
	 */
	public static Integer getNumAvesCreadas() {
		return numAvesCreadas;
	}

	/**
	 * setter
	 * 
	 * @param numAvesCreadas
	 */
	public static void setNumAvesCreadas(Integer numAvesCreadas) {
		Ave.numAvesCreadas = numAvesCreadas;
	}

	/**
	 * atributos de clase static
	 * 
	 * numero de aves creadas
	 */
	public static Integer numAvesCreadas = 0;

	/**
	 * constructor sin parametros para sexo y edad
	 */
	public Ave() {
		this.sexo = sexo;
		this.edad = edad;
		numAvesCreadas++;

	}

	/**
	 * Constructor
	 * 
	 * @param sexo
	 * @param edad
	 */
	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		numAvesCreadas++;

	}

	public Ave(char sexo, int edad, DatosPersonales datosPersonales) {
		this.sexo = sexo;
		this.edad = edad;
		this.nombres = datosPersonales;
		numAvesCreadas++;
	}

	/**
	 * metodo void quienSoy que saca los valores de los dos atributos por pantalla
	 * el sexo y la edad del ave
	 */
	public void quienSoy() {
		System.out.println("Sexo: " + sexo + "Edad: " + edad);
	}

	/**
	 * muestra las aves creadas
	 */
	public static void mostrarAvesCreadas() {
		System.out.println(numAvesCreadas);
	}

	/**
	 * metodo abstracto cantar se implementar� en las demas clases cada uno se
	 * sobreescribir� en su clase La clase Ave tendr� un m�todo abstracto que ser�
	 * cantar. Para un Piol�n cantar ser� sacar el mensaje �Pio-pio soy un Piol�n� y
	 * para un Loro cantar ser� sacar un mensaje diciendo �Piiio-piiiio loro bonito�
	 */
	public abstract void cantar();

}
