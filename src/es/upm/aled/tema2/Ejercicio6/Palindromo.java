package es.upm.aled.tema2.Ejercicio6;

public class Palindromo {

	//palíndromo: devuelva true si la cadena de texto se lee igual al derecho y al revés
	
	public static boolean esPalindromo(String texto) {
	//caso base es una cadena de longitud 0 o 1
	if (texto==null || texto.length() <= 1) {
		return true;
	}
	
	//extremos
	char primero = texto.charAt(0);
	char ultimo = texto.charAt(texto.length()-1);
	
	if (primero != ultimo) {
		return false;
	}
	
	//paso recursivo llama con la subcadena interior
	return esPalindromo(texto.substring(1, texto.length()- 1));
	}
}
