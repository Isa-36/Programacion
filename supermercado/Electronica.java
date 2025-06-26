package ABML;

public class Electronica extends Producto {

	String componente1;
	String tecnico;
	boolean calidad;
	
	
	public Electronica(double precio, int cantidad, String que,String componente1,String tecnico,boolean calidad) {
		super(precio, cantidad, que);
		this.componente1=componente1;
		this.tecnico=tecnico;
		this.calidad=calidad;
	}
	
	public String getComponente1() {
		return componente1;
	}
	public void setComponente1(String componente1) {
		this.componente1 = componente1;
	}
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	public boolean isCalidad() {
		return calidad;
	}
	public void setCalidad(boolean calidad) {
		this.calidad = calidad;
	}
	
}
