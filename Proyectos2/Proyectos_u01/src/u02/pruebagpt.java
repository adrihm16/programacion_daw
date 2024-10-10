package u02;

import java.util.Scanner;

public class pruebagpt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido, vamos a jugar a piedra, papel o tijeras!");

        boolean entradaCorrecta;
        boolean empate;
        String jugadaPlayer;
        
        do {
            entradaCorrecta = true;  // Reiniciamos el valor a true al comienzo de cada iteración
            empate = false;  // Reiniciamos el valor a false al comienzo de cada iteración

            System.out.println("Jugador elije qué vas a usar: piedra, papel o tijeras");
            jugadaPlayer = scan.nextLine().toLowerCase();

            // Validación de la entrada del jugador
            switch (jugadaPlayer) {
                case "piedra":
                    System.out.println("Has escogido piedra");
                    break;
                case "papel":
                    System.out.println("Has escogido papel");
                    break;
                case "tijeras":
                    System.out.println("Has escogido tijeras");
                    break;
                default:
                    System.out.println("No has escogido ninguna opción válida!");
                    entradaCorrecta = false;  // Si la entrada no es válida, marcamos false
                    break;
            }

            // Si la entrada no es correcta, saltamos a la siguiente iteración
            if (!entradaCorrecta) {
                continue;
            }

            // Generamos jugada de la CPU
            int jugadaCpu = (int) (Math.random() * 3 + 1);
            String jugadaCpuString = "";
            switch (jugadaCpu) {
                case 1:
                    jugadaCpuString = "piedra";
                    System.out.println("La máquina ha escogido piedra");
                    break;
                case 2:
                    jugadaCpuString = "papel";
                    System.out.println("La máquina ha escogido papel");
                    break;
                case 3:
                    jugadaCpuString = "tijeras";
                    System.out.println("La máquina ha escogido tijeras");
                    break;
            }

            // Comparamos las jugadas
            if (jugadaPlayer.equals(jugadaCpuString)) {
                System.out.println("Habéis quedado empate, " + jugadaPlayer + " empata con " + jugadaCpuString);
                empate = true;  // Si hay empate, se marca true
            } else if ((jugadaPlayer.equals("piedra") && jugadaCpuString.equals("papel"))
                    || (jugadaPlayer.equals("tijeras") && jugadaCpuString.equals("piedra"))
                    || (jugadaPlayer.equals("papel") && jugadaCpuString.equals("tijeras"))) {
                System.out.println("Has perdido, " + jugadaCpuString + " le gana a " + jugadaPlayer);
                empate = false;  // Si no es empate, se asegura que empate es false
            } else {
                System.out.println("Has ganado, " + jugadaPlayer + " le gana a " + jugadaCpuString);
                empate = false;  // Si el jugador gana, tampoco hay empate
            }

        } while (!entradaCorrecta || empate);  // Si entradaCorrecta es false o empate es true, sigue el bucle

        scan.close();
    }
}
