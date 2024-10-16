package com.AdrianHerrera.tarea2;

import java.util.Scanner;

public class intrNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numIntr =Integer.MIN_VALUE;
		int mayor= Integer.MIN_VALUE;
		int menor= Integer.MIN_VALUE;
		int suma=0;
		int media=0;
		do {
	numIntr =1;
	System.out.println("Introduce varios números y te diré cual es");
	System.out.println("el menor");
	System.out.println("el mayor");
	System.out.println("la suma de todos");
	System.out.println("la media aricmética de todos");
	numIntr=scan.nextInt();
	if (numIntr>=mayor) {
		numIntr=mayor;
	}
	if(numIntr<=menor) {
	numIntr=menor;
	}
	}while (numIntr!=0);
		System.out.println(mayor);
		System.out.println(menor);
scan.close();
		}
	}


