package mx.com.netflix.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.netflix.dao.SerieDAO;
import mx.com.netflix.models.Capitulos;
import mx.com.netflix.models.Peliculas;
import mx.com.netflix.models.Series;
import mx.com.netflix.models.Temporadas;


@RestController
@RequestMapping("/procedimientos")
public class OpcionesTRES {
	@Autowired 
	SerieDAO repositorio;
	/*series*/
	@GetMapping("series")
	public List<Series>consultarSeriesCategoria(@RequestParam String categoria){
		return repositorio.consultarSeriesCategoria(categoria);
		

		
	}
	/*temporadas*/
	@GetMapping("series/{id}/temporadas")
	public List<Temporadas>consultarTemporadas(@PathVariable int id){
		return repositorio.consultarTemporadas(id);
	}
	@GetMapping("/series/{serie_id}/temporadas/{temporadas_id}")
	public List<Temporadas> buscarTemporadas(@PathVariable int serie_id,@PathVariable int temporadas_id) {
		return repositorio.buscarTemporadas(serie_id, temporadas_id);

	}
	/*capitulos*/
	@GetMapping("series/{serie_id}/temporadas/{temporadas_id}/capitulos")
	public List<Capitulos>consultarCapitulos(@PathVariable int serie_id,@PathVariable int temporadas_id){
		return repositorio.consultarCapitulos(serie_id,temporadas_id);
	}
	@GetMapping("series/{serie_id}/temporadas/{temporadas_id}/capitulos/{capitulos_id}")
	public Capitulos burcarCapitulos(@PathVariable int serie_id,
			@PathVariable int temporadas_id, @PathVariable int capitulos_id) {
		return  repositorio.buscarCapitulos(serie_id,temporadas_id,capitulos_id);
	}
	@GetMapping("peliculas")
	public List<Peliculas>consultarPeliculasCategoria(@RequestParam String categoria){
		return repositorio.consultarPeliculasCategoria(categoria);
	}
	@GetMapping("peliculas/{id_pelicula}")
	public Peliculas buscarPelicula(@PathVariable int id_pelicula) {
		return repositorio.buscarPelicula(id_pelicula);
	}
}
