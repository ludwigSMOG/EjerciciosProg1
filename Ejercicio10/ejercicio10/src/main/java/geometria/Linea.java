package geometria;

import java.util.Scanner;

import interfaz.Libreria;

public class Linea extends Figura{

    private Punto puntoFinal;

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        //Scanner sc = new Scanner(System.in);
        Libreria libre = new Libreria();
        System.out.println("dime tu punto Final;");
        setPuntoFinal(new Punto(libre.pedirReal(),libre.pedirReal()));
        //es necesario libre.pedirReal()
        //o si se puede dejar el sc sc.nextDouble???
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(getPuntoFinal());
    }

    public Linea(Punto punto1, Punto punto2) {
        super(punto1, "linea");
        setPuntoFinal(punto2);
    }

    public Linea() {
        this(new Punto(0, 0), new Punto(1, 1));
    }
}
