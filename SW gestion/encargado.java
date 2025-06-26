package INTERFACE;
import java.util.Scanner;
public class encargado implements persona{
Scanner sc = new Scanner(System.in);
private int ce;
private String equipo;

@Override
	public void mail() {
		// TODO Auto-generated method stub
	System.out.println("Contraseña");
	int c1 = sc.nextInt();
	if (c1 == ce) {
		System.out.println("Enviar mensaje a tecnico");
		String e1 = sc.next();
		System.out.println(" Mensaje enviado");
	}else {
		System.out.println("Contraseña incorrecta");	
	}
}
}