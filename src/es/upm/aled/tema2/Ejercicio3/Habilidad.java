package es.upm.aled.tema2.Ejercicio3;

import java.util.List;
import java.util.ArrayList;

public class Habilidad {
	private String id;
	private int costePuntos; //coste para desbloquear esta habilidad
	private List<Habilidad> desbloqueables; //habilidades q dependen de esta
	
	public Habilidad(String id, int costePuntos) {
		this.id= id;
		this.costePuntos= costePuntos;
		this.desbloqueables = new ArrayList<Habilidad>();
	}
	public String getId() {
		return this.id;
	}
	public int getCoste() {
		return this.costePuntos;
	}
	public List<Habilidad> getDesbloqueables() {
		return this.desbloqueables;
	}
	public void addDesbloqueables(Habilidad desbloqueable) {
		this.desbloqueables.add(desbloqueable);
	}
	
	
	public static int costeRampaCompleta(Habilidad raiz) {
		if (raiz==null)
		return 0;
		
		int total= raiz.getCoste();
		
		if(raiz.getDesbloqueables() !=null) {
			for(Habilidad habilidad: raiz.getDesbloqueables()) {
				total+= costeRampaCompleta(habilidad);
			}
		}
		return total;
		
	}

}
