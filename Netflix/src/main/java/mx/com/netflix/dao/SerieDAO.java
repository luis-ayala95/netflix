package mx.com.netflix.dao;

import java.util.List;

import mx.com.netflix.models.Capitulos;
import mx.com.netflix.models.Peliculas;
import mx.com.netflix.models.Series;
import mx.com.netflix.models.Temporadas;


public interface SerieDAO {

	List<Series> consultarSeriesCategoria(String categoria);

	List<Temporadas> consultarTemporadas(int id);

	List<Temporadas> buscarTemporadas(int serie_id, int temporadas_id);

	List<Capitulos> consultarCapitulos(int serie_id, int temporadas_id);

	Capitulos buscarCapitulos(int serie_id, int temporadas_id, int capitulos_id);

	List<Peliculas> consultarPeliculasCategoria(String categoria);

	Peliculas buscarPelicula(int id_pelicula);

	



	



	

}
