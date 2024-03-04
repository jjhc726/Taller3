package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private static Collection<Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion){
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
	}

	public Object getRuta() {
		// TODO Auto-generated method stub
		return this.ruta;
	}

	public String getFecha() {
		// TODO Auto-generated method stub
		return this.fecha;
	}
	
	public Avion getAvion() {
		return this.avion;
	}
	
	public Collection<Tiquete> getTiquetes(){
		return tiquetes;
	}
	

}
