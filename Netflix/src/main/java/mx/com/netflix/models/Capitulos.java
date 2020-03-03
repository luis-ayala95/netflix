package mx.com.netflix.models;

public class Capitulos {
int id;
String nombre;
int duracion;
String descripcion;
int temporada_id;
public Capitulos() {
	super();
	// TODO Auto-generated constructor stub
}
public Capitulos(int id, String nombre, int duracion, String descripcion, int temporada_id) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.duracion = duracion;
	this.descripcion = descripcion;
	this.temporada_id = temporada_id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getTemporada_id() {
	return temporada_id;
}
public void setTemporada_id(int temporada_id) {
	this.temporada_id = temporada_id;
}

}
