package com.ipartek.formacion.ejercicios.estructura.secuencial;

import java.io.Console;
import java.util.Scanner;

public class e07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
        double cateto1, cateto2;
        System.out.print("Introduzca longitud del primer cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Introduzca longitud del segundo cateto: ");
        cateto2 = sc.nextDouble();
      System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2)));

	}

}
