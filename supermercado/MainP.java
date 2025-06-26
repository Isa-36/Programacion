package ABML;
import java.util.Scanner;
public class MainP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //--------------------------------------------------------------------------------
 
	int opcion;
	Producto[] arr = new Producto[11];
	int registrar = 0;
	
	
	do {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido");
		System.out.println("-Ingresa Opcion Deseada-");
		System.out.println("1- Ingresar producto");
		System.out.println("2- Mostrar Lista de productos");
		System.out.println("3- Modificar estudiante");
		System.out.println("4- Borrar Estudiante-");
		System.out.println("5- Salir");
		opcion = sc.nextInt();
		
		//-------------------------------------------------------------------
		
		switch (opcion) {
		case 1:
	
			altaProducto(arr, registrar, sc);
			registrar++;
			break;

		case 2:
			listarProducto(arr);
			break;
			
		case 3:
			System.out.println("-Ingresa el nombre del producto a modificar-");
			String que = sc.next();
			modifProducto(arr, que, sc);
			break;
			
		case 4:
			bajaProducto(arr, que);
			break;
			
		case 5:
			System.out.println("-Fin del Programa-");
			break;
			
			default:
				System.out.println("Opcion no disponible");
				break;
		}
		
	} while (opcion!=5);

}

	public static void bajaProducto(Producto[] arr, String que) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null && arr[i].getQue() == que) {
				arr[i] = null;
			}
		}
	}
	
	
	public static void altaProducto(Producto[] arr, int Registrados, Scanner sc) {
		System.out.println("Ingrese que producto desea: ");
		String que = sc.next();
		System.out.println("Ingresa el precio: ");
		double precio = sc.nextDouble();
		System.out.println("Ingresa cuantos se quiere llevar: ");
		int cantidad = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Producto(precio, cantidad, que);
				break;
			}
		}
		
		
	}
	
	public static void listarProducto(Producto[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				System.out.print("Producto N°"+ i +" Producto: " + arr[i].getQue());
				System.out.print(" Precio: " + arr[i].getPrecio());
				System.out.println(" Cantidad: " + arr[i].getCantidad());
			}else {
				System.out.println("Producto N°" + i + "es null");
			}
		}
			
		}
		
		public static void modifProducto(Producto[] arr, String que, Scanner sc) {
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != null && arr[i].getQue() == que) {
					System.out.println("Producto encontrado");
					System.out.println("-Ingrese el Producto-");
					String NewQue = sc.next();
					arr[i].setQue(NewQue);
					
				}
			}
		
		}
	public static void bajaProducto1(Producto[] arr, String que) {
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] != null && arr[i].getQue() == que) {
					arr[i] = null;
				}
			}
		}
		
	
	
//---------------------------------------------------------------------------------
	
//---------------------------------------------------------------------------------		
	
}

    