package unidad05.empleados;

public class TestEmpleado {

	public static void main(String[] args) {
		Directivo jefe = new Directivo("Matilde Moreno", 3);
		jefe.realizaTarea();
		jefe.realizaTarea();
		Oficial ofi = new Oficial("Marcos Jiménez" , "mecánica", "manipulador industrial");
		ofi.realizaTarea();
		ofi.realizaTarea();
		ofi.realizaTarea();
		ofi.realizaTarea();
		ofi.realizaTarea();
		System.out.println(jefe);
		System.out.println(ofi);
	}

}
