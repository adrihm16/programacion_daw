package u04;

import java.util.Scanner;

public class EjMatricula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu matricula");
		String input = sc.nextLine();
		String matricula = input.trim();
		char [] letras = {'B','C','D','F','G','H','J','K','L','M','N','P','R','S','T','V','X','Y','Z'};
		String patronRegex = "[0-9] {4} *[B-DF-HJ-NP-TV-Z]{3}";
		if (matricula.matches(patronRegex)) {
			String numeroString= input.substring(0,4);
			String letras = input.substring(matricula.length()-3,matricula)
		} else {

		}
		
		
	
	}
private static String rellenarConCeros (int numero) {
	String numero4Cifras=numero+"";
	while (numero4Cifras.length()<4) {
		numero4Cifras="0"+numero4Cifras;
	}
	return numero4Cifras;
}
private static String calcularLetras (String letrasMatr, char [] letras) {
	char letra1=letrasMatr.charAt(0);
	char letra2=letrasMatr.charAt(1);
	char letra3=letrasMatr.charAt(2);
	if (letra3=='Z') {
		
	}else {
		
	}
return ;}
}
