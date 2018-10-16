package com.ipartek.formacion.examen.txakuretxe.accesodatos;

import java.util.List;

public interface CrudAble<T> {
	public List<T> getAll();
	public T getById(long id);
	public void insert(T objeto);

}