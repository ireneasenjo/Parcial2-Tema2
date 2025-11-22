package es.upm.aled.tema2.Ejercicio8;


import es.upm.aled.tema2.Ejercicio7.Nodo;

public class NodoLista {
	int dato;
	NodoLista siguiente;
	
	public NodoLista(int dato) {
		this.dato=dato;
	}
	public NodoLista getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoLista siguiente) {
		this.siguiente=siguiente;
	}
	
	public static NodoLista invertirRecursivo (NodoLista actual) {
		
	//caso base: lista vacía o único elemento
	if (actual == null || actual.siguiente == null) {
		return actual;
	}
	//Paso recursivo: invertir el resto de la lista
	//nuevaCabecera será el último elemento de la lista originall
	NodoLista nuevaCabecera = invertirRecursivo(actual.siguiente);
	
	//Lógica de inversión 
	//actual.siguiente es el nodo que va después del actual
	//hacemos que ese nodo apunte hacia atrás (a actual)
	actual.siguiente.siguiente = actual;
	
	//El actual pasa a ser el último (por ahora) así que apunta a null
	actual.siguiente = null;
	
	return nuevaCabecera;
	}
}
