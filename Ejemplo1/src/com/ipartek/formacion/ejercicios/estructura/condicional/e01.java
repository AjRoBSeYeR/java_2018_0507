package com.ipartek.formacion.ejercicios.estructura.condicional;

import java.util.Scanner;

/* 1. Programa Java que lea un n�mero entero por teclado y calcule si es par o impar.
Podemos saber si un n�mero es par si el resto de dividir el n�mero entre 2 es igual a cero.
En caso contrario el n�mero es impar
El operador Java que calcula el resto de la divisi�n entre dos n�meros enteros o no es el operador %
*/
public class e01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un n�mero entero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		if (numero % 2 == 0)
			System.out.println("Es par");
		else
			System.out.println("Es impar");

		sc.close();

	}

}
