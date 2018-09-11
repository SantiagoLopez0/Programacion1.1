package vista;

import javax.swing.JOptionPane;


public class Interfaz {
	
	private int opp;
	
	public Interfaz()
	{

	}
	
	public void menu()
	{	
		JOptionPane.showMessageDialog(null, "Bienvenido, ingrese el valor que desea calcular");
		String op = JOptionPane.showInputDialog("1. Superman"+"\n2.Pajaro"+"\n3. Helicoptero"+"\n4. Hidroplano");
		setOpp(Integer.parseInt(op));
	}
	
	public void imprimir(int op)
	{
		if(op==1) 
		{
			JOptionPane.showMessageDialog(null, "Usted eligio Superman", "Superman", JOptionPane.INFORMATION_MESSAGE);
		}
		if(op==2) 
		{
			JOptionPane.showMessageDialog(null, "Usted eligio pajaro", "Pajaro", JOptionPane.INFORMATION_MESSAGE);
		}
		if(op==3) 
		{
			JOptionPane.showMessageDialog(null, "Usted eligio helicoptero", "Helicoptero", JOptionPane.INFORMATION_MESSAGE);
		}
		if(op==4) 
		{
			JOptionPane.showMessageDialog(null, "Usted eligio hidroplano", "Hidroplano", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public int getOpp() {
		return opp;
	}

	public void setOpp(int opp) {
		this.opp = opp;
	}

	
	
	
}
