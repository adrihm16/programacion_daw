package u05;

public class Punto {
	private double x;
	private double y;

	public Punto() {
		this.x = 0d;
		this.y = 0d;
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void desplazar(double despX, double despY) {
		this.x = this.x + despX;
		this.y = this.y + despY;
	}

	public Punto obtenerInverso() {
		Punto p = new Punto(this.x, this.y);
		Punto pi = new Punto(this.x, this.y);
		p.setX(this.x * -1);
		p.setY(this.y * -1);

		return pi;
	}

	public double calcularAreaConEjes() {
		double xP = this.x;
		double yP = this.y;
		if (this.x <= 0) {
			xP = xP * -1;
		} else if (this.y <= 0) {
			yP = yP * -1;
		}
		double area = xP * yP;
		return area;
	}

	public double calcularPerimetroCuadrantes() {
		double perim = this.x * 4;
		return perim;
	}

	public String toString() {
		String s ="Punto:(" + this.x + " , " + this.y + ")";
		return s;
	}
}
