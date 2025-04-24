package unidad06.ejercicioCollecion;

import java.util.ArrayList;
import java.util.List;

public class Coleccion {
private List<Producto> lista = new ArrayList< Producto >();
 public int tamanio(){
	 int tamaño = lista.size();
	 return tamaño;
//Devuelve el tamaño de la lista
 }
 public void aniadir(Producto e){
	 lista.add(e);
//Añade un elemento tipo Producto en la lista
 }
 public void eliminar(int pos){
	 lista.remove(pos);
//Borra un elemento indicando la posición
 }
 public Producto obtener(int pos){
//Devuelve el elemento de una posición
	return lista.get(pos);
 }
 public Producto buscar(int cod){
for (Producto producto : lista) {
	if (cod == producto.getCodigo()) {
		return producto;
	}
}
//Recorre la lista y busca si el código del producto
// si coincide con cod devuelve el producto
//y si no está el la lista devuelve null
return null;

 }
//Más tarde se añadirán los métodos
//public void mostrarTodo()
 public void mostrarTodo() {
	for (Producto producto : lista) {
		System.out.println(producto);
	}
}
 public void aumentoPrecio(double porc) {
	 
 }
//public void aumentoPrecio(double porcentaje)
}