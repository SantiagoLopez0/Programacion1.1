package modelo;

public class Mundo {

	private Superman s;
	private Bird b;
	private Helicopter H;
	private Seaplane se;
	
	public Mundo()
	{
		s = new Superman();
		b = new Bird();
		H = new Helicopter();
		se = new Seaplane();
	}

	public Superman getS() {
		return s;
	}

	public void setS(Superman s) {
		this.s = s;
	}

	public Bird getB() {
		return b;
	}

	public void setB(Bird b) {
		this.b = b;
	}

	public Helicopter getH() {
		return H;
	}

	public void setH(Helicopter h) {
		H = h;
	}

	public Seaplane getSe() {
		return se;
	}

	public void setSe(Seaplane se) {
		this.se = se;
	}
	
	
	
}
