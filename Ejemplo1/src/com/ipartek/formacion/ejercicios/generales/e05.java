package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Programa que lea una serie de n�meros por teclado hasta que
 * se lea un n�mero negativo. El programa indicar� cu�ntos n�meros 
 * acabados en 2 se han le�do.
 */
public class e05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		
		while (numero>=0) {
		System.out.println("Introduce un n�mero: ");
		numero = sc.nextInt();
		if (numero%10==2) contador++;
		
		}
		
		System.out.println("N�meros positivos acabados en 2 introducidos: " + contador);
		sc.close();

	}

}
