package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar
	private String horaSalida;
	private String horaLlegada;
	private String codigoRuta;
	private Aeropuerto origen;
	private Aeropuerto destino;
	
	
	public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta) {
		this.origen = origen;
		this.destino = destino;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
	}

    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

	public String getCodigoRuta() {
		// TODO Auto-generated method stub
		return this.codigoRuta;
	}
	
	public Aeropuerto getOrigen() {
		return this.origen;
	}
	
	public Aeropuerto getDestino() {
		return this.destino;
	}
	
	public String getHoraSalida() {
		return this.horaSalida;
	}
	
	public String getHoraLlegada() {
		return this.horaLlegada;
	}
	
	public int getDuracion() {
		int h_llegada = getHoras(getHoraLlegada());
		int m_llegada = getMinutos(getHoraLlegada());
		int h_salida = getHoras(getHoraSalida());
		int m_salida = getMinutos(getHoraSalida());
		
		int h = 0;
		int m = 0;
		
		if(h_llegada>=h_salida)
		{
			h=h_llegada-h_salida;
		}else {
			h=24-h_llegada-h_salida;
		}
		if(m_llegada>=m_salida) {
			m=m_llegada-m_salida;
		}else {
			m=60-m_salida+m_llegada;
			h--;
		}
		h=h*60;
		int duracion = h+m;
		return duracion;
	}

    
}
