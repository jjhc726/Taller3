package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta{
	private Integer costoPorKm=1000;
	
	public Integer calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 1;
	}
	
	public Double calcularPorcentajeDescuento(Cliente cliente) {
		return 1;
	}
}
