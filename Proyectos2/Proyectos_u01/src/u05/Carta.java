package u05;
import java.util.Objects;

public class Carta {
	//Atributos
	final String[] ORDEN_PALOS = {"OROS", "COPAS", "ESPADAS", "BASTOS"};
	final String[] ORDEN_NUMEROS = {"A", "K", "Q", "J", "10", "9", "8", "7","6","5","4","3","2","1"};
	private String palo;
	private String numero;
	
	// Constructores
	public Carta(String palo, String numero) {
		this.palo = palo;
		this.numero = numero;
	}
	public Carta() {
		this.palo = "oros";
		this.numero = "2";
	}
	// getters y setters

	/**
	 * @return the palo
	 */
	public String getPalo() {
		return this.palo;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return this.numero;
	}

	// métodos
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.numero).append(" ").append(this.palo);
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	public boolean equals(Carta carta) {
		boolean igualPalo = this.palo.equalsIgnoreCase(carta.getPalo());
		boolean igualNumero = this.numero.equalsIgnoreCase(carta.getNumero());
		return igualPalo && igualNumero;
	}
	/**
	 * Devuelve true si la carta pasada por parámetro es mayor que la actual
	 * orden establecido:
	 * oros > copas > espadas > bastos
	 * A > K > Q > J > 10 > ... > 2
	 * @param carta
	 * @return
	 */

	
	public Carta[] crearBaraja() {
		Carta[] baraja = new Carta [ORDEN_NUMEROS.length*ORDEN_PALOS.length];
		for (int i = 0; i < ORDEN_PALOS.length; i++) {
		
			for (int j = 0; j < ORDEN_NUMEROS.length; j++) {
				baraja [i] = new Carta(ORDEN_NUMEROS [i], ORDEN_PALOS[j]);
}
		}
		return baraja;
	}
	}