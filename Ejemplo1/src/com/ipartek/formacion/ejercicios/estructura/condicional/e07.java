package com.ipartek.formacion.ejercicios.estructura.condicional;

import java.io.IOException;
import java.util.Scanner;

/* 7: Programa que lea dos n�meros por teclado y muestre el resultado de la divisi�n del primer n�mero 
 * por el segundo. Se debe comprobar que el divisor no puede ser cero. */

public class e07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un n�mero: ");
		
		Scanner sc = new Scanner(System.in);
		int numero1 = sc.nextInt();
		
		
		System.out.println("Introduzca un n�mero: ");
		int numero2 = sc.nextInt();
		if (numero2 !=0)
		System.out.println("Divisi�n primero/segundo: " + (numero1/numero2));
		else
			System.out.println("El divisor no puede ser cero");
		
		sc.close();
	}

}
