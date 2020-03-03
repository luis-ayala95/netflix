package mx.com.netflix.models;

public class Usuario {
	int id;
	String nombre;
	String alias;
	int avatar_id;
	int subscripcion_id;
	public Usuario() {
		super();
		
	}
	public Usuario(int id, String nombre, String alias, int avatar_id, int subscripcion_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.alias = alias;
		this.avatar_id = avatar_id;
		this.subscripcion_id = subscripcion_id;
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
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public int getAvatar_id() {
		return avatar_id;
	}
	public void setAvatar_id(int avatar_id) {
		this.avatar_id = avatar_id;
	}
	public int getSubscripcion_id() {
		return subscripcion_id;
	}
	public void setSubscripcion_id(int subscripcion_id) {
		this.subscripcion_id = subscripcion_id;
	}
	
}
