package es.upm.aled.tema2.Ejercicio1;

public class Archivo {
	private String nombre;
	private double pesoMB;
	
	public Archivo(String nombre, double peso) {
		this.nombre=nombre;
		this.pesoMB=peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPesoMB() {
		return this.pesoMB;
	}

}
