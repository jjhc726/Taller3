package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.GeneradorTiquetes;

public abstract class Cliente {
	
	
	
	public Cliente() {
		
	}
	
	public abstract String getTipoCliente();

	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete)
	{
		GeneradorTiquetes.registrarTiquete(tiquete);
	}
	
	public int calcularValorTotalTiquetes()
	{
		
	}
	
	
}
