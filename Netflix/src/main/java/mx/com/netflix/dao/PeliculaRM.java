package mx.com.netflix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.com.netflix.models.Peliculas;


public class PeliculaRM implements RowMapper<Peliculas>{

	@Override
	public Peliculas mapRow(ResultSet rs, int rowNum) throws SQLException {
		Peliculas peliculas= new Peliculas();
		peliculas.setId(rs.getInt("id"));
		peliculas.setNombre(rs.getString("nombre"));
		peliculas.setDescripcion(rs.getString("descripcion"));
		peliculas.setAnio(rs.getInt("anio"));
		peliculas.setDuracion(rs.getInt("duracion"));
		peliculas.setClasificacion(rs.getString("clasificacion"));
		peliculas.setCategoria(rs.getString("categoria"));
		return peliculas;
	}


}
