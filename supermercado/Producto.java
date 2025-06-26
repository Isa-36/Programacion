package ABML;

public class Producto {

	private double precio;
	private int cantidad;
	private String que;
	
	public Producto(double precio, int cantidad, String que) {
		super();
		this.precio=precio;
		this.cantidad=cantidad;
		this.que=que;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	
	
}
