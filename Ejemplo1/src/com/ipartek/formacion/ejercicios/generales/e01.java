package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/* 
 * Programa que lea dos variables 
 * num�ricas A y B e 
 * intercambie sus contenidos. 
 */
public class e01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un n�mero: ");
		Scanner sc = new Scanner(System.in);
		int variableA = sc.nextInt();
		
		System.out.println("Introduce otro n�mero: ");
		int variableB = sc.nextInt();
		
		int variableC= variableA;
		variableA=variableB;
		variableB=variableC;
		
		System.out.println("Las variables son: " + variableA + " y "+ variableB);
		
		sc.close();
	}

}
