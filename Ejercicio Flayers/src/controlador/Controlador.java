package controlador;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	private Mundo db;
	private Interfaz gui;
	
	public Controlador()
	{	
		db = new Mundo();
		gui = new Interfaz();
		gui.menu();
		gui.imprimir(gui.getOpp());
		if(gui.getOpp() ==1)
		{
			imprimirSuperman();
		}
		if(gui.getOpp() ==2)
		{
			imprimirPajaro();
		}
		if(gui.getOpp() ==3)
		{
			imprimirHelicoptero();;
		}
		if(gui.getOpp() ==4)
		{
			impromirHidro();
		}
		
		
	}
	
	public void imprimirSuperman()
	{
		db.getS().lanzarRayos();
		db.getS().eat();
		db.getS().leapBuilding();
		db.getS().stopBullets();
	}
	public void imprimirPajaro()
	{
		db.getB().takeOff();
		db.getB().land();
		db.getB().fly();
		db.getB().eat();
		db.getB().buildNest();
		db.getB().layEggs();
	}
	public void imprimirHelicoptero()
	{
		db.getH().takeOff();
		db.getH().turnOn();
		db.getH().land();
		db.getH().fly();
		db.getH().gastarCombustible();
	}
	public void impromirHidro()
	{
		db.getSe().takeOff();
		db.getSe().turnOn();
		db.getSe().land();
		db.getSe().fly();
		db.getSe().gastarCombustible();
	}
	
}
