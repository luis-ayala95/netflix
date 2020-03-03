package mx.com.netflix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.netflix.models.Temporadas;

public class TemporadaRM implements RowMapper<Temporadas> {

@Override
public Temporadas mapRow(ResultSet rs, int rowNum) throws SQLException {
	Temporadas temporadas= new Temporadas();
	temporadas.setId(rs.getInt("id"));
	temporadas.setNombre(rs.getString("nombre"));
	temporadas.setSerie_id(rs.getInt("serie_id"));
	return temporadas;
}
}
