package Ejercicio16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                System.out.println();
                System.out.print("dime la ruta del elemento:");
                String ruta = sc.nextLine();
                File elemento = new File(ruta);

                System.out.println(
                        "Menu:\n1.Informacion\n2.Mostrar Archivo\n3.Añade Contenido\n4.Borra Archivo\n5.Salir");
                opcion = Integer.parseInt(sc.nextLine());// saltar el paso
                switch (opcion) {
                    case 1:
                        mostrarInformacion(elemento);
                        break;
                    case 2:
                        mostrarArchivo(elemento);
                        break;
                    case 3:
                        anhadirContenido(elemento);
                        break;
                    case 4:
                        borrarArchivo(elemento);
                        break;
                    case 5:
                        System.out.println("saliendo del programa...");
                        break;

                    default:
                        System.out.println("opcion no valida!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error, dato no valido (numeros).");
            }
        } while (opcion != 5);

    }

    public static void mostrarInformacion(File elemento) {
        if (!elemento.exists()) {
            System.out.println("El archivo/directorio no existe!");
            return;
        }

        if (elemento.isFile()) {
            System.out.println("Nombre: " + elemento.getName());
            System.out.println("Ruta: " + elemento.getParent());// le pasamos la ruta absoluta
            return;
        }

        File[] lista = elemento.listFiles();// devuelve el elemento
        System.out.println("Ficheros del directorio:");
        for (File file : lista) {
            System.out.println(file.getName());
        }
    }

    public static void mostrarArchivo(File elemento) {
        if (!elemento.exists()) {
            System.out.println("El archivo no existe!");
            return;
        }

        if (!elemento.isFile()) {
            System.out.println("El elemento no es un Archivo!");
            return;
        }

        try (Scanner sc2 = new Scanner(elemento)) {// TODO try w resources
            System.out.println("Contenido del archivo:");
            while (sc2.hasNextLine()) {
                System.out.println(sc2.nextLine());
            }
        } catch (FileNotFoundException e) {// TODO excep no genérica
            System.out.println("Error, el archivo no se pudo leer!");
        }
    }

    public static void anhadirContenido(File elemento) {
        Scanner sc = new Scanner(System.in);

        if (elemento.exists() && elemento.isDirectory()) {
            System.out.println("Error, el elemento es una carpeta!");
            return;
        }

        try (FileWriter fw = new FileWriter(elemento, true);
                PrintWriter pw = new PrintWriter(fw);) {// TODO try w  resources
            // true indico si ya existe que ESCRIBA al Final del
            // documento

            System.out.println("Introduce el texto:");

            pw.println(sc.nextLine());
            System.out.println("¡Texto añadido Correctamente!");

        } catch (IOException e) {
            System.out.println("Error, al escribir en el archivo!");
        }
    }

    public static void borrarArchivo(File elemento) {
        Scanner sc = new Scanner(System.in);

        if (!elemento.exists()) {
            System.out.println("El archivo no existe!");
            return;
        }

        if (!elemento.isFile()) {
            System.out.println("El elemento no es un Archivo!");
            return;
        }

        System.out.println("Seguro que quieres (Eliminar el Archivo (S/N))?");
        String respuesta = sc.nextLine();

        if (respuesta.toUpperCase().equals("S")) {// ?
            if (elemento.delete()) {
                System.out.println("El archivo fue Elimando con Exito!");
            } else {
                System.out.println("El elemento no se pudo Borrar!");
            }
        }
    }// getPropeti()
}
