package es.upm.aled.tema2.Ejercicio1;

public class UtilsCarpeta {
	
	//Implemente el método recursivo calcularPesoTotal:debe devolver la suma total
	//del peso (en MB) de una Carpeta y todo su contenido (archivos directos y archivos dentro de subcarpetas, recursivamente
	
	public static double calcularPesoTotal(Carpeta inicio) {
		 // Caso base implícito: si la carpeta no tiene archivos ni subcarpetas,
	    // los bucles no se ejecutan y devuelve 0.0.
	    
	    if (inicio == null) return 0.0; // Protección contra null

		double pesoTotal=0.0; //inicializamos acumulador
		
		if(inicio.getArchivos() != null) {
			for(Archivo archivo: inicio.getArchivos()) {
			pesoTotal += archivo.getPesoMB();
			}
		}
		
		if (inicio.getSubcarpetas() != null) {
			for(Carpeta sub : inicio.getSubcarpetas()) {
			pesoTotal += calcularPesoTotal(sub);
			}
		}
		return pesoTotal;
	}
}
