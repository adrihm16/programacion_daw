package vehiculos.base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class VehiculoDAOImpl implements VehiculoDAO {

	@Override
	public void insertarVehiculo(Vehiculo v) {
		try (Connection con = DatabaseManager.getConnection()) {
			String sql = "insert into vehiculos (matricula,descripcion,dniPropietario,marca,anioMatriculacion,numKM,precio) values (?,?,?,?,?,?,?)";
			PreparedStatement query = con.prepareStatement(sql);
			query.setString(1, v.getMatricula());
			query.setString(2, v.getDescripcion());
			query.setString(3, v.getDniPropietario());
			query.setString(4, v.getMarca());
			query.setInt(5, v.getAnioMatriculacion());
			query.setInt(6, v.getNumKM());
			query.setFloat(7, v.getPrecio());
			query.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminarVehiculo(String matricula) {
		try (Connection con = DatabaseManager.getConnection()) {
			String sql = "delete from vehiculos where matricula = ?";
			PreparedStatement query = con.prepareStatement(sql);
			query.setString(1, matricula);
			query.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Vehiculo buscaVehiculo(String matricula) {
		Vehiculo vehiculo = null;
		try (Connection con = DatabaseManager.getConnection()) {
			String sql = "select matricula,descripcion,dniPropietario,marca,anioMatriculacion,numKM,precio from vehiculos where matricula= ?";
			PreparedStatement query = con.prepareStatement(sql);
			query.setString(1, matricula);
			ResultSet rs = query.executeQuery();
			if (rs.next()) {
				String cod = rs.getString("matricula");
				String desc = rs.getString("descripcion");
				String dniPropietario = rs.getString("dniPropietario");
				String marca = rs.getString("marca");
				int anioMatriculacion = rs.getInt("anioMatriculacion");
				int numKM = rs.getInt("numKM");
				float precio = rs.getFloat("precio");
				vehiculo = new Vehiculo(marca, cod, numKM, anioMatriculacion, desc, precio, dniPropietario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (vehiculoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehiculo;
	}

	@Override
	public Set<Vehiculo> obtenerVehiculos() {
		Set<Vehiculo> vehiculos = new HashSet<>();
		try (Connection con = DatabaseManager.getConnection()) {
			String sql = "select matricula,descripcion,dniPropietario,marca,anioMatriculacion,numKM,precio from vehiculos";
			PreparedStatement query = con.prepareStatement(sql);
			ResultSet rs = query.executeQuery();
			while (rs.next()) {
				String cod = rs.getString("matricula");
				String desc = rs.getString("descripcion");
				String dniPropietario = rs.getString("dniPropietario");
				String marca = rs.getString("marca");
				int anioMatriculacion = rs.getInt("anioMatriculacion");
				int numKM = rs.getInt("numKM");
				float precio = rs.getFloat("precio");
				Vehiculo vehiculo = new Vehiculo(marca, cod, numKM, anioMatriculacion, desc, precio, dniPropietario);
				vehiculos.add(vehiculo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (vehiculoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehiculos;
	}

	@Override
	public boolean actualizaKms(String matricula, int kms) {
		try (Connection con = DatabaseManager.getConnection()) {
			String sql = "update vehiculos set numKM = ? where matricula = ?";
			PreparedStatement query = con.prepareStatement(sql);
			query.setInt(1, kms);
			query.setString(2, matricula);
			int ok = query.executeUpdate();
			System.out.println("inserción " + ok);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void listarVehiculos() {
		Set<Vehiculo> vehiculos = obtenerVehiculos();
		if (!vehiculos.isEmpty()) {
			System.out.println("El concesionario tiene los siguientes vehículos:");
			for (Vehiculo v : vehiculos) {
				System.out.println(v);
			}
			System.out.println("___________________________");
		} else {
			System.out.println("El concesionario está vacío");
			System.out.println("___________________________");
		}
	}

	@Override
	public int getNumVehiculos() {
		int numVehiculos = 0;
		try (Connection con = DatabaseManager.getConnection()) {
			String sql = "SELECT COUNT(*) FROM vehiculos";
			PreparedStatement query = con.prepareStatement(sql);
			ResultSet rs = query.executeQuery();
			if (rs.next()) {
				numVehiculos = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return numVehiculos;
	}
}