package unidad05.empleados;

public class Tecnico extends Operario {
	private String especialidad;

	public Tecnico() {
		// TODO Auto-generated constructor stub
	}

	public Tecnico(String nombre, String tipoMaquinaria, String especialidad) {
		super(nombre, tipoMaquinaria);
		this.especialidad = especialidad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizaTarea() {
		// TODO Auto-generated method stub

	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
