package interfaz;

import geometria.Figura;

public class Application {

  public static void main(String[] args) {
    //Libreria num = new Libreria();
    //num.pedirEntero();
    //num.pedirReal();
    Figura figu = new Figura();
    System.out.println("nombre");
    String nombre = sc.nextLine();
    figu.setNombre(nombre);
  }
}
