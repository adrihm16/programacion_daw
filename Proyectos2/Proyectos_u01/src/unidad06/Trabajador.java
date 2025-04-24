package unidad06;

public class Trabajador {
private int trabajo;
private int litros;

public Trabajador(int trabajo, int litros) {
	this.trabajo = trabajo;
	this.litros = litros;
}
public int getTrabajo() {
	return trabajo;
}
public void setTrabajo(int trabajo) {
	this.trabajo = trabajo;
}
public int getLitros() {
	return litros;
}
public void setLitros(int litros) {
	this.litros = litros;
}

}
