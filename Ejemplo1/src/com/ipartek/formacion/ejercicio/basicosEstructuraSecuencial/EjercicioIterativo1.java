//Programa Java que muestre los n�meros del 1 al 100 utilizando la instrucci�n while
package com.ipartek.formacion.ejercicio.basicosEstructuraSecuencial;

public class EjercicioIterativo1 {
	public int number = 0;
		
	public void mostrarNumeros1() {
		System.out.println("Mpostrando numeros del 0 al 100");
		/*while(number<=100){
			System.out.print(number + ", ");
			number++;
		}*/
			do {
			System.out.print(number + ", ");
			number++;
		}while(number<=100);
	}

}
