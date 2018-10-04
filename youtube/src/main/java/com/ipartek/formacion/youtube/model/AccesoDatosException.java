package com.ipartek.formacion.youtube.model;

public class AccesoDatosException extends RuntimeException  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5645796919004447678L;
	public AccesoDatosException() {
	}

	public AccesoDatosException(String message) {
		super(message);
	}

	public AccesoDatosException(Throwable cause) {
		super(cause);
	}

	public AccesoDatosException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccesoDatosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
}
}
