package mx.com.netflix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.netflix.models.Capitulos;
import mx.com.netflix.models.Peliculas;
import mx.com.netflix.models.Series;
import mx.com.netflix.models.Temporadas;

@Repository
public class SerieJDBC implements SerieDAO {
	@Autowired
	JdbcTemplate conexion;
	String sql;
	@Override
	public List<Series> consultarSeriesCategoria(String categoria) {
		sql= "select * from  series where categoria = ?";
		return conexion.query(sql, new SerieRM(),categoria);
	}

	@Override
	public List<Temporadas> consultarTemporadas(int serie_id) {
		sql="select*from temporadas where serie_id=?";
		return conexion.query(sql, new TemporadaRM(), serie_id);
	}

	@Override
	public List<Temporadas> buscarTemporadas(int serie_id, int temporadas_id) {
		sql="select*from temporadas where serie_id=? and id= ?";
		return conexion.query(sql, new TemporadaRM(),serie_id, temporadas_id);
	}

	@Override
	public List<Capitulos> consultarCapitulos(int serie_id, int temporadas_id) {
		sql=" select*from capitulos c \r\n" + 
				" join temporadas t on t.id=c.temporada_id \r\n" + 
				" join series s on s.id=t.serie_id \r\n" + 
				" where t.id=? and s.id= ?;";
		return conexion.query(sql, new CapituloRM(), serie_id, temporadas_id);
	}

	@Override
	public Capitulos buscarCapitulos(int serie_id, int temporadas_id, int capitulos_id) {
		sql=" select*from capitulos c \r\n" + 
				" join temporadas t on t.id=c.temporada_id \r\n" + 
				" join series s on s.id=t.serie_id \r\n" + 
				" where t.id=? and s.id= ? and c.id= ?";
		return conexion.queryForObject(sql, new CapituloRM(),serie_id,temporadas_id, capitulos_id);
	}

	@Override
	public List<Peliculas> consultarPeliculasCategoria(String categoria) {
		sql= "select * from  peliculas where categoria = ?";
		return conexion.query(sql, new PeliculaRM(),categoria);
		
	}

	@Override
	public Peliculas buscarPelicula(int id_pelicula) {
		sql="SELECT * FROM peliculas WHERE id= ?";
		return conexion.queryForObject(sql, new PeliculaRM(), id_pelicula);
	}

}
