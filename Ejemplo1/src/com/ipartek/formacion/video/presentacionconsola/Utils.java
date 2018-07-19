package com.ipartek.formacion.video.presentacionconsola;

import java.util.InputMismatchException;
import java.util.Scanner;

//funciones generales que necesitare en muchos sitios

public class Utils {
	private static Scanner s = new Scanner (System.in);
	
	public static String leerLinea() {
		return s.nextLine();
	}
	
	public static long leerLong() {
		long l = s.nextLong();
		s.nextLine();
		return l;
	}
	
	public static int leerInt() {
		int i = 0;
		boolean hayQueRepetir;
		
		do {
			try { 
				hayQueRepetir = false;
				i = s.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Por davor, introduce un numero entero sin comas ni puntos");
				s.nextLine(); //asi vac�o el buffer del escaner
				hayQueRepetir = true;
			}catch (Exception e) { //si ocurre un error inesperado
				System.out.println("Error no esperado");
				throw e;
			}
		}while(hayQueRepetir);
		
		s.nextLine();
		return i;
	}

}
