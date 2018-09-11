package modelo;

import javax.swing.JOptionPane;

public class Seaplane extends Airplane {

	private static String n = "Hidroavión";
	
	public Seaplane()
	{
	super.llantas = 3;
		
		
	}
	
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "El "+n+" tiene "+super.llantas+" llantas especiales para despegar en el agua", "Hidroplano", JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Aterriza suavemente sobre una superficie acuatica, ademas necesita espacio para ir disminuyendo su velocidad", "Hidroplano", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Vuela por medio de motores", "Hidroplano", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void gastarCombustible() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "gasta 4 galones cada kilometro de recorrido", "Hidroplano", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Enciende de una forma similar a un avion normal", "Hidroplano", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}
