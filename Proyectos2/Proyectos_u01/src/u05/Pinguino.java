package u05;

public class Pinguino extends Ave {

	public Pinguino(String lugarNacimiento) {
		super(lugarNacimiento, Boolean.FALSE);
	}
	public void maulla() {
		System.out.println("está pescando");
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		String volador = this.isVolador() ? "volador" : "no volador";
		sb.append("El animal es un pinguino. Que es un animal ").append(volador).append("\n").append(super.toString());
		return sb.toString();
	}
}
