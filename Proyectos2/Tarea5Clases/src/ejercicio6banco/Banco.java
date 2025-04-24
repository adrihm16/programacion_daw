package ejercicio6banco;

public class Banco {
	private String nombre;
	private CuentaBancaria[] arrayCuentas;

	public Banco(String nombre) {
		super();
		this.nombre = nombre;
		this.arrayCuentas = new CuentaBancaria[100];
	}

	public boolean abrirCuenta(CuentaBancaria cb) {
		int i = 0;
		boolean añadido = false;
		while (i < arrayCuentas.length && !añadido) {
			if (arrayCuentas[i] == null) {
				arrayCuentas[i] = cb;
				añadido = true;
			}
			i++;
		}
		return añadido;
	}

	public void listadoCuentas() {
		System.out.println("Listado de cuentas en el banco " + nombre + ":");
		for (CuentaBancaria cuenta : arrayCuentas) {
			if (cuenta != null) {
				System.out.println(cuenta);
			}
		}
	}

	public String informacionCuenta(String iban) {
		int i = 0;
		String infoCuenta = null;
		boolean mostrada = false;
		do {
			if (arrayCuentas[i] != null && arrayCuentas[i].getIban().equals(iban)) {
				infoCuenta = arrayCuentas[i].toString();
				mostrada = true;
			}
			i++;
		} while (i < arrayCuentas.length && !mostrada);
		return infoCuenta;
	}

	public boolean ingresoCuenta(String iban, double ingreso) {
		boolean ingresado = false;
		int i = 0;
		if (ingreso <= 0) {
			System.out.println("No se pueden ingresar saldos negativos");
			return ingresado;
		}
		do {
			if (arrayCuentas[i] != null && arrayCuentas[i].getIban().equals(iban)) {
				arrayCuentas[i].setSaldo(arrayCuentas[i].getSaldo() + ingreso);
				ingresado = true;
			}
			i++;
		} while (i < arrayCuentas.length && !ingresado);
		return ingresado;
	}
	
	public boolean retiradaCuenta(String iban, double retiro) {
		boolean retirado = false;
		int i = 0;
		if (retiro <= 0) {
			System.out.println("No se pueden retirar saldos negativos");
			return retirado;
		}
		do {
			if (arrayCuentas[i] != null && arrayCuentas[i].getIban().equals(iban)) {
				arrayCuentas[i].setSaldo(arrayCuentas[i].getSaldo() - retiro);
				retirado = true;
			}
			i++;
		} while (i < arrayCuentas.length && !retirado);
		return retirado;
	}
	public Double obtenerSaldo(String iban) {
		Double saldo = null;
		boolean obtenido = false;
		int i = 0;
		do {
			if (arrayCuentas[i] != null && arrayCuentas[i].getIban().equals(iban)) {
				saldo = arrayCuentas[i].getSaldo();
				obtenido = true;
			}
			i++;
		} while (i < arrayCuentas.length && !obtenido);
		return saldo; //Return null si no se obtiene correctamente
	}
}
