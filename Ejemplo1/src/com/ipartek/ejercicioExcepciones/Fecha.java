package com.ipartek.ejercicioExcepciones;

public class Fecha {
	private int a�o = 1;
	private int mes = 1;
	private int dia = 1;

	public static final int MESES_A�O = 12;
	public Fecha() {
		
	}
	public void set(int a�o, int mes, int dia)
	{
		
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public static int getMesesA�o() {
		return MESES_A�O;
	}

	@Override
	public String toString() {
		return "Fecha [a�o=" + a�o + ", mes=" + mes + ", dia=" + dia + "]";
	}

//	public static boolean esBisiesto(int a�o);

	
}
