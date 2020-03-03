package mx.com.netflix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.netflix.models.Capitulos;

public class CapituloRM implements RowMapper<Capitulos>{

@Override
public Capitulos mapRow(ResultSet rs, int rowNum) throws SQLException {
	Capitulos capitulos=new Capitulos();
	capitulos.setId(rs.getInt("id"));
	capitulos.setNombre(rs.getString("nombre"));
	capitulos.setDuracion(rs.getInt("duracion"));
	capitulos.setDescripcion(rs.getString("descripcion"));
	capitulos.setTemporada_id(rs.getInt("temporada_id"));
	return capitulos;
}
}
