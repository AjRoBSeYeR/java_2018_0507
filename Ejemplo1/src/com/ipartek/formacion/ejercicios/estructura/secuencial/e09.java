package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/* 9:
Programa Java que calcule el �rea de un tri�ngulo en funci�n de las longitudes de sus lados (a, b, c), 
seg�n la siguiente f�rmula:  
	Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
	donde p =  (a+b+c)/2
Para calcular la ra�z cuadrada se utiliza el m�todo Math.sqrt()  */

public class e09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud del lado A: ");
		double ladoA = sc.nextDouble();
		System.out.println("Introduce la longitud del lado B: ");
		double ladoB = sc.nextDouble();
		System.out.println("Introduce la longitud del lado C: ");
		double ladoC = sc.nextDouble();
		
		double p = ((ladoA+ladoB+ladoC)/2);
		System.out.println("El �rea del tri�ngulo es: " + Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC)));
		sc.close();
	}

}
