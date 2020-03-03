package mx.com.netflix.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import mx.com.netflix.models.Subscripcion;
public class SubscripcionRM implements RowMapper<Subscripcion> {
	@Override
public Subscripcion mapRow(ResultSet rs, int rowNum)throws SQLException{
	Subscripcion subscripcion= new Subscripcion();
	subscripcion.setId(rs.getInt("id"));
	subscripcion.setTipo(rs.getInt("tipo"));
	subscripcion.setPrecio(rs.getInt("precio"));
	subscripcion.setFecha_inicio(rs.getString("fecha_inicio"));
	subscripcion.setFecha_fin(rs.getString("fecha_fin"));
	subscripcion.setVencida(rs.getBoolean("vencida"));
	return subscripcion;
}
}
