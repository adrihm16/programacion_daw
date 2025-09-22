package vehiculos.base;

import java.util.Set;

public interface VehiculoDAO {
	void insertarVehiculo(Vehiculo v);
	void eliminarVehiculo(String matricula);
	Vehiculo buscaVehiculo(String matricula);
	Set<Vehiculo> obtenerVehiculos();
	boolean actualizaKms(String matricula, int kms);
	void listarVehiculos();
	int getNumVehiculos();
}
