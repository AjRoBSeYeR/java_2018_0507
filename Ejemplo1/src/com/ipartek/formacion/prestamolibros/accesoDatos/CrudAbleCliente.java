package com.ipartek.formacion.prestamolibros.accesoDatos;

import com.ipartek.formacion.uf2216.accesoDatos.CrudAble;

public interface CrudAbleCliente<P> extends CrudAble<P> {

	/**
	 * Buscamos un cliente por su dni
	 * @param id string identificador
	 * @return P pojo si no lo encuentra, null si no encuentra
	 * */
	P getByDni(String dni);
}