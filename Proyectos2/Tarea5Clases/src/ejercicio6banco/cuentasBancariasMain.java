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
		CuentaBancaria cuentaEmpresa1 = new CuentaCorrienteEmpresa(persona1, 5000, "Manuel,Juan", 1000, 0.05d);

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
		System.out.println("Información de la cuenta:");
		System.out.println(banco.informacionCuenta(cuentaAhorro1.getIban()));
		System.out.println("Probando con un iban incorrecto (Devuelve null).");
		System.out.println(banco.informacionCuenta("hola")+"\n");
		
		// Probar ingreso, retirada y obtener saldo
		System.out.println("Funcionamiento ingreso, retirada y obtener el saldo:");
		System.out.println("Antes de ingresar y retirar el saldo es:");
		System.out.println(banco.obtenerSaldo(cuentaAhorro1.getIban()));
		double ingreso = 50d;
		System.out.println("Ingresando 50");
		System.out.println(banco.ingresoCuenta(cuentaAhorro1.getIban(), ingreso));
		System.out.println(banco.obtenerSaldo(cuentaAhorro1.getIban()));
		System.out.println("Ahora retiramos 49");
		double retirada = 49d;
		System.out.println(banco.retiradaCuenta(cuentaAhorro1.getIban(), retirada));
		System.out.println(banco.obtenerSaldo(cuentaAhorro1.getIban()));
		System.out.println("Para probar en algun fracaso, retiraremos -2");
		double retiradaErronea = -2d;
		System.out.println(banco.retiradaCuenta(cuentaAhorro1.getIban(), retiradaErronea));
		System.out.println(banco.obtenerSaldo(cuentaAhorro1.getIban()));
	}

}
