package Modelo;

public class Cuadratica
{
	private int num1;
	private int num2;
	private int num3;
	
	private float x1;
	private float x2;
	
	public Cuadratica()
	{
		this.x1=0;
		this.x2=0;
		
		this.num1 = 0;
		this.num2 = 0;
		this.num3 = 0;
	}
	
	public void calcularPx(int num1, int num2, int num3) throws Excepcion
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		float x11=0;
		float x22=0;
		float xa=0;
		float xb1 = 0;
		float xb2 = 0;
		float xc = 0;
		float resultado1 =0;
		
			xa=(float) (Math.pow(this.num2, 2)-(4*this.num1*this.num3));
			resultado1 = (float) Math.sqrt(xa);	
			
			xc = this.num1*2;
			
			xb1 = -this.num2+resultado1;
			x11 = xb1/xc;
			this.x1=x11;
			
			xb2 = -this.num2-resultado1;
			x22 = xb2/xc;
			this.x2=x22;
		
		
		
				
				
			
				
			
	}
	public void imprimir() throws Excepcion
	{
		System.out.println("\nLos Resultados son: ");
		
		System.out.println(this.x1);
		System.out.println(this.x2);
	}
}
