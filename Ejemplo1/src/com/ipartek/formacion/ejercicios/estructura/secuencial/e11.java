package com.ipartek.formacion.ejercicios.estructura.secuencial;
/* 11: Programa que lea un n�mero entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
Por ejemplo para un n�mero N = 12345   La salida debe ser:
1
12
123
1234
12345 */

import java.util.Scanner;

public class e11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero entero de 5 cifras: ");

		int numero = sc.nextInt();
		System.out.println((numero / 10000));
		System.out.println((numero / 1000));
		System.out.println((numero / 100));
		System.out.println((numero / 10));
		System.out.println((numero / 1));

	}

}