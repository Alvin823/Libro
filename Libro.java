
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numero)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numero;
        numeroReferencia = "";
        vecesPrestado = 0;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    public void prestar(){
        vecesPrestado = vecesPrestado + 1;
    }

    public int getVecesPrestado(){
        return vecesPrestado;
    }

    public void setNumeroReferencia(String numero) {
        if (numeroReferencia.length() < 3) {
            System.out.println("Longitud anterior demasiado corta");
        }
        else {
            numeroReferencia = numero;   
        }

    }

    public String getDetalles() {
        String numeroDetalle = numeroReferencia;
        if(numeroDetalle == "") {
            numeroDetalle = "ZZZ";    
        }
        String detalles = "T�tulo:" + titulo + "Autor:" + autor + "P�ginas:" + numeroPaginas + "N�mero de Referencia:" + numeroDetalle + "N�mero de veces prestado:" + vecesPrestado;
        return detalles;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void imprimeAutor() {
        System.out.println(autor);
    }

    public void imprimeTitulo() {
        System.out.println(titulo);
    }

    public void imprimeDetalles() {
        String numeroDetalle = numeroReferencia;
        if(numeroDetalle == "") {
            numeroDetalle = "ZZZ";    
        }

        String detalles = "T�tulo:" + titulo + "Autor:" + autor + "P�ginas:" + numeroPaginas + "N�mero de Referencia:" + numeroDetalle + "N�mero de veces prestado:" + vecesPrestado;
        System.out.println(detalles);
    }
}
