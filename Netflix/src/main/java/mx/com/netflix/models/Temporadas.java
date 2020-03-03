package mx.com.netflix.models;

public class Temporadas {
int id;
String nombre;
int serie_id;
public Temporadas() {
	super();
	
}
public Temporadas(int id, String nombre, int serie_id) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.serie_id = serie_id;
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
public int getSerie_id() {
	return serie_id;
}
public void setSerie_id(int serie_id) {
	this.serie_id = serie_id;
}

}
