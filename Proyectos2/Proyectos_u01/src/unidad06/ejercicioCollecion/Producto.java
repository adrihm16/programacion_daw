package unidad06.ejercicioCollecion;

	public class Producto {
		private int codigo;
		private String nombre;
		private String tipo;
		private double precio;
		private int existencias;

		public Producto(int cod, String nom, String tp, double pvp, int stock) {
			codigo = cod;
			nombre = nom;
			tipo = tp;
			precio = pvp;
			existencias = stock;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}

		public int getExistencias() {
			return existencias;
		}

		public void setExistencias(int existencias) {
			this.existencias = existencias;
		}

	}


