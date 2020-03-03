package mx.com.netflix.models;

public class Series {
int id;
String nombre;
String descripcion;
int anio;
String  clasificacion;
String categoria;


public Series() {
	super();
	
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


public String getDescripcion() {
	return descripcion;
}


public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}


public int getAnio() {
	return anio;
}


public void setAnio(int anio) {
	this.anio = anio;
}


public String getClasificacion() {
	return clasificacion;
}


public void setClasificacion(String clasificacion) {
	this.clasificacion = clasificacion;
}


public String getCategoria() {
	return categoria;
}


public void setCategoria(String categoria) {
	this.categoria = categoria;
}


public Series(int id, String nombre, String descripcion, int anio, String clasificacion, String categoria) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.anio = anio;
	this.clasificacion = clasificacion;
	this.categoria = categoria;
}

}
