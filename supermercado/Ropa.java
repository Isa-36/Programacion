package ABML;

public class Ropa extends Producto{

	String talla;
	String tela;
	
	public Ropa(double precio, int cantidad, String que,String talla, String tela) {
		super(precio, cantidad, que);
		this.talla=talla;
		this.tela=tela;
	}
	
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getTela() {
		return tela;
	}
	public void setTela(String tela) {
		this.tela = tela;
	}
	

}
