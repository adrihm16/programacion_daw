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
			if (arrayCuentas[i].getIban().equals(iban)) {
                infoCuenta = arrayCuentas[i].toString();
                mostrada = true;
            }
			i++;
		} while (i < arrayCuentas.length && !mostrada);
		return infoCuenta;
	}

}
