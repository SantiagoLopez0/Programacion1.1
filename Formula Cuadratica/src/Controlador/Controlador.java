package Controlador;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Modelo.Excepcion;
import Modelo.Mundo;

public class Controlador
{
	private static Mundo m;
	private static int num1;
	private static int num2;
	private static int num3;
	
	public Controlador(int num1, int num2, int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		m = new Mundo();
	}
	public static  void menu() throws Excepcion
	{
		Scanner Lector = new Scanner(System.in);
		System.out.println("Inserte 3 constantes");
		
		/*String num11 = Lector.nextLine();
		num1 = Integer.parseInt(num11);
		

		String num12 = Lector.nextLine();
		num2 = Integer.parseInt(num12);
		

		String num13 = Lector.nextLine();
		num3 = Integer.parseInt(num13);*/
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero2"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Numero3"));
		
		System.out.println("La ecuacion cuadratica es: "+num1+"x^2+"+num2+"x+"+num3+"=0");

		m.calcularPxSx(num1,num2,num3);

	}
	public static void imprimir() throws Excepcion
	{
		m.imprimir();
	}

}
