package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.util.Scanner;

/* 13:Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, a�o) y
 * calcule su n�mero de la suerte.
El n�mero de la suerte se calcula sumando el d�a, mes y a�o de la fecha de nacimiento y
a continuaci�n sumando las cifras obtenidas en la suma.

Por ejemplo:
Si la fecha de nacimiento es 12/07/1980 
Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999  1+9+9+9 = 28
N�mero de la suerte: 28
 */

public class e13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el d�a de tu cumplea�os: ");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes de tu cumplea�os: ");
		int mes = sc.nextInt();
		System.out.println("Introduce el a�o de tu cumplea�os: ");
		int ano = sc.nextInt();
		
		int numero = dia + mes + ano;
		System.out.println("Suma: " + numero);
		int millar = (numero/1000);
		int centena = (numero/100%10);
		int decena = (numero/10%10);
		int unidad = (numero%10);
		System.out.println(millar);
		System.out.println(centena);
		System.out.println(decena);
		System.out.println(unidad);
		
		System.out.println("El n�mero de la suerte es: " + (millar + centena + decena + unidad));
		sc.close();
	}

}
