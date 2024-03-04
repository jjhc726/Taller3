package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja{
	private Integer costoPorKmNatural = 600;
	private Integer costoPorKmCorporativo = 900;
	private Double descuentopeq = 0.02;
	private Double descuentomedianas = 0.1;
	private Double descuentograndes = 0.2;
		
	public Integer calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 1;
	}
		
	public Double porcentajeDescuento(Cliente cliente) {
		return 1;
	}
}