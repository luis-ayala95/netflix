package mx.com.netflix.models;

public class Subscripcion {
int id;
int tipo;
int precio;
String fecha_inicio;
String fecha_fin;
boolean vencida;

public Subscripcion() {
	super();
	
}



public Subscripcion(int id, int tipo, int precio, String fecha_inicio, String fecha_fin, boolean vencida) {
	super();
	this.id = id;
	this.tipo = tipo;
	this.precio = precio;
	this.fecha_inicio = fecha_inicio;
	this.fecha_fin = fecha_fin;
	this.vencida = vencida;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public int getPrecio() {
	return precio;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public String getFecha_inicio() {
	return fecha_inicio;
}

public void setFecha_inicio(String fecha_inicio) {
	this.fecha_inicio = fecha_inicio;
}

public String getFecha_fin() {
	return fecha_fin;
}

public void setFecha_fin(String fecha_fin) {
	this.fecha_fin = fecha_fin;
}

public boolean isVencida() {
	return vencida;
}

public void setVencida(boolean vencida) {
	this.vencida = vencida;
}

}

