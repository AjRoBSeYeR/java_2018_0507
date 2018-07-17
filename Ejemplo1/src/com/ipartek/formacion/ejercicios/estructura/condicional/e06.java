package com.ipartek.formacion.ejercicios.estructura.condicional;

import java.io.IOException;

/* 6: Programa java que lea un car�cter por teclado y compruebe si es un d�gito num�rico 
 * (cifra entre 0 y 9).
Vamos a escribir dos soluciones a este ejercicio. 
La primera consiste en comprobar si el car�cter es un d�gito mediante el m�todo isDigit
 de la clase Character. Este m�todo devuelve true si el car�cter que se le pasa como
  par�metro es una cifra entre 0 y 9: */
public class e06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un car�cter: ");
		char caracter = (char) System.in.read();
		
		if (Character.isDigit(caracter))
			System.out.println("El caracter es un n�mero");
		else System.out.println("El caracter NO es un n�mero");

	}

}
