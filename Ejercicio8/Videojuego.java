import java.time.LocalDateTime;

public class Videojuego {

    private String titulo;
    private String fabricante;
    private int anho;

    // set
    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase().trim();
    }

    public void setAnho(int anho) {
        LocalDateTime now = LocalDateTime.now();
        if (anho < 1950) {
            this.anho = now.getYear();
        } else {
            this.anho = anho;
        }
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante.toUpperCase();
    }

    // get
    public String getTitulo() {
        return titulo;
    }

    public int getAnho() {
        return anho;
    }

    public String getFabricante() {
        return fabricante;
    }

    // constructor
    public Videojuego(String titulo, String fabricante, int anho) {
        this.setTitulo(titulo);
        this.setAnho(anho);
        this.setFabricante(fabricante);
    }


    // metodos
    //1.copiar datos 2.modificarlos 3.imprimirlos
    @Override
    public String toString() {// si recortar-> substring
        String resultadoTitulo = this.titulo;// porque no queremos modifi el Original 
        String resultadoFabricante= this.fabricante;//queremos tener una COPIA.

        if (this.titulo.length() > 20) {//1.INAZUMA ELEVEN GO/2. INAZUMA /3.INAZUMA... 
            resultadoTitulo = this.titulo.substring(0, 17) + "...";
        }//tit recortado
        if (this.fabricante.length() > 20) {
            resultadoFabricante = this.fabricante.substring(0,17) + "...";
        }//fabri recortado
        return String.format("%20s %20s %5d", resultadoTitulo, resultadoFabricante, this.anho);
    }
    //if independientes porque necesito modificar los valores
    //antes de usarlos, los preparo.
}
