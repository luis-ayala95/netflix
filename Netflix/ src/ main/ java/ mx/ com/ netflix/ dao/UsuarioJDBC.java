package mx.com.netflix.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.netflix.models.Usuario;

@Repository
public class UsuarioJDBC implements UsuarioDAO {
//esta variable inyecta la conexion a la base de datos	
	@Autowired
	JdbcTemplate conexion;
//esta variable se utiliza para guardar codigo sql
	String sql;
	
	@Override
	public List<Usuario> consultar() {
		sql = "SELECT * FROM usuarios";
		return conexion.query(sql, new UsuarioRM());
	}
	
	@Override
	public void eliminar(int id) {
		sql= "DELETE FROM usuarios WHERE id=?";
		conexion.update(sql,id);
		
	}
	@Override
	public void actualizar(Usuario usuario) {
		sql="UPDATE usuarios SET nombre= ?, alias= ?, avatar_id= ?,subscripcion_id=? WHERE id= ?";
		conexion.update(sql,usuario.getNombre(), usuario.getAlias(), usuario.getAvatar_id(),usuario.getSubscripcion_id(),
				usuario.getId());
		
	}
	@Override
	public List<Usuario> buscar_todos_usu(int subscripcion_id) {
		// TODO Auto-generated method stub
		sql="select*from usuarios where subscripcion_id=?";
		return conexion.query(sql,new UsuarioRM(),subscripcion_id);
	}
	@Override
	public void insertarUsu(int id_subscripcion, Usuario usu) {
		sql="INSERT INTO usuarios (nombre,alias,avatar_id,subscripcion_id)VALUES(?,?,?,?)";
		conexion.update(sql, usu.getNombre(),usu.getAlias(),usu.getAvatar_id(),id_subscripcion);
		
	}
	@Override
	public Usuario buscar_usu(int id_subscripcion, int id_usuario) {
		sql= "SELECT * FROM usuarios WHERE id=? and subscripcion_id=?";
		return conexion.queryForObject(sql, new UsuarioRM(),id_subscripcion,id_usuario);
	
	}
}
