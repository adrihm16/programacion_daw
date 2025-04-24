package unidad06;

import java.util.ArrayList;
import java.util.List;

public class TecladoRoto {

	public static void main(String[] args) {
		String entrada1 = "dD-3*A-E+";
		String entrada = entrada1;
		List<Character> listaEntrada = new ArrayList<Character>();
		int cursor = 0;
		for (int i = 0; i < entrada.length(); i++) {
			char letraActual = entrada.charAt(i);
			switch (letraActual) {
			case '+':
				cursor = listaEntrada.size();
				break;
			case '-':
				cursor = 0;
				break;

			case '*':
				if (cursor < listaEntrada.size()) {
					cursor++;
				}
				break;
			case '3':
				if (cursor < listaEntrada.size()) {
					listaEntrada.remove(cursor);
				}
				break;
			default:
				listaEntrada.add(cursor, letraActual);
				cursor++;
				break;
			}
		}
		for (int j = 0; j < listaEntrada.size(); j++) {
			System.out.print(listaEntrada.get(j));
		}
	}

}
