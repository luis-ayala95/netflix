package mx.com.netflix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import mx.com.netflix.models.Usuario;
public class UsuarioRM implements RowMapper<Usuario> {
	 @Override
	 public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException{
		 Usuario usuario= new Usuario();
		 usuario.setId(rs.getInt("id"));
		 usuario.setNombre(rs.getString("nombre"));
		 usuario.setAlias(rs.getString("alias"));
		 usuario.setAvatar_id(rs.getInt("avatar_id"));
		 usuario.setSubscripcion_id(rs.getInt("subscripcion_id"));
		 return usuario;
	 }
}
