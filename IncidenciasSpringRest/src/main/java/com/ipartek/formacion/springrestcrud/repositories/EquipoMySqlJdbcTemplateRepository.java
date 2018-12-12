package com.ipartek.formacion.springrestcrud.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ipartek.formacion.springrestcrud.entidades.Equipo;


@Repository
public class EquipoMySqlJdbcTemplateRepository implements CrudAble<Equipo> {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Equipo> getAll() {
		return jdbcTemplate.query("select * from equipo", new EquipoMapper());
	}

	private static final class EquipoMapper implements RowMapper<Equipo> {
		public Equipo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Equipo(rs.getLong("id"),rs.getString("nombre"));
		}
	}

	@Override
	public Equipo getById(Long id) {
		return jdbcTemplate.queryForObject("select * from equipo where id=?", new Object[] { id },
				new EquipoMapper());
	}

	@Override
	public void insert(Equipo equipo) {
		jdbcTemplate.update("insert into equipo (nombre) values (?)",
				new Object[] {equipo.getNombre()});

	}

	@Override
	public void update(Equipo equipo) {
		jdbcTemplate.update("update equipo set nombre=? where id=?",
				new Object[] { 
						equipo.getNombre(),equipo.getId() });
	}

	@Override
	public void delete(Long id) {
		
		//TODO:Hacer??
		jdbcTemplate.update("delete from equipo where id=?", new Object[] { id });
		
	}	
}