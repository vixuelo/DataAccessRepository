package es.centroafuera.ad.hibernate.ejemplo1;

public class Empleado {
	int dept_no;
	float comision;
	float salario;
	String fecha_alt;
	int dir;
	String oficio;
	String apellido;
	String nombre;
	int emp_no;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(int dept_no, float comision, float salario, String fecha_alt, int dir, String oficio,
			String apellido, String nombre, int emp_no) {
		this.apellido=apellido;
		this.comision=comision;
		this.dir=dir;
		this.emp_no=emp_no;
		this.nombre=nombre;
		this.salario=salario;
		this.oficio=oficio;
		this.fecha_alt=fecha_alt;
		this.dept_no=dept_no;
			
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public float getComision() {
		return comision;
	}

	public void setComision(float comision) {
		this.comision = comision;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFecha_alt() {
		return fecha_alt;
	}

	public void setFecha_alt(String fecha_alt) {
		this.fecha_alt = fecha_alt;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
}
