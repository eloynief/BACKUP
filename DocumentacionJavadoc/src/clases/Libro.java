package clases;

public class Libro {
	/**
	 * 
	 */
	private String titulo;
	/**
	 * 
	 */
	private String autor;
	/**
	 * 
	 */
	private int ejemplares;
	/**
	 * 
	 */
	private int prestados;
	
	//constructor por defecto
	/**
	 * 
	 */
	public Libro() {} 
	// constructor con par�metros
	/**
	 * 
	 * @param titulo
	 * @param autor
	 * @param ejemplares
	 * @param prestados
	 */
	public Libro (String titulo,String autor,int ejemplares,int prestados) {
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.prestados=prestados;
		
	}
	// constructor copia
	/**
	 * 
	 * @param lib
	 */
	public Libro( final Libro lib) {
		titulo=lib.titulo;
		autor=lib.autor;
		ejemplares=lib.ejemplares;
		prestados=lib.prestados;
		
	}
	
	//getters y setters
	/**
	 * this parameter makes a mettod which is used for 
	 * adding 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		/**
		 * 
		 */
		this.titulo=titulo;
			}
	public String getTitulo() {
		return titulo;
	}
	public void setAutor( String autor) {
		this.autor=autor;
	}
	public String getAutor() {
		return autor;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares=ejemplares;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setPrestados(int prestados) {
		this.prestados=prestados;
	}
	public int getPrestados() {
		return prestados;
	}
		
	
	//m�todo toString
	public String toString() {
		String mensaje="T�tulo: "+titulo+"\nAutor: "+autor+"\nEjemplares: "+ejemplares+"\nPrestados: "+prestados+"\n----------------\n";
		return mensaje;
		
	}
	// M�todo pr�stamo que incremente el atributo correspondiente cada vez que se realice un pr�stamo del libro. 
	//No se podr�n prestar libros de los que no queden ejemplares disponibles para prestar. 
	//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
	public boolean prestamoLibro() {
		boolean prestamo=true;
		if (prestados<ejemplares)
		{
			prestados++;
			
		}
		else
		{
			prestamo=false;
		}
		return prestamo;
	}
		
	//M�todo devoluci�n que decremente el atributo correspondiente cuando se produzca la devoluci�n de un libro
	//No se podr�n devolver libros que no se hayan prestado.
	//Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
		
	public boolean devolucionLibro() {
			boolean devuelto=true;
			if(prestados>0) {
				prestados--;
			}
			else
			{
				devuelto=false;
			}
			return devuelto;		
			
		}
	
}
