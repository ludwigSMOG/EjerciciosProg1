package geometria;

import java.util.Scanner;

import interfaz.InterfazUsuario;
import interfaz.Libreria;

public class Figura implements InterfazUsuario {
    protected Punto origen;//llamarlo con el set o get
    protected String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public Punto getOrigen() {
        return origen;
    }

    public Figura(Punto origen, String nombre) {
        this.setOrigen(origen);
        this.setNombre(nombre);
    }

    public Figura() {
        this(new Punto(0, 0), "");// importan el new
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        Libreria libre = new Libreria();
        System.out.println("dime tu nombre:");
        setNombre(sc.nextLine());
        System.out.println("dime tu posicion:");
        setOrigen(new Punto(libre.pedirReal(), libre.pedirReal()));

    }

    @Override
    public void mostrarDatos() {
        System.out.println(getOrigen() + getNombre());//import
    }

}
