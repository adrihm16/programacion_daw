package u04;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class E14Ajedrez {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la posición inicial del alfil a-h 1-8");
		String input = scanner.nextLine();
		char letra = input.charAt(0);
		int numero = Integer.parseInt(StringUtils.substring(input, input.length() - 1));
		String[][] tablero = new String[8][8];
		tablero[letra-'a'][numero]="A";
		System.out.println("\ta\tb\tc\td\te\tf\tg\th");
		for (int fila = 8; fila >= 1; fila--) {
			System.out.print(fila + "\t");
			for (char col = 'a'; col <= 'h'; col++) {
				if (col == letra && fila == numero) {
					System.out.print("A" + "\t");
					tablero[fila][col] = "A";
				} else {

					System.out.print("\t");
				}
			}
			System.out.print("\n");
		}
		// Hacia arriba y derecha
		char letraAux = (char) (letra+1);
		int numeroAux = numero+1;
		while (letraAux <= 'h' && numeroAux <= 8) {
			tablero[letraAux][numeroAux] = "X";
			letraAux++;
			numeroAux++;
		}
		// Hacia arriba e izquierda
		 letraAux = (char) (letra-1);
		numeroAux = numero+1;
		while (letraAux >= 'a' && numeroAux >= 1 && letraAux <= 'h' && numeroAux <= 8) {
			tablero[letraAux][numeroAux] = "X";
			letraAux--;
			numeroAux++;
	}
		// Hacia abajo e izquierda
				 letraAux = (char) (letra-1);
				numeroAux = numero-1;
				while (letraAux >= 'a' && numeroAux >= 1 && letraAux <= 'h' && numeroAux <= 8) {
					tablero[letraAux][numeroAux] = "X";
					letraAux--;
					numeroAux--;
			}
				// Hacia abajo y derecha
				 letraAux = (char) (letra+1);
				numeroAux = numero-1;
				while (letraAux >= 'a' && numeroAux >= 1 && letraAux <= 'h' && numeroAux <= 8) {
					tablero[letraAux][numeroAux] = "X";
					letraAux++;
					numeroAux--;
			}
	}

}
