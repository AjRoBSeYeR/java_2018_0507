package com.ipartek.formacion.ejercicios.estructura.condicional;
/* 5: Programa java que lea dos caracteres por teclado y compruebe si los dos son letras min�sculas */

public class e05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un caracter: ");
		char caracter1 = (char) System.in.read();
		
		System.in.read();System.in.read(); //meto dos read xq en windows los saltos de linea son dos caracteres
		
		System.out.println("Introduce otro caracter: ");
		char caracter2 = (char) System.in.read();
		
		if (Character.isLowerCase(caracter1)&&Character.isLowerCase(caracter2))
			System.out.println("Son min�sculas");
		else
			System.out.println("Ambas no son min�sculas");
	}

}
