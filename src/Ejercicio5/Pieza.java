package Ejercicio5;

import java.util.List;
import java.util.ArrayList;

public class Pieza {
	private String nombre;
	private boolean esDefectuosa;
	private List<Pieza> componentes; //piezas necesarias para montar esta
	
	public Pieza (String nombre, boolean esDefectuosa) {
		this.nombre = nombre;
		this.esDefectuosa=esDefectuosa;
		this.componentes = new ArrayList<Pieza>();
	}
	public boolean isDefectuosa() {
		return this.esDefectuosa;
	}
	public List<Pieza> getComponentes() {
		return this.componentes;
	}
	
	public static boolean contieneDefectos(Pieza piezaPrincipal) {
		if(piezaPrincipal == null)
			return false;
		//caso base: la pieza actual está defectuosa
		if (piezaPrincipal.isDefectuosa()) {
			return true;
		}
		//paso recursiva: verificar componentes
		//si encontramos uno defectuoso devolvemos true inmediatamente
		if(piezaPrincipal.getComponentes() != null) {
			for(Pieza componente: piezaPrincipal.getComponentes()) {
				if(contieneDefectos(componente)) {
					return true;
				}
			}
		}
		// si todas las piezas están bien devuelve false
		return false;
		
	}
}
