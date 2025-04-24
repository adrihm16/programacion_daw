package unidad05.equipo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import unidad05.util.Utilidades;
import unidad05.util.UtilidadesParametroTipoIncorrectoException;

public class TestEquipo {
    static final byte NUM_EQUIPOS = 20;
    static List<Equipo> equipos = new ArrayList<>();

    public static void main(String[] args) throws EquipoCategoriaNoValidaException, EquipoCifNoValidoException {
        equipos.add(new Equipo("Tigres FC", "A12345678", LocalDate.of(1995, 3, 15), true, 'A'));
        equipos.add(new Equipo("Leones Rojos", "B98765432", LocalDate.of(1982, 7, 10), false, 'J'));
        equipos.add(new Equipo("Águilas Doradas", "C87654321", LocalDate.of(2005, 5, 22), true, 'I'));
        
        boolean salir = false;
        do {
            System.out.println(
                    "Elige la opción deseada:\n" +
                    "1. Añadir equipo\n" +
                    "2. Modificar equipo\n" +
                    "3. Eliminar equipo\n" +
                    "4. Mostrar equipos\n" +
                    "5. Salir\n" +
                    "Opción:");
            int opcion = -1;
            try {
                opcion = Utilidades.dameEntero();
            } catch (UtilidadesParametroTipoIncorrectoException e) {
                System.err.println(e.getMessage() + ". Elija una opción del menú");
            }
            switch (opcion) {
                case 1:
                    if (equipos.size() < NUM_EQUIPOS) {
                        Equipo eq = dameEquipo();
                        if (eq != null) {
                            equipos.add(eq);
                        } else {
                            System.err.println("No se puede añadir el equipo porque los datos no son correctos.");
                        }
                    } else {
                        System.err.println("No se pueden añadir equipos porque no hay plazas disponibles");
                    }
                    break;
                case 2:
				try {
					modificarEquipo();
				} catch (UtilidadesParametroTipoIncorrectoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;
                case 3:
				try {
					eliminarEquipo();
				} catch (UtilidadesParametroTipoIncorrectoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                    break;
                case 4:
                    mostrarEquipos();
                    break;
                case 5:
                    System.out.println("Hasta la próxima!");
                    salir = true;
                    break;
                default:
                    System.err.println("La opción elegida no es correcta. Elija una opción del menú");
                    break;
            }
        } while (!salir);
    }

    private static void mostrarEquipos() {
        System.out.println("Listado de equipos");
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + equipos.get(i));
        }
    }

    private static void eliminarEquipo() throws UtilidadesParametroTipoIncorrectoException {
        System.out.println("Introduce el nombre del equipo a eliminar:");
        String nombre = Utilidades.dameCadena();
        equipos.removeIf(eq -> eq.getNombre().equalsIgnoreCase(nombre));
        System.out.println("El equipo ha sido eliminado (si existía). ");
    }

    private static void modificarEquipo() throws UtilidadesParametroTipoIncorrectoException {
        System.out.println("Introduce el nombre del equipo a modificar:");
        String nombre = Utilidades.dameCadena();
        for (Equipo eq : equipos) {
            if (eq.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Introduce el nuevo nombre del equipo:");
                eq.setNombre(Utilidades.dameCadena());
                System.out.println("Nombre cambiado con éxito");
                return;
            }
        }
        System.out.println("Equipo no encontrado");
    }

    private static Equipo dameEquipo() {
        try {
            System.out.println("Introduce el nombre del equipo");
            String nombre = Utilidades.dameCadena();
            System.out.println("Introduce el CIF del equipo");
            String cif = Utilidades.dameCadena();
            System.out.println("Introduce la fecha de fundación en formato dd/MM/yyyy");
            LocalDate fechaFund = Utilidades.dameFecha();
            System.out.println("Tiene el equipo más de 100 abonados (Sí/No)");
            boolean masCien = Utilidades.dameSiNo();
            System.out.println("Introduce la categoría en la que juega el equipo Infantil/Juvenil/Adulto (I/J/A)");
            char cat = Utilidades.dameChar();
            return new Equipo(nombre, cif, fechaFund, masCien, cat);
        } catch (UtilidadesParametroTipoIncorrectoException | EquipoCategoriaNoValidaException | EquipoCifNoValidoException e) {
            System.out.println("Los datos no son correctos: " + e.getMessage());
            return null;
        }
    }
}
