package u02;

import java.util.Scanner;

public class PiedraPapelTijeras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Jugador 1 escoge:");
		System.out.println("1 -piedra");
		System.out.println("2 -papel");
		System.out.println("3 -tijeras");
		String jugador1 =scan.nextLine();
		jugador1 = jugador1.toLowerCase();
		boolean correcto = true;
		switch (jugador1) {
		case"piedra" :
			System.out.println("has escogido piedra");
			
			break;
		case "papel":
			System.out.println("has escogido papel");
			
			break;
		case "tijeras":
			System.out.println("has escogido tijeras");
			
			break;

		default: System.out.println("No has escogido ninguna opción valida!");
		correcto = false;
			break;
			
		}
		
		int opcion =(int)(Math.random()*3+1);
		String s="" + opcion;
		if(correcto) {
		switch (s) {
	case "1":
		System.out.println("La máquina ha escogido piedra");
		s = "piedra";
		break;
	case "2":
		System.out.println("La máquina ha escogido papel");
		s = "papel";
		break;
	case "3":
		System.out.println("La máquina ha escogido tijeras");
		s = "tijeras";
		break;

	default: System.out.println("No has escogido ninguna opción valida!");
		break;
		}}
		
	if (jugador1 .equals(s)) {
		System.out.println("Habeis quedado empate");
	} else if (jugador1 .equals("piedra") && s .equals("papel") || (jugador1 .equals("tijeras") && s .equals("piedra") || (jugador1 .equals("papel") && s .equals("tijeras"))) ){
		System.out.println("Has perdido");
	}else if (jugador1 .equals("piedra") && s .equals("tijeras") || (jugador1 .equals("tijeras") && s .equals("papel") || (jugador1 .equals("papel") && s .equals("piedras"))) ){
		System.out.println("Has ganado");
	}
	}

}
