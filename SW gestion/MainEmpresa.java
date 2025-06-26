package INTERFACE;
import java.util.Scanner;
public class MainEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		encargado e = new encargado();
		alterno a = new alterno();
		tecnico t = new tecnico();
		
		System.out.println("Bienvenid-");
		System.out.println("-Ingresar profecion-");
		System.out.println("1- encargado");
		System.out.println("2- alterno");
		System.out.println("3- tecnico");
		int opc = sc.nextInt();
		
		switch (opc) {
		case 1:
			e.mail();
				break;
		case 2:
			a.mail();
			break;
		case 3:
			t.mail();
	}		

	}
}
