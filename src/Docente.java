
/**
 * <p> È una sottoclasse di Dipendenti (classe padre).
 * @author Mattia De Pieri
 *
 */
public class Docente extends Dipendenti {
	
	private String materia;
	private String matricola;
	
	
	/**
	 * <p> Metodo Visualizzatore utile a vedere una variabile dichiarata private.
	 * @return mi ritorna una valore String della variabile private.
	 */
	public String getMateria() {
		return materia;
	}
	
	/**
	 *<p> Metodo Modificatore utile a riassegnare una valore di una variabile dichiarata private.
	 * @param  materia 
	 */
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	/**
	 * <p> Metodo Visualizzatore utile a vedere una variabile dichiarata private.
	 * @return mi ritorna una valore String della variabile private.
	 */
	public String getMatricola() {
		return matricola;
	}
	
	/**
	 * <p> Metodo Modificatore utile a riassegnare una valore di una variabile dichiarata private.
	 * @param matricola
	 */
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	/**
	 *<p> metodo costruttore di base. 
	 */
	public Docente() {
		
	}
	
	/**
	 * <p> Metodo costruttore con firma differente (con annessi parametri)
	 * @param materia parametro inserito nellaq firma del metodo
	 * @param matricola parametro inserito nellaq firma del metodo
	 */
	public Docente (String materia, String matricola){
		this.materia = materia;
		this.matricola = matricola;
	}
	
	

	

}
