package ABML;

public class Alimento extends Producto {

	String tipo;
	String es;
	double vence;
	
	public Alimento(double precio, int cantidad,String que, String tipo, String es, double vence) {
		super(precio, cantidad, que);
		this.tipo=tipo;
		this.es=es;
		this.vence=vence;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEs() {
		return es;
	}
	public void setEs(String es) {
		this.es = es;
	}
	public double getVence() {
		return vence;
	}
	public void setVence(double vence) {
		this.vence = vence;
	}
	
	
}
