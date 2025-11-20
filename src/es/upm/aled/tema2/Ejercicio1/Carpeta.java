package es.upm.aled.tema2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

//carpeta que puede contener archivos y otras subcarpetas
public class Carpeta {
	private String nombre;
	private List<Archivo> archivos; //archivos directos en la carpeta
	private List<Carpeta> subcarpetas; //carpetas dentro de esta carpeta
	
	public Carpeta(String nombre, List<Archivo> archivos, List<Carpeta> subcarpetas) {	
		this.nombre = nombre;
		this.archivos = new ArrayList<Archivo>();
		this.subcarpetas = new ArrayList<Carpeta>() ;
	}
	
	public String getNombre() {
		return nombre;
	}
	public List<Archivo> getArchivos() {
		return this.archivos;
	}
	public List<Carpeta> getSubcarpetas() {
		return this.subcarpetas;
	}
	
	public void addArchivo(Archivo archivo) {
		this.archivos.add(archivo);
	}
	public void addSubcarpeta(Carpeta subcarpeta) {
		this.subcarpetas.add(subcarpeta);
	}
	

}
