package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

//  lea un n�mero entero N y muestre la tabla de multiplicar de ese n�mero.
public class e04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un n�mero para ver su tabla: ");
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for (int i = 1; i <=10; i++)
			System.out.println(numero + " x " + i + " = " + numero*i);
		
		sc.close();

	}

}
