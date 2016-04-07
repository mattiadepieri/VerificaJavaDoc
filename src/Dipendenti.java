import java.util.Date;

/**
 * @author Mattia De Pieri
 *
 */
public class Dipendenti {
	/**
	 *<p> attributo per il cf.
	 */
	public String cf;
	
	/**
	 *<p> attributo per il nome 
	 */
	public String nome;
	
	/**
	 *<p> attributo per il cognome. 
	 */
	public String cognome;
	
	/**
	 *<p> attributo per la data di assunzione. 
	 */
	public Date dataAssunzione;
	
	/**
	 *<p> Metodo costruttore di base. 
	 */
	public Dipendenti() {
	}		
	
	
	/**
	 * <p> Metodo costruttore con firma differente (con annessi parametri)
	 * @param cf parametro inserito nellaq firma del metodo
	 * @param nome parametro inserito nellaq firma del metodo
	 * @param cognome parametro inserito nellaq firma del metodo
	 * @param dataAssunzione parametro inserito nellaq firma del metodo
	 */
	public Dipendenti(String cf, String nome, String cognome, Date dataAssunzione){
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
		this.dataAssunzione = dataAssunzione;
	}

}
