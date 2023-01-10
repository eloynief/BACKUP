package apuesta;

/**
 * 
 * @author enieves
 *
 */
public class Apuesta {

	/**
	 * dinero para disponer
	 */
    private int dineroDisp;
    /**
	 * goles del equipo local
	 */
    private int golesLocal;
    /**
	 * goles del equipo visitante
	 */
    private int golesVisitante;
    /**
	 * apuesta del dinero que introduce
	 */
    private int apostado;

    /*Contructor por defecto*/
    public Apuesta() {
    }

    /*Contructor con par�metros*/
    /**
     * 
     * @param dinero_disp
     * @param goles_local
     * @param goles_visitante
     */
    public Apuesta(int dinero_disp, int goles_local, int goles_visitante) {
        this.dineroDisp = dinero_disp;
        this.golesLocal = goles_local;
        this.golesVisitante = goles_visitante;
        this.apostado = 0;
    }
    
    /*M�todo para obtener el valor del atributo dinero_disp*/
    /**
     * 
     * @return
     */
    public int getDinero_disp() {
        return dineroDisp;
    }
    
    /*M�todo para modificar el valor del atributo dinero_disp*/
    /**
     * 
     * @param dinero_disp
     */
    public void setDinero_disp(int dinero_disp) {
        this.dineroDisp = dinero_disp;
    }

    /* M�todo para apostar.
     * Permite elegir la cantidad a apostar, no pudiendo ser inferior a 1 ni superior a tu saldo disponible
     */
    /**
     * 
     * @param dinero
     * @throws Exception
     */
    public void apostar(int dinero) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No se puede apostar menos de 1�");
        }

        if (dinero > dineroDisp) {
            throw new Exception("No se puede apostar m�s de lo que tienes");
        }
        {
            dineroDisp = dinero - dineroDisp;
            apostado = dinero;
        }
    }
    
    /* M�todo que comprueba si se ha acertado el resultado del partido
     * En caso de que lo haya acertado devuelve true. Chequea que no se metan menos de 0 goles
     */
    /**
     * 
     * @param local
     * @param visitante
     * @return
     * @throws Exception
     */
    public boolean comprobar_resultado(int local, int visitante) throws Exception {
        boolean acertado = false;
        if (local < 0 || visitante < 0) {
            throw new Exception("Un equipo no puede meter menos de 0 goles, por malo que sea");
        }

        if (golesLocal == local && golesVisitante == visitante) {
            acertado = true;
        }
        return acertado;
    }
    
    /* M�todo para cobrar la apuesta.
     * Comprueba que se acert� el resultado y, en ese caso, a�ade el valor apostado multiplicado por 10
     * al saldo disponible
     */
    /**
     * 
     * @param cantidad_goles_local
     * @param cantidad_goles_visit
     * @throws Exception
     */
    void cobrar_apuesta(int cantidad_goles_local, int cantidad_goles_visit) throws Exception {

        if (comprobar_resultado(cantidad_goles_local, cantidad_goles_visit) == false) {
            throw new Exception("No se puede cobrar una apuesta no acertada");
        }
        dineroDisp = dineroDisp * 10;

    }
}
