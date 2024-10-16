package u02.boletin02;

import java.util.Scanner;

public class U2_E20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("introduce n");
		int n = scan.nextInt();
		int numActual= 2;
		int numAnt1=1;
		int numAnt2=0;
		System.out.println(0);
		System.out.println(1);
		System.out.println(1);
		
			for (int index = 2 ; index <= n; index = numAnt1+numAnt2) {
				numAnt2=numAnt1;
				numAnt1=numActual;
				numActual=index;
				System.out.println(index);
			

		}scan.close();
	}

}
