package u03;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FuncionesFechas {
	public static String obtenerDiaSemana(Calendar fecha) {
		String dia = "";
		switch (fecha.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "lunes";
			break;
		case 3:
			dia = "martes";
			break;
		case 4:
			dia = "miércoles";
			break;
		case 5:
			dia = "jueves";
			break;
		case 6:
			dia = "viernes";
			break;
		case 7:
			dia = "sábado";
			break;

		default:
			break;

		}
		return dia;
	}

	/*
	 * Devuelve true si la fecha del primer parámetro es posterior
	 * 
	 * @param fecha
	 * 
	 * @param fechaReferencia
	 * 
	 * @return
	 */
	public static boolean esFechaPasada(Calendar fecha, Calendar fechaReferencia) {

		return fecha.before(fechaReferencia);
	}

	
	/*
	 * @param anio
	 * @return esBisiesto
	 * */
	public static boolean esBisiesto(int anio) {
		boolean esBisiesto = false;
		if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
			esBisiesto = true;
		} else {
			esBisiesto = false;
		}
		return esBisiesto;
	}
	
	public static String formatearFechaDate(Date fecha, String formato) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		String fechaFormateada = sdf.format(fecha);
		return fechaFormateada;
	}
	
	
	
	public static String formatearFechaCalendar(Calendar fecha, String formato) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		String fechaFormateada = sdf.format(fecha);
		return  fechaFormateada;
	}
}
