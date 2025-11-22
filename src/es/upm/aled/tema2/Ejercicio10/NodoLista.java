package es.upm.aled.tema2.Ejercicio10;


public class NodoLista {
	int dato;
	NodoLista siguiente;

	public NodoLista(int dato) {
		this.dato = dato;
	}

	public NodoLista getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoLista siguiente) {
		this.siguiente = siguiente;
	}

	public int getDato() {
		return dato;
	}

//dadas dos listas enlazadas simples l1 y l2 que ya están ordenadas de menor a mayor
//implementar método recursivo q devuelva una única lista ordenada fusionando ambas

	public static NodoLista fusionarListas(NodoLista l1, NodoLista l2) {
		//caso base si una lista es nula devolvemos la otra
		if(l1==null) return l2;
		if(l2==null) return l1;
		
		//paso recursivo
		if (l1.dato <= l2.dato) {
			//l1 es menor por lo q será la cabecera actual
			//su siguiente será el resultado de fusionar el resto de l1 con l2
			l1.siguiente = fusionarListas(l1.siguiente, l2);
			return l1;
		} else {
			// l2 menor
			l2.siguiente = fusionarListas(l1, l2.siguiente);
			return l2;
		}
	}
	
	//método para imprimir la lista
	private static void imprimirLista(NodoLista nodo) {
		System.out.print("[");
        while (nodo != null) {
            System.out.print(nodo.dato);
            if (nodo.siguiente != null) System.out.print(" -> ");
            nodo = nodo.siguiente;
        }
        System.out.println("]");
    
		}
	
	
	//para crear una lista desde un array de enteros
	private static NodoLista crearLista(int... valores) {
		if (valores.length == 0) return null;
		NodoLista cabeza = new NodoLista(valores[0]);
		NodoLista actual = cabeza;
		for (int i=1; i< valores.length; i++) {
			actual.siguiente = new NodoLista(valores[i]);
			actual = actual.siguiente;
		}
		return cabeza;
	}
}
