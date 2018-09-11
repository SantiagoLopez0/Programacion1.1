package Controlador;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.xml.soap.Text;

import Modelo.Cuadratica;
import Modelo.Mundo;

public class Principal {
	private static Controlador c;
	private static int num1;
	private static int num2;
	private static int num3;
	public Principal(int num1, int num2, int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	public static void main(String[] args) throws Exception {
		c = new Controlador(num1, num2, num3);
		c.menu();
		c.imprimir();
	}
	
}
