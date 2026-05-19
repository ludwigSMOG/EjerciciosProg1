import java.util.ArrayList;

public class Planeta extends Astro {
    private boolean gaseoso;
    public ArrayList<Astro> satelites;
    //ArrayList<Integer> satelites = new ArrayList<>();

    public void setGaseoso(boolean gaseoso) {
        this.gaseoso = gaseoso;
    }

    public boolean getGaseoso() {
        return gaseoso;
    }

    public ArrayList<Astro> getSatelites() {//IMPORTANTE sino no puedo llamarla en la otra clase
        return satelites;
    }

    public Planeta(String nombre, double radio, boolean gaseoso) {
        super(nombre,radio);//super -> para inicializar los atributos de la clase padre
        this.gaseoso = gaseoso;
        this.satelites = new ArrayList<>();
    }

    public Planeta() {
        this("", 0, false);
    }
}
