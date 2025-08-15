package withListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class WindowL extends JFrame{
	
	public WindowL() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2, 10, 10));
		
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setTitle("Layout");
		 this.add(panel, BorderLayout.CENTER);
		 this.setSize(800, 600);
		 this.setLocationRelativeTo(null);
		    
			JTextField JTF = new JTextField();       
			JTextField JTF2 = new JTextField();
			JTextField CI = new JTextField();
			JTextField AGE = new JTextField();
			
			String[] ROL;
			 ROL = new String[4];
			 ROL[0] = ""; 
			 ROL[1] = "Alumno";
			 ROL[2] = "Docente";
			 ROL[3] = "Funcionario";
			
			JSpinner spinner = new JSpinner(new SpinnerNumberModel(18, 0, 120, 1));
			
			JButton boton = new JButton ("Mostrar");
		 boton.setBounds(80,70,140,30);
		 
		    panel.add(new JLabel("Nombre ")); 
			panel.add(JTF);
			panel.add(new JLabel("Apellido "));
			panel.add(JTF2);
			panel.add(new JLabel("CI "));
			panel.add(CI);
			panel.add(new JLabel("Edad "));
			panel.add(AGE);
			panel.add(new JComboBox(ROL));
			panel.add(new JButton("Aceptar"), BorderLayout.SOUTH);
			panel.add(boton, BorderLayout.SOUTH);	
		 
		//Creamos un oyente para el boton
		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String n = JTF.getText();
				String a = JTF2.getText(); 
				String ci = CI.getText();
				int edad = (int)spinner.getValue();
				
				  System.out.println("Nombre: " + n);
	                System.out.println("Apellido: " + a);
	                System.out.println("CI: " + ci);
	                System.out.println("Edad: " + edad);

				
				
				} });  
		this.setVisible(true);

}
    public static void main(String[] args) {
        new WindowL();

	}}
