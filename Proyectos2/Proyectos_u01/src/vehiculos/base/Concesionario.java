package vehiculos.base;

import java.util.Set;

public class Concesionario {

	private VehiculoDAOImpl vehiculoDao;

	public Concesionario() {
		this.vehiculoDao = new VehiculoDAOImpl();
	}

	/**
	 * Busca el vehículo del concesionario que tiene la matrícula que se pasa por
	 * parámetro. En caso de que no se encuentre un vehículo con dicha matrícula,
	 * devuelve null.
	 * 
	 * @param matricula
	 * @return vehiculo
	 */
	public Vehiculo buscaVehiculo(String matricula) {
		return vehiculoDao.buscaVehiculo(matricula);
	}

	/**
	 * Inserta un nuevo vehículo al concesionario. Devuelve 0 si el vehículo se
	 * añade correctamentey devuelve -2 si el vehículo con esa matrícula ya existe
	 * en el concesionario
	 * 
	 * @param v
	 * @return codReturn
	 */
	public int insertarVehiculo(Vehiculo v) {
		if (vehiculoDao.buscaVehiculo(v.getMatricula()) != null) {
			return -2; // ya exste
		}
		vehiculoDao.insertarVehiculo(v);
		return 0; // correcto
	}

	/**
	 * Lista los vehículos del concesionario imprimiendo por pantalla.
	 */
	public void listarVehiculos() {
		vehiculoDao.listarVehiculos();
	}

	/**
	 * Actualiza los kilómetros del vehículo con la matrícula pasada por parámetro.
	 * Devuelve true si se ha actualizado correctamente y false si el vehículo con
	 * esa matrícula no se encuentra.
	 * 
	 * @param matricula
	 * @param kms
	 * @return kmsActualizado
	 */
	public boolean actualizaKms(String matricula, int kms) {
		return vehiculoDao.actualizaKms(matricula, kms);
	}

	/**
	 * Elimina el vehículo de vehículos del concesionario que coincide con la
	 * matrícula pasada como parámetro. Devuelve true en caso de que haya eliminado
	 * correctamente el vehículo y false si ha habido un fallo.
	 * 
	 * @param matricula
	 * @return eliminado
	 */
	public boolean eliminarVehiculo(String matricula) {
		if (vehiculoDao.buscaVehiculo(matricula) == null) {
			return false;
		}
		vehiculoDao.eliminarVehiculo(matricula);
		return true;
	}

	/**
	 * Devuelve el número total de vehículos en el concesionario.
	 * 
	 * @return numVehiculos
	 */
	public int getNumVehiculos() {
		return vehiculoDao.getNumVehiculos();
	}
}