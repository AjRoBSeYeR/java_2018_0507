package com.ipartek.formacion.springrestcrud.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.springrestcrud.entidades.Comentario;
import com.ipartek.formacion.springrestcrud.entidades.Estado;
import com.ipartek.formacion.springrestcrud.entidades.Incidencia;
import com.ipartek.formacion.springrestcrud.entidades.Usuario;


@Repository
public  class EstadoMySqlJdbcTemplateRepository implements CrudAble<Estado> {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Estado> getAll() {
		return jdbcTemplate.query("select * from estado", new EstadoMapper());
	}

	private static final class EstadoMapper implements RowMapper<Estado> {
		public Estado mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Estado(rs.getLong("id"),rs.getString("estado"));
		}
	}

	@Override
	public Estado getById(Long id) {
		return jdbcTemplate.queryForObject("select * from estado where id=?", new Object[] { id },
				new EstadoMapper());
	}

	@Override
	public void insert(Estado estado) {
		jdbcTemplate.update("insert into estado (estado) values (?)",
				new Object[] {estado.getEstado()});

	}

	@Override
	public void update(Estado estado) {
		jdbcTemplate.update("update estado set estado=? where id=?",
				new Object[] { 
						estado.getEstado(),estado.getId() });
	}
	
	@Override
	public List<Estado> getByEquipo(String equipo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Incidencia> getByUsuario(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Incidencia> getByEstado(String estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Comentario> getByIdIncidencia(String incidencia_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getUsuarioLogin(String usuario, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
