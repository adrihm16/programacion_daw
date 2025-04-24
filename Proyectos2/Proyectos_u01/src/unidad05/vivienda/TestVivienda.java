package unidad05.vivienda;

public class TestVivienda {

	public static void main(String[] args) {
		Propietario propietario = new Propietario("Juan Pérez");
		Apartamento apartamento = new Apartamento("Calle Mayor 12", 80.5f, propietario, 3, 'B');
		Casa casa = new Casa("Avenida del Sol 45", 150.0f, propietario, true, false);
		
		System.out.println(apartamento);
	}

}
