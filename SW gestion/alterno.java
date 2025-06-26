package INTERFACE;
import java.util.Scanner;
public class alterno implements persona{
	Scanner sc = new Scanner(System.in);
private int ca = 66;
private String area;

	public void mail() {
		// TODO Auto-generated method stub
			System.out.println("Contraseña");
			int e2 = sc.nextInt();
			if (e2 == ca) {
				System.out.println("Hola, peon de quinta");
			}else {
				System.out.println("Contraseña incorrecta");
			}

}
	}
