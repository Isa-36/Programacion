package INTERFACE;
import java.util.Scanner;
public class tecnico implements persona{
	Scanner sc = new Scanner(System.in);
	private int ct = 11;
	private String especialidad;

@Override
public void mail() {
	// TODO Auto-generated method stub
	
	System.out.println("Contraseña");
	int c2 = sc.nextInt();
	
if (c2 == ct) {
	System.out.println("Enviar mensaje a");
	System.out.println("1- encargado");
	System.out.println("2- alterno");
	int o = sc.nextInt();
switch (o) {
case 1:
System.out.println("Enviar mensaje a encargado");
String e2 = sc.next();
System.out.println("Mensaje enviado");
break;
case 2:
System.out.println("Enviar mensaje a esclavo");
String a1 = sc.next();
System.out.println("Mensaje enviado");
break;

default:
break;
}
}}
}
