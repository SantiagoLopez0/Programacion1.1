package modelo;

import javax.swing.JOptionPane;

public class Bird extends Animal implements Flayer 
{
	public String nb = "Paloma";
	
	public Bird()
	{

	}
	
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "La "+nb+" comienza su en cualquier lugar", "Pajaro", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "La "+nb+" aterriza en un lugar seguro", "Pajaro", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"La "+nb+" vuela con sus alas", "Pajaro", JOptionPane.INFORMATION_MESSAGE);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"La "+nb+" come maiz", "Pajaro", JOptionPane.INFORMATION_MESSAGE);
	} 
	public void buildNest()
	{
		JOptionPane.showMessageDialog(null,"La " +nb +" construye su nido en lugares altos", "Pajaro", JOptionPane.INFORMATION_MESSAGE);
	}
	public void layEggs()
	{
		JOptionPane.showMessageDialog(null, "La "+nb+" pone huevos en su nido", "Pajaro", JOptionPane.INFORMATION_MESSAGE);
	}


	
}
