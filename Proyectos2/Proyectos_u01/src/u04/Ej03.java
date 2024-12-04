package u04;

public class Ej03 {

	public static void main(String[] args) {
		int [] numeros = new int [100];
		int [] cuadrado = new int [100];
		int [] cubo = new int [100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random()*101);
			cuadrado[i]= (int) Math.pow(numeros[i], 2);
			cubo[i]= (int) Math.pow(numeros[i], 3);
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t");
			System.out.print(cuadrado[i] + "\t");
			System.out.println(cubo[i]);
			}
	}

}
