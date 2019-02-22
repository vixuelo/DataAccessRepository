package es.centroafuera.ad.hibernate.ejemplo1;

public class oficinas {
	int id;
	String nombre;
	int fk_pais;
	String descripcion;

	public oficinas(int id, String nombre, int FK_paises, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.fk_pais = FK_paises;
		this.descripcion=descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public oficinas() {
		// TODO Auto-generated constructor stub
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

	public int getFk_pais() {
		return fk_pais;
	}

	public void setFk_pais(int fk_pais) {
		this.fk_pais = fk_pais;
	}

	
}
