
/**
 * @author Mattia De Pieri
 *
 */
public class Corso  {
	/**
	 *<p> attributo per il Titolo. 
	 */
	public String Titolo;
	private int durata;
	public Docente Docente[] = new Docente [100];  //Array di inserimento docenti.
	
	
	
	/**
	 * <p> Metodo Visualizzatore utile a vedere una variabile dichiarata private.
	 * @return mi ritorna una valore int della variabile private.
	 */
	public int getDurata() {
		return durata;
	}
	
	/**
	 * <p> Metodo Modificatore utile a riassegnare una valore di una variabile dichiarata private.
	 * @param durata
	 */
	public void setDurata(int durata) {
		this.durata = durata;
	}
	
	/**
	 * <p> Metodo Costruttore base.
	 */
	public Corso() {
		
	}
	
	/**
	 * <p> Metodo costruttore con firma differente (con annessi parametri)
	 * @param Titolo Parametro Inserito nella firma del metodo
	 * @param durata Parametro Inserito nella firma del metodo
	 */
	public Corso (String Titolo, int durata){
		this.durata = durata;
		this.Titolo = Titolo;
	}
	
	/**
	 * <p> Metodo utile ad aggiungere un Docente.
	 * @param Docente
	 */
	public void addDocente(Docente d1){
		
	}
		
		
	/**
	 * <p> Questo metodo mi è utile per rimuovere un docente.
	 * @param m
	 */
	public void removeDocente (String m){
		
	}



}
