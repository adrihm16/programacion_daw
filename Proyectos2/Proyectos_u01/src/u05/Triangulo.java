package u05;

public class Triangulo {
	Punto v1;
	Punto v2;
	Punto v3;

	public Punto getV1() {
		return v1;
	}

	public void setV1(Punto v1) {
		this.v1 = v1;
	}

	public Punto getV2() {
		return v2;
	}

	public void setV2(Punto v2) {
		this.v2 = v2;
	}

	public Punto getV3() {
		return v3;
	}

	public void setV3(Punto v3) {
		this.v3 = v3;
	}

	public Triangulo() {
		this.v1 = new Punto(0d, 1d);
		this.v2 = new Punto(1d, 0d);
		this.v3 = new Punto(-1d, 0d);
	}

	public Triangulo(Punto v1, Punto v2, Punto v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public Triangulo(Double v1x, Double v1y, Double v2x, Double v2y, Double v3x, Double v3y) {
		this.v1 = new Punto(v1x, v1y);
		this.v2 = new Punto(v2x, v2y);
		this.v3 = new Punto(v3y, v3y);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Triangulo: \n").append("vértice 1: ").append(v1);
		sb.append("vértice 2: ").append(v2);
		sb.append("vértice 3: ").append(v3);
		return sb.toString();
	}

	public Triangulo copiar(double despX, double despY) {
		Triangulo copia = new Triangulo(this.v1, this.v2, this.v3);
		//desplazo v1, v2 y v3 y los establezco en la variable copia:
		copia.v1.setX(this.v1.getX() + despX);
		copia.v1.setY(this.v1.getY() + despY);
		copia.v2.setX(this.v1.getX() + despX);
		copia.v2.setY(this.v1.getY() + despY);
		copia.v3.setX(this.v1.getX() + despX);
		copia.v3.setY(this.v1.getY() + despY);
		return copia;
	}

	public void desplazar(double despX, double despY) {
		//desplazo v1, v2 y v3:
		this.v1.setX(this.v1.getX() + despX);
		this.v1.setY(this.v1.getY() + despY);
		this.v2.setX(this.v1.getX() + despX);
		this.v2.setY(this.v1.getY() + despY);
		this.v3.setX(this.v1.getX() + despX);
		this.v3.setY(this.v1.getY() + despY);
	}
}
