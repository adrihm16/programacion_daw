package u02;
 
import java.util.Scanner;

/*
 * Introduciendo un año de nacimiento el programa dira si es
 * bebe: 0-2 años
 * niñ@: 3-11 años
 * adolescente: 12-18 años
 * adulto: 19-65 años
 * anciano: +65 años
 * */
public class EtapaVital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("introduce el año de nacimiento:");
		int AnioNacimiento = scan.nextInt();
		int Edad = (2024 - AnioNacimiento);
		if (Edad<0) {
			System.err.println("No puedes tener 0 años!");
		}
		if (Edad < 3) {
			System.out.println("La persona es un@ bebe!");
			
		}else  if (Edad < 12) {
			System.out.println("La persona es un@ niñ@!");
		}
		else  if (Edad <19) {
			System.out.println("La persona es un@ adolescente!");
		}	
		else  if (Edad <66) {
			System.out.println("La persona es un@ adult@!");
		}	
		else  {
			
			System.out.println("La persona es un@ ancian@!");
		}	
		
		
		scan.close();
	}

}
