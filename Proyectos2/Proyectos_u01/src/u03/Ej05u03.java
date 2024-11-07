package u03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ej05u03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu fecha de cumpleaños y te diré cuanto queda para tu cumpleaños.");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String cumpleString = scan.nextLine();
		try {
			Date fechaNacDate = sdf.parse(cumpleString);
			Calendar fechaAct = Calendar.getInstance();
			Calendar fechaNac = Calendar.getInstance();
			fechaNac.setTime(fechaNacDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan.close();
	}

}
