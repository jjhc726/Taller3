package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
	
	private String nombre;
	public ClienteNatural(String nombre) {
		this.nombre = nombre;
	}

	public static final String NATURAL = "Natural";

	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTipoCliente() {
		// TODO Auto-generated method stub
		return NATURAL;
	}

}
