package uniandes.dpoo.aerolinea.tiquetes;

import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	
	private String codigo;
	private Vuelo vuelo;
	private Cliente clienteComprador;
	private int tarifa;
	private boolean usado;
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		// TODO Auto-generated constructor stub
		this.codigo = codigo;
		this.vuelo = vuelo;
		this.clienteComprador = clienteComprador;
		this.tarifa = tarifa;
		this.usado = false;
	}

	public Cliente getCliente()
	{
		return this.clienteComprador;
	}
	
	public Vuelo getVuelo() {
		return this.vuelo;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	private int getTarifa() {
		return this.tarifa;
	}
	
	private void marcarComoUsado() {
		this.usado = true;
	}
	
	private boolean esUsado() {
		return this.usado;
	}

}
