package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.Random;

public class ClienteNatural extends Cliente {
	
	private String nombre;
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}

	public static final String NATURAL = "Natural";

	public String getIdentificador() {
		Random random = new Random();
		int id = random.nextInt(999999999);
		return Integer.toString(id);
	}

	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return NATURAL;
	}

}
