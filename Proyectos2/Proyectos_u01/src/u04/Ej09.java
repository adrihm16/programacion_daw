package u04;

public class Ej09 {

	public static void main(String[] args) {
		long [] numeros = new long [20]; 
		long [] aux = new long [20];
		int iPar=0;
		int iImpar=numeros.length-1;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = ((long) (Math.random()*101));
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0){
				aux[iPar++]=numeros[i];
			}else {aux[iImpar--]=numeros[i];}
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + "\t");
			}
		System.out.println("");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(aux[i] + "\t");
			}
	}

}
