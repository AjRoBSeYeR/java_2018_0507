package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

// pide un n�mero entero por teclado y calcula y muestra el n�mero de cifras que tiene.
public class e02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Introduce un n�mero: ");
Scanner sc = new Scanner(System.in);
int numero = sc.nextInt();
int contador = 1;
while ((numero/10)!=0) {
	numero=numero/10;
			contador++;
}

System.out.println("El n�mero de cifras es: " + contador);
sc.close();
	}

}
