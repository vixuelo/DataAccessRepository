package es.centroafuera.ad.hibernate.ejemplo1;

public class paises {
	int id;
	String nombre;

	public paises(int id, String nombre) {
		this.id=id;
		this.nombre=nombre;
	}

	public paises() {
		// TODO Auto-generated constructor stub
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
}
