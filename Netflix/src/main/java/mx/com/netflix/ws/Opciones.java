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
import mx.com.netflix.dao.UsuarioDAO;
import mx.com.netflix.models.Usuario;




@RestController
@RequestMapping("/procedimiento")
public class Opciones {
	@Autowired
	UsuarioDAO repositorio;
@GetMapping("servicio2")
public String enviarSaludo() {
	return "Bienvenido WS";
}
@GetMapping("usuario")
public Usuario mostrarUsuario() {
	Usuario usuario =new Usuario();
	usuario.setNombre("Aylin");
	usuario.setAlias("bebesita");
	usuario.setAvatar_id(1);
	usuario.setSubscripcion_id(2);
	return usuario;
}

@GetMapping("usuarios")
public List<Usuario> consultarUsuarios(){
	return  repositorio.consultar();
}
@PostMapping("/subscripciones/{id_subscripcion}/usuarios")
public void insetarUsu(@PathVariable int id_subscripcion,@RequestBody Usuario usu) {
	repositorio.insertarUsu(id_subscripcion,usu);
}
@GetMapping("/subscripciones/{id_subscripcion}/usuarios/{id_usuario}")
public Usuario buscar_usuario(@PathVariable int id_subscripcion,@PathVariable int id_usuario) {
	return repositorio.buscar_usu(id_subscripcion,id_usuario);
	
}
@DeleteMapping("usuarios/{id}")
public void eliminarUsuario(@PathVariable int id) {
	 repositorio.eliminar(id);
	
}

@PutMapping("Usuarios")
public void actualizarUsuario(@RequestBody Usuario usuario) {
	repositorio.actualizar(usuario);
}
@GetMapping("/subscripcionestodas/{subscripcion_id}/usuarios/")
public List<Usuario> buscar_todos_usu(@PathVariable int subscripcion_id) {
	return repositorio.buscar_todos_usu(subscripcion_id);
}
}
