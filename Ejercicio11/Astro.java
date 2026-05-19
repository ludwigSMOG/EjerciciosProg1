public class Astro {

    private String nombre;
    private double radio;

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            throw new RadioNegativoException("Error, el numero debe ser positivo.");
        }
    }

    public String getNombre(char separador) {
        String resul= "";
        for (int i = 0; i < nombre.length(); i++) {
            resul += nombre.charAt(i);
            if (i < nombre.length() -1) {//-1 evitar ponerlo al final _ sobrante
                resul += separador;
            }
        }
        return resul;
    }

    public double getRadio() {
        return radio;
    }

    public Astro(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    @Override
    public String toString(){
    return getNombre('_')+ " " + String.format("%.2f", radio);
    }
}
