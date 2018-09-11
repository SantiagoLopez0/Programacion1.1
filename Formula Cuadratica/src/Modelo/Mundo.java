package Modelo;

public class Mundo {

	private Cuadratica c; 
	
	public Mundo()
	{
		c = new Cuadratica();
	}
	public void calcularPxSx(int num1,int num2,int num3) throws Excepcion
	{
		c.calcularPx(num1,num2,num3);
	}
	public void imprimir() throws Excepcion {
		c.imprimir();
		
	}
}
