package com.adrian.tareau4;

import java.util.Scanner;

public class actividad3ahorcado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char letras[] = new char[10];
		
		String[] frutasYVerduras = { "zanahoria", "mandarina", "limon", "aguacate", "patata", "espinaca", "fresa",
				"mango", "manzana", "coliflor" };
	
		int opcion1 = 0;
		
		int intentos=0;

		boolean partidaPerdida = false;
		do {
			boolean palabraCorrecta = true;
			System.out.println("Introduce una opción:\n1.- Jugar\n2.- Finalizar el juego");
			opcion1 = sc.nextInt();
			sc.nextLine(); 

			switch (opcion1) {
			case 1:
				intentos=0;
				partidaPerdida=false;
				String palabra = frutasYVerduras[(int) (Math.random() * frutasYVerduras.length)];
				for (int i = 0; i < Math.min(letras.length, palabra.length()); i++) {
					letras[i] = palabra.charAt(i);
				}

				String opcion2;
				do {
					System.out.println("Elige una opción:\nL.- Probar letra\nR.- Resolver palabra\nS.- Salir");
					opcion2 = sc.nextLine();
					opcion2 = opcion2.toLowerCase();

					switch (opcion2) {
					case "l":
						if (intentos<5) {
							System.out.println("Te quedan " + (5-intentos) +" intento(s)");
							intentos++;
							System.out.print("Ingresa una letra: ");
							char letraSelect = sc.next().charAt(0);
							sc.nextLine();
							for (int i = 0; i < letras.length; i++) {
								if (i < palabra.length() && letras[i] == letraSelect) {
									System.out.print(letras[i]+" ");
								} else if (i < palabra.length() && letras[i] != letraSelect){
									System.out.print("_ ");
								}else {
									System.out.println();
								}
							}	
						} else {
							System.out.println("Ya has usado los cinco intentos, has perdido, la palabra era " + palabra +".");
							partidaPerdida=true;
						}
						
						break;

					case "r":
						if (intentos<5) {
							System.out.println("Te quedan " + (5-intentos) +" intento(s)");
							intentos++;
							System.out.print("Ingresa la palabra: ");
							String palabraSelect = sc.next();
							sc.nextLine();
							if (palabraSelect.equalsIgnoreCase(palabra)) {
	                            System.out.println("¡Correcto! La palabra era: " + palabra);
	                            opcion2 = "s";
	                        } else {
	                            System.out.println("Respuesta incorrecta.");
	                        }
						} else {
							System.out.println("Ya has usado los cinco intentos, has perdido, la palabra era " + palabra +".");
							partidaPerdida=true;
						}
						
						break;

					case "s":
						System.out.println("Saliendo de la partida.");
						break;

					default:
						System.out.println("Opción no válida. Intenta de nuevo.");
						break;
					}
				} while (!opcion2.equals("s") && !partidaPerdida);
				break;

			case 2:
				System.out.println("Finalizando el juego. ¡Hasta pronto!");
				break;

			default:
				System.out.println("No has introducido una opción válida.");
				break;
			}

		} while (opcion1 != 2);

		sc.close();
	}
}
