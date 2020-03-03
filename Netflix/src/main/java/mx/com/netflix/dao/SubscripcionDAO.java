package mx.com.netflix.dao;

import java.util.List;


import mx.com.netflix.models.Subscripcion;


public interface SubscripcionDAO {
public List<Subscripcion> consultar();
	

	public void eliminar(int id);

	public void actualizar_subs(Subscripcion subscripcion, int id);

	public Subscripcion buscar_subs(int id);

	
	public void insertar_sub(Subscripcion subscripcion);





	


	
}
