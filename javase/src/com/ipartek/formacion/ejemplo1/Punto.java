package com.ipartek.formacion.ejemplo1;

/**
 * Clase que representa un punto en el plano
 * @author javierlete
 *
 */

public class Punto {
	public static final int DEFAULT_Y = 1;
	public static final int DEFAULT_X = 1;
	
	/**
	 * Valor m�ximo admitido para la x
	 */
	public static final int MAX_X = 10000;
	public static final int MAX_Y = 10000;
	
	private int x, y;

	@Override
	public Object clone() {	
		return new Punto(x, y);
	}

	public Punto(int x, int y) {
		setX(x); setY(y);
	}
	
	/**
	 * Se contruye un punto basado en un solo valor
	 * @param xy valor que se usar� tanto para la x como para la y
	 */
	public Punto(int xy) {
		this(xy, xy);
	}
	
	public Punto() {
		this(DEFAULT_X,DEFAULT_Y); //x = 1; y = 1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x > MAX_X)
			throw new PuntoException("No se admiten x mayores de " + MAX_X);
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	// Punto total = p.sumar(p2);
	public Punto sumar(Punto otroPunto) {
		return new Punto(this.getX() + otroPunto.getX(), this.getY() + otroPunto.getY());
	}
	
	// Punto total = Punto.sumar(p1, p2);
	public static Punto sumar(Punto unPunto, Punto otroPunto) {
		return unPunto.sumar(otroPunto);
	}
}
