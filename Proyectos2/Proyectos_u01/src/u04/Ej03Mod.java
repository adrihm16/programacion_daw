package u04;

public class Ej03Mod {

	public static void main(String[] args) {
		long [] numeros = new long [20];
		long [] cuadrado = new long [20];
		long [] cubo = new long [20];
		long numAleatorio = (long) (Math.random()*101);
		long potencia =1 ;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (long) Math.pow(numAleatorio, potencia);
			cuadrado[i]= numeros[i]*10;
			cubo[i]= numeros[i]*100;
			potencia++;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t");
			System.out.print(cuadrado[i] + "\t");
			System.out.println(cubo[i]);
			}
	}

}
