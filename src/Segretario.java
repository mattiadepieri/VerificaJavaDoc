
/**
 * <p> È una sottoclasse di Dipendenti (classe padre).
 * @author Mattia De Pieri
 *
 */
public class Segretario extends Dipendenti {
	public Corso corso;
	
	/**
	 *<p> metodo costruttore di base. 
	 */
	public Segretario() {
		
	}
	
	/**
	 * <p> Metodo costruttore con firma differente (con annessi parametri)
	 * @param corso parametro inserito nellaq firma del metodo
	 */
	public Segretario (Corso corso){
		this.corso = corso;
	}
	

}
