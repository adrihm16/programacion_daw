package u05;

public class TrianguloMain {

	public static void main(String[] args) {
		Triangulo t = new Triangulo(new Punto(0d, 1d), new Punto(1d, 0d), new Punto(-1d, 0d));
		System.out.println(t);
		System.out.println("---------------\nDesplazado\n---------------");
		t.desplazar(2, 2);
		System.out.println(t);
		Triangulo tCopia = new Triangulo(new Punto(3d, 3d), new Punto(1d, 0d), new Punto(-1d, 0d));
		tCopia= t.copiar(1, 1);
		System.out.println("---------------\ncopiado\n---------------");
		System.out.println(tCopia);
	}

}
