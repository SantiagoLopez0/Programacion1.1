package modelo;

import javax.swing.JOptionPane;

public class Superman extends Kryptonian
{
	private String comida = "Lois Lane";
			
	public Superman()
	{
		super.poder = "fuerza";
		
	}
	@Override
	public void lanzarRayos() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Superman Lanza Rayos por los ojos", "Superman", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Su super Poder es "+super.poder, "Superman", JOptionPane.INFORMATION_MESSAGE);
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " come: "+this.comida, "Superman", JOptionPane.INFORMATION_MESSAGE);
		
	}
	public void leapBuilding()
	{
		JOptionPane.showMessageDialog(null, " puede saltar edificios", "Superman", JOptionPane.INFORMATION_MESSAGE);
	}
	public void stopBullets()
	{
		JOptionPane.showMessageDialog(null, " puede detener balas", "Superman", JOptionPane.INFORMATION_MESSAGE);
	}
	

}
