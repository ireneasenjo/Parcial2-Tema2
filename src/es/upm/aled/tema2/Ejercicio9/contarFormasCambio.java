package es.upm.aled.tema2.Ejercicio9;

public class contarFormasCambio {
	public static int contarFormasCambio(int objetivo, int [] monedas) {
		//los casos bases son objetivo == 0, objetivo <0 (se pasó) y no quedan monedas
		//definimos el array con los valores de las monedas según el índice del array
		//nos dicen que 0->1, 1->2, 2->5
		int[] valores = {1, 2, 5};
		return contarAux(objetivo, monedas, valores, 2); //llamada al auxiliar empezando con la moneda más grande(índice 2)	
	}
	
	//método contarAux q impone un orden en el uso de monedas
	//queremos evitar contar permutaciones (1+2 y 2+1) como distintas
	private static int contarAux(int objetivo, int[] cantidades, int[] valores, int indiceMoneda) {
		//caso base
		if (objetivo == 0) return 1; // solución encontrada, tenemos una forma
		if (objetivo <0) return 0; 
		if (indiceMoneda < 0) return 0;
		
		int valorActual = valores[indiceMoneda]; //guardamos la moneda con la que vamos a trabajar
		int cantidadDisponible = cantidades[indiceMoneda];
		int formas = 0;
		
		//probamos a usar desde 0 hasta cantidadDisponible monedas de este tipo
		for (int i=0; i<= cantidadDisponible; i++) {
			int sumaActual = i*valorActual;
			
			// Si nos pasamos, dejamos de probar (optimización)
			if (sumaActual > objetivo)
				break;

			// Llamada recursiva con el objetivo restante y pasando al siguiente tipo de moneda
			// Pasamos cantidades tal cual porque vamos a trabajar con otro tipo de moneda
			formas += contarAux(objetivo - sumaActual, cantidades, valores, indiceMoneda - 1);
		}
		return formas;
	}
}
