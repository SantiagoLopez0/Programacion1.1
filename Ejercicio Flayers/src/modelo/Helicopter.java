package modelo;

import javax.swing.JOptionPane;

public class Helicopter extends Airplane
{

	private static String name = "Helicoptero";
	
	public Helicopter()
	{
		super.llantas = 4;
		
		
	}
	
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "El "+this.name+" tiene "+super.llantas+" llantas y despega diretamente hacia arriba", "Helicoptero", JOptionPane.INFORMATION_MESSAGE );
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Aterriza suavemente sobre una superficie plana", "Helicoptero", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Vuela de arriba a abajo; de derecha a izquierda y de adelante hacia atras", "Helicoptero", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Enciende por medio de elices que tiene en la parte superior", "Helicoptero", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void gastarCombustible() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Gasta 30 galones de combustible en 60 minutos", "Helicoptero", JOptionPane.INFORMATION_MESSAGE);
	}

	


}
