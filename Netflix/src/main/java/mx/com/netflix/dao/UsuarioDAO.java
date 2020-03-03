package mx.com.netflix.dao;
import java.util.List;
import mx.com.netflix.models.Usuario;

public interface UsuarioDAO {
	public List<Usuario> consultar();
	
	public void eliminar(int id);

	public void actualizar(Usuario usuario);

	

	public List<Usuario> buscar_todos_usu(int subscripcion_id);

	public void insertarUsu(int id_subscripcion, Usuario usu);

	public Usuario buscar_usu(int subscripcion_id, int id_usuario);

}
