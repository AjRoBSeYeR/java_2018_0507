package com.ipartek.formacion.ejercicios.estructura.condicional;
/* 2. Programa que lea un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
Podemos comprobar si un n�mero entero es m�ltiplo de 10 si al dividirlo por 10
es resto de esta divisi�n es cero. */

import java.util.Scanner;

public class e02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un n�mero entero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();

		if (numero % 10 == 0)
			System.out.println("Es m�ltiplo de 10");
		else
			System.out.println("No es m�ltiplo de 10");

		sc.close();
	}

}
