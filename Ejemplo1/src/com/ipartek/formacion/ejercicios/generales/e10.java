package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

public class e10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long numero, aux, digito, decimal;
		int exponente;
		boolean esBinario;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un numero binario: ");
			numero = sc.nextLong();
			esBinario = true;
			aux = numero;
			while (aux != 0) {
				digito = aux % 10; // �ltima cifra del n�meros
				if (digito != 0 && digito != 1) { // si no es 0 � 1
					esBinario = false; // no es un n�mero binario
				}
				aux = aux / 10; // quitamos la �ltima cifra para repetir el proceso
			}
		} while (!esBinario); // se vuelve a pedir si no es binario

		// proceso para pasar de binario a decimal
		exponente = 0;
		decimal = 0; // ser� el equivalente en base decimal
		while (numero != 0) {
			// se toma la �ltima cifra
			digito = numero % 10;
			// se multiplica por la potencia de 2 correspondiente y se suma al n�mero
			decimal = decimal + digito * (int) Math.pow(2, exponente);
			// se aumenta el exponente
			exponente++;
			// se quita la �ltima cifra para repetir el proceso
			numero = numero / 10;
		}
		System.out.println("Decimal: " + decimal);
		sc.close();
	}

}
