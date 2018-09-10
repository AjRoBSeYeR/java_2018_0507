package com.ipartek.formacion.uf2216rec.accesoDatos;

import java.util.ArrayList;
import java.util.List;
import com.ipartek.formacion.uf2216rec.pojo.StockMoviles;

public class StockMovilesArrayDAO implements CrudAble<StockMoviles> {
	
	private List<StockMoviles> moviles = new ArrayList<>();
	
	private static StockMovilesArrayDAO INSTANCE;
	
	private StockMovilesArrayDAO() {}
	
	public static synchronized StockMovilesArrayDAO getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new StockMovilesArrayDAO();
		}
		return INSTANCE;
	}

	@Override
	public List<StockMoviles> getAll() {
		return moviles;
	}

	@Override
	public StockMoviles getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(StockMoviles movil) {
		boolean result = false;

		if (movil != null) {
			result = moviles.add(movil);
		}
		return result;
		}

	@Override
	public boolean update(StockMoviles movil) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}