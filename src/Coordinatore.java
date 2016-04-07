
/**
 * <p> È una sottoclasse di Dipendenti (classe padre).
 * @author Mattia De Pieri
 *
 */
public class Coordinatore extends Dipendenti {
	private String ruolo;
	Corso corso;
	
	/**
	 * <p> Metodo Visualizzatore utile a vedere una variabile dichiarata private.
	 * @return mi ritorna una valore String della variabile private.
	 */
	public String getRuolo() {
		return ruolo;
	}
	
	/**
	 * <p> Metodo Modificatore utile a riassegnare una valore di una variabile dichiarata private
	 * @param ruolo Parametro assegnato.
	 */
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	/**
	 * <p> Metodo Costruttore base.
	 */
	public Coordinatore() {
		
	}
	
	/**
	 * <p> Metodo costruttore con firma differente (con annessi parametri)
	 * @param ruolo Parametri Inseriti nella firma del metodo
	 */
	public Coordinatore(String ruolo, Corso corso){
		this.ruolo = ruolo;
		this.corso = corso;
	}
	
	/**
	 * <p> Metodo utile a ritornare un valore di tipo float del compenso.
	 * @return Mi ritorna una valore di tipo float del compenso.
	 */
	public float calcolaCompenso(){
		return 1200;
	}

}
