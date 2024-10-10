package u02;

import java.util.Scanner;

public class PiedraPapelTijeras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Bienvendo, vamos a jugar a piedra papel o tijeras!");
		boolean entradaCorrecta = true;
		boolean empate = false;
		String salida = "";
	
		do {
		System.out.println("Jugador elije qué vas a usar:");
		System.out.println("piedra ");
		System.out.println("papel ");
		System.out.println("tijeras ");
		String jugadaPlayer =scan.nextLine();
		jugadaPlayer = jugadaPlayer.toLowerCase();
			empate = false;
			entradaCorrecta = true;
			switch (jugadaPlayer) {
			case "piedra":
				System.out.println("has escogido piedra");

				break;
			case "papel":
				System.out.println("has escogido papel");

				break;
			case "tijeras":
				System.out.println("has escogido tijeras");

				break;

			default:
				System.out.println("No has escogido ninguna opción valida!");
				entradaCorrecta = false;
				break;

			}
			if(entradaCorrecta) {
			int jugadaCpu = (int) (Math.random() * 3 + 1);
			String jugadaCpuString = "" + jugadaCpu;

			switch (jugadaCpuString) {
			case "1":
				System.out.println("La máquina ha escogido piedra");
				jugadaCpuString = "piedra";
				break;
			case "2":
				System.out.println("La máquina ha escogido papel");
				jugadaCpuString = "papel";
				break;
			case "3":
				System.out.println("La máquina ha escogido tijeras");
				jugadaCpuString = "tijeras";
				break;

			default:
				System.out.println("No has escogido ninguna opción valida!");
				break;
			}

			if (jugadaPlayer.equals(jugadaCpuString)) {
				System.out.println("Habéis quedado empate, " + jugadaPlayer + " empata con " + jugadaCpuString);
				empate = true;

			} else if (jugadaPlayer.equals("piedra") && jugadaCpuString.equals("papel")
					|| (jugadaPlayer.equals("tijeras") && jugadaCpuString.equals("piedra")
							|| (jugadaPlayer.equals("papel") && jugadaCpuString.equals("tijeras")))) {
				System.out.println("Has perdido, " + jugadaCpuString + " le gana a " + jugadaPlayer);
				empate = false;
			} else  {
				System.out.println("Has ganado, " + jugadaPlayer + " le gana a " + jugadaCpuString);
				empate = false;
			}}
		}while(!entradaCorrecta || empate);
		scan.close();
		System.out.println(salida);
}
}