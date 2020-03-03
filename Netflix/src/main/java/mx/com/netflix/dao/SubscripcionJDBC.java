package mx.com.netflix.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import mx.com.netflix.models.Subscripcion;


@Repository
public class SubscripcionJDBC implements SubscripcionDAO {
@Autowired
JdbcTemplate conexion;
String sql;
	@Override
	public List<Subscripcion> consultar() {
		sql="SELECT * FROM subscripciones";
		return conexion.query(sql, new SubscripcionRM());


	}

	@Override
	public void eliminar(int id) {
		sql="DELETE FROM subscripciones WHERE id=?";
		conexion.update(sql,id);
	}


	@Override
	public void actualizar_subs(Subscripcion subscripcion, int id_subscripcion) {
		sql="UPDATE subscripciones SET tipo=?, precio=?, fecha_inicio=?, fecha_fin=?,vencida=? WHERE id=?";
		conexion.update(sql,subscripcion.getTipo(), subscripcion.getPrecio(), subscripcion.getFecha_inicio(), 
				subscripcion.getFecha_fin(), subscripcion.isVencida(), id_subscripcion);
		
	}

	@Override
	public Subscripcion buscar_subs(int subscripcion_id) {
		sql="SELECT * FROM subscripciones WHERE id= ?";
		return conexion.queryForObject(sql, new SubscripcionRM(), subscripcion_id);
		
	}

	@Override
	public void insertar_sub(Subscripcion subscripcion) {
		sql="INSERT INTO subscripciones(tipo,precio,fecha_inicio,fecha_fin,vencida)VALUES(?,?,?,?,?)";
		conexion.update(sql, subscripcion.getTipo(),subscripcion.getPrecio(),subscripcion.getFecha_inicio(),subscripcion.getFecha_fin(),subscripcion.isVencida());
		
	}
	
}
