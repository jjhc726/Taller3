package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifas {
	private Double impuesto=0.28;
	private Vuelo vuelo;
	private Cliente cliente;
	
	
	
	public Integer calcularTarifa(Vuelo vuelo, Cliente cliente) {
		return 1;
	}
	
	public Integer calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 1;
	}
	
	public Double calcularPorcentajeDescuento(Cliente cliente) {
		return 1;
	}
	
	public Integer calcularDistanciaVuelo(Ruta ruta) {
		return 1;
	}
	
	public Integer calcularValorImpuesto(Integer costoBase) {
		return 1;
	}
	
	
	
	
	
		
	
	
		
}