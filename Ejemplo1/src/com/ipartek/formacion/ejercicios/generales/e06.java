package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/*  calcular si un n�mero es perfecto
 * Un n�mero es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio n�mero.
 */
public class e06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un n�mero: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int suma = 0;

		for (int i = 1; i < numero; i++) {
			if (numero%i==0) {
				System.out.println(i);
				suma = suma + i;
			}
		}
		if (suma==numero) System.out.println("El n�mero es perfecto"); else System.out.println("El n�mero NO es perfecto");;
		sc.close();
	}

}
