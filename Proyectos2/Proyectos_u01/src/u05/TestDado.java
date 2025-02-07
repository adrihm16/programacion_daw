package u05;

import u05.exceptions.DadoNoPermitidoException;

public class TestDado {

	public static void main(String[] args) {
		try {
			Dado dadoCuatro = new Dado((short) 4);
			System.out.println(dadoCuatro);
			int lance1 = dadoCuatro.lanzar();
			int lance2 = dadoCuatro.lanzar();
			int lance3 = dadoCuatro.lanzar();
			int lance4 = dadoCuatro.lanzar();
			int lance5 = dadoCuatro.lanzar();
			int lance6 = dadoCuatro.lanzar();
			int lance7 = dadoCuatro.lanzar();
			int lance8 = dadoCuatro.lanzar();
			int lance9 = dadoCuatro.lanzar();
			System.out.println(dadoCuatro);
		} catch (DadoNoPermitidoException e) {
			System.out.println(e.getMessage());
		}
	}

}
