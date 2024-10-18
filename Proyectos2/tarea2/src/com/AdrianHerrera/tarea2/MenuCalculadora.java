package com.AdrianHerrera.tarea2;

import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correcto=true;
		double resultado=0;
		int num1=0;
		int num2=0;
		do {
		System.out.println("~~~~~~~~~~~~~~| CALCULADORA |~~~~~~~~~~~~");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");		
		System.out.println("3 - Multiplicación");	
		System.out.println("4 - División");
		System.out.println("5 - Raíz cuadrada");
		System.out.println("6 - Potencia");
		System.out.println("0 - Salir del programa");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		correcto=true;
		int opcion = scan.nextInt();
		num1=0;
		num2=0;
		resultado=0;
		switch (opcion) {
		case 1 : System.out.println("Voy a sumar, introduce el primer número");
			num1=scan.nextInt();
			System.out.println("introduce el segundo número");
			num2=scan.nextInt();
			resultado= num1+num2;
			break;
		case 2 : 
			System.out.println("Voy a restar, introduce el primer número");
			num1=scan.nextInt();
			System.out.println("introduce el segundo número");
			num2=scan.nextInt();
			resultado= num1-num2;
		break;
		case 3 : 
			System.out.println("Voy a multiplicar, introduce el primer número");
			num1=scan.nextInt();
			System.out.println("introduce el segundo número");
			num2=scan.nextInt();
			resultado= num1*num2;
		break;
		case 4 : 
			System.out.println("Voy a dividir, introduce el dividendo");
			num1=scan.nextInt();
			System.out.println("introduce el divisor");
			num2=scan.nextInt();
			resultado= num1/num2;
		break;
		case 5 : 
			System.out.println("Voy a hacer una raíz, introduce el radicando");
			num1=scan.nextInt();
			resultado= Math.sqrt(num1);
		break;
		case 6 : 
			System.out.println("Voy a potenciar, introduce la base");
			num1=scan.nextInt();
			System.out.println("introduce el exponente");
			num2=scan.nextInt();
			resultado= Math.pow(num1,num2);
			break;
		default: System.err.println("no has elegido ninguna opción valida, vuelve a elegir una.");
		correcto=false;
		break;
		}	} while (!correcto);
		System.out.println("El resultado es " + resultado);
		scan.close();

	}

	

}
