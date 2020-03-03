package mx.com.netflix.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import mx.com.netflix.dao.SubscripcionDAO;
import mx.com.netflix.models.Subscripcion;



@RestController
@RequestMapping("/procedimientos")
public class OpcionesDOS {
@Autowired 
SubscripcionDAO repositorio;
@GetMapping("servicio3")
public String enviarSaludo() {
	return "Bienvenido WS";
}

@GetMapping("subscripciones")
public List<Subscripcion> consultarSubscripciones(){
	return  repositorio.consultar();
}

@PostMapping("/subscripcion/")
public void insetarSubscripcion(@RequestBody Subscripcion subscripcion) {
	repositorio.insertar_sub(subscripcion);
}
@GetMapping("Subscripciones/{id_subscripcion}")
public Subscripcion buscar_subs(@PathVariable int id_subscripcion) {
	return repositorio.buscar_subs(id_subscripcion);
	
}
@DeleteMapping("subscripciones/{id}")
public void eliminarSubscripcion(@PathVariable int id) {
	 repositorio.eliminar(id);
	
}
	
@PutMapping("/subscripciones/{id_subscripcion}")
public void actualizar_subs(@RequestBody Subscripcion subscripcion,@PathVariable int id_subscripcion) {
	repositorio.actualizar_subs(subscripcion,id_subscripcion);
}


}

