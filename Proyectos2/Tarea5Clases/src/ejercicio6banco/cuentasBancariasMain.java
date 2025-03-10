package ejercicio6banco;

import tareaBanco.persona.Persona;

public class cuentasBancariasMain {
	public static void main(String[] args) {
		// Crear personas para las cuentas
		Persona persona1 = new Persona("Juan", "Pérez");
		Persona persona2 = new Persona("Ana", "Gómez");
		Persona persona3 = new Persona("Carlos", "López");

		// Crear cuentas bancarias
		CuentaBancaria cuentaAhorro1 = new cuentaAhorro(persona1, 1500);
		CuentaBancaria cuentaCorrientePersonal1 = new CuentaCorrientePersonal(persona2, 2000, "Antonio, Ana");
		CuentaBancaria cuentaCorrientePersonal2 = new CuentaCorrientePersonal(persona3, 2500, "Carlos");
		CuentaBancaria cuentaEmpresa1 = new CuentaCorrienteEmpresa(persona1, 5000, "Manuel,Juan", 1000);

		// Crear banco
		Banco banco = new Banco("Banco Central");

		// Abrir cuentas en el banco
		banco.abrirCuenta(cuentaAhorro1);
		banco.abrirCuenta(cuentaCorrientePersonal1);
		banco.abrirCuenta(cuentaCorrientePersonal2);
		banco.abrirCuenta(cuentaEmpresa1);

		// Mostrar listado de cuentas
		banco.listadoCuentas();

		// Probar informacionCuenta
		cuentaCorrientePersonal1.setIban("ES4567891234567891234"); // El método setIban debería tener un check, pero
																	// realmente nunca se va a usar. Solo lo he creado
																	// para probar esta función.
		banco.informacionCuenta("ES4567891234567891234");
	}

}
