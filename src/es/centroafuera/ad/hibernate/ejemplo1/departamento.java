package es.centroafuera.ad.hibernate.ejemplo1;

public class departamento {
	int dept_no;
	String dnombre;
	String loc;

	public departamento(int dept_no, String dnombre, String loc) {
		this.dnombre=dnombre;
		this.loc=loc;
		this.dept_no=dept_no;
	}

	public departamento() {
		// TODO Auto-generated constructor stub
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public String getDnombre() {
		return dnombre;
	}

	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
