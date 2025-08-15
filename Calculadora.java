package Calculadora;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Calculadora extends JFrame{
	
	public Calculadora() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setTitle("Calculadora");
		 this.setSize(800, 600);
		 this.setLocationRelativeTo(null);
		 
		 JPanel panel = new JPanel();
		 JTextField numero = new JTextField();
		 JTextField numero2 = new JTextField();
		 
		 JButton mas = new JButton("+");
		 JButton menos = new JButton("-");
		 JButton multi = new JButton("x");
		 JButton divi = new JButton("/");
		 
		 panel.add(new JLabel("Primer numero: "));
		 panel.add(numero);
		 panel.add(new JLabel("Segundo numero: "));
		 panel.add(numero2);
		 
		 panel.add(mas);
		 panel.add(menos);
		 panel.add(multi);
		 panel.add(divi);
		 
		 
		 mas.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String txt = numero.getText();
					int n = Integer.parseInt(txt);
					String txt2 = numero2.getText(); 
					int n2 = Integer.parseInt(txt2);
					
					  System.out.println("El resultado es " + (n+n2));
					
					
					} });  
		 
		 menos.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String txt1 = numero.getText();
					int n = Integer.parseInt(txt1);
					String txt22 = numero2.getText(); 
					int n2 = Integer.parseInt(txt22);
					
					  System.out.println("El resultado es " + (n-n2));
					
					
					} });
		 
		 multi.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String txt11 = numero.getText();
					int n = Integer.parseInt(txt11);
					String txt222 = numero2.getText(); 
					int n2 = Integer.parseInt(txt222);
					
					  System.out.println("El resultado es " + (n*n2));
					
					
					} });
		 
		 divi.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String txt111 = numero.getText();
					int n = Integer.parseInt(txt111);
					String txt2222 = numero2.getText(); 
					int n2 = Integer.parseInt(txt2222);
					
					  System.out.println("El resultado es " + (n/n2));
					
					
					} });

}}
