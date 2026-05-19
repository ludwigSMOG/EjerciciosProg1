import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego> videojuegos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Coleccion() {
        videojuegos.add(new Videojuego("Minecraft Studio", "Mojan", 2000));
        videojuegos.add(new Videojuego("Inazuma Eleven", "Level5", 2001));
        videojuegos.add(new Videojuego("Gran The Auto V", "RockStart Games", 2002));
    }

    public void anhadir() {
        sc.nextLine();// limpiar debido a elegir la opcion
        System.out.println("Titulo juego:");
        String titulo = sc.nextLine();
        System.out.println("Fabricante juego:");
        String fabricante = sc.nextLine();
        System.out.println("Año de creacion juego:");
        int anho = sc.nextInt();
        sc.nextLine();

        Videojuego videojuego1 = new Videojuego(titulo, fabricante, anho);
        if (videojuegos.size() > 0) {// no hace falta maximo porq con saber si hay 1elemento es SUFI
            System.out.println("quieres añadirlo al (principio) o al (final)");
            String añado = sc.nextLine().trim();// limpiamos

            if (añado.equalsIgnoreCase("principio")) {
                videojuegos.add(0, videojuego1);
            } else if (añado.equalsIgnoreCase("final")) {
                videojuegos.add(videojuego1);// en los arraylist siempre por defecto se añadira al
                                             // final!!!
            }
        } else {
            videojuegos.add(videojuego1);
        }
    }

    public void mostrar() {
        System.out.println();
        System.out.printf("%4s %20s %20s %5s\n", "ID", "Titulo", "Fabricante", "Año");
        for (int i = 0; i < videojuegos.size(); i++) {
            System.out.printf("%4d %s\n", i, videojuegos.get(i));
        }
    }

    public void buscar() {
        sc.nextLine();
        System.out.println("dime el titulo:");
        String titu = sc.nextLine().trim().toUpperCase();
        boolean tituencontrado = false;// repaso

        for (int i = 0; i < videojuegos.size(); i++) {
            if (videojuegos.get(i).getTitulo().startsWith(titu)) {// funcion repaso
                System.out.println(videojuegos.get(i));
                tituencontrado = true;
            }
        }
        if (!tituencontrado) {
            System.out.println("Error, no existe el titulo!");
        }
    }

    public void eliminar() {
        System.out.println("dime que elemento(indice) deseas borrar:");
        int posi = sc.nextInt();
        sc.nextLine();

        if (posi >= 0 && posi < videojuegos.size()) {
            videojuegos.remove(posi);
        } else {
            System.out.println("Opcion no valida!");
        }
    }

    public void borrarAnho() {
        System.out.println("dime un año:");
        int anho1 = sc.nextInt();
        sc.nextLine();

        for (int i = videojuegos.size() - 1; i >= 0; i--) {
            if (anho1 == videojuegos.get(i).getAnho()) {
                videojuegos.remove(i);
            }
        }
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("***Bienvenido***");
            System.out.println(
                    "Elige una opcion:\n1.Insertar nuevo juego.\n2.Visualizar las listas de videojuegos.\n3.Buscar videojuego.\n4.Eliminar videojuego.\n5.Borrar videojuegos de un año determinado.\n6.Salir del programa");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    anhadir();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    borrarAnho();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        } while (opcion != 6);
    }
}

// búsquedas:
// for + if → mostrar
// boolean → controlar si hubo coincidencias
