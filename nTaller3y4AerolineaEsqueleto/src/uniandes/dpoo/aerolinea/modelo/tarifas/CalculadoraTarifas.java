package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {
	private static final Double impuesto=0.28;
	private Vuelo vuelo;
	private Cliente cliente;
	
	
	
	public Integer calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 1;
	}
	
	public abstract Integer calcularCostoBase(Vuelo vuelo, Cliente cliente);
	public abstract Double calcularPorcentajeDescuento(Cliente cliente);
	
	public Integer calcularDistanciaVuelo(Ruta ruta) {
		Aeropuerto A1 = ruta.getDestino();
		Aeropuerto A2 = ruta.getDestino();
		int distancia = Aeropuerto.calcularDistancia(A1, A2);
		return distancia;
	}
	
	public Integer calcularValorImpuesto(Integer costoBase) {
		return (int) (costoBase*impuesto);
	}
	
	
	
	
	
		
	
	
		
}