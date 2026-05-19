import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Fecha> listaFecha = new ArrayList<>();
        boolean pruebi;
        int opcion = 0;
        do {
            try {
                Fecha f1 = new Fecha(5, 12, 2000);
                Fecha f2 = new Fecha(12, 2, 2005);
                Fecha.diferenciaFechas(f1, f2);// ¿? al ser ESTATICA debo de llamar a la clase y luego al metodo
                pruebi = false;
                do {
                    System.out.println("***Bienvenido***");
                    System.out.println(
                            "1.Añadir nueva fecha\n2.Mostrar fecha corta/Mostrar fecha larga\n3.Mostrar diferenciaFechas de una nueva fecha que se le pide al usuario con\n4.Borrar fechas de un año\n5.Salir.");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Dime dia:");
                            int dia = sc.nextInt();
                            System.out.println("Dime mes:");
                            int mes = sc.nextInt();
                            System.out.println("Dime año:");
                            int año = sc.nextInt();
                            Fecha f3 = new Fecha(dia, mes, año);
                            listaFecha.add(f3); // añadimos a la coleccion el nuevo obj
                            break;
                        case 2:
                            int formato;
                            System.out.println("Que formatado desea? 1)Largo 2)Corto");
                            formato = sc.nextInt();
                            if (formato == 1) {
                                for (int i = 0; i < listaFecha.size(); i++) {
                                    System.out.println(listaFecha.get(i).fechaFormateada(true));
                                }
                            } else {
                                for (Fecha fecha : listaFecha) {// fecha->es como get(i) de arriba
                                    System.out.println(fecha.fechaFormateada(false));
                                }
                            }

                            break;
                        case 3:
                            int dia2;
                            int mes2;
                            int año2;
                            System.out.println("Dime un dia: ");
                            dia2 = sc.nextInt();
                            System.out.println("Dime un mes: ");
                            mes2 = sc.nextInt();
                            System.out.println("Dime un año: ");
                            año2 = sc.nextInt();
                            Fecha f4 = new Fecha(dia2, mes2, año2);
                            // listaFecha.add(f4);

                            for (int i = 0; i < listaFecha.size(); i++) {
                                System.out.println(Fecha.diferenciaFechas(f4, listaFecha.get(i)));
                            }
                            break;
                        case 4:
                            for (Fecha fecha : listaFecha) { // fecha = listaFecha.get(i)
                                System.out.println(fecha);
                            }
                            int año3;
                            System.out.println("Dime que fecha quieres eliminar: (año) ");
                            año3 = sc.nextInt();
                            for (int i = listaFecha.size() - 1; i >= 0; i--) {// empezar en el ultimo elemento y
                                                                              // recorrer hacia atras
                                // de esta manera comprobamos todos los elementos
                                if (listaFecha.get(i).getAnho() == año3) {// obtenemos año
                                    // le indicampos que año EXACTO! queremos
                                    listaFecha.remove(i);// eliminamos de ala COLECCION!
                                }
                            }
                            // size() = numero de elementos
                            // ultimo indice = size() -1
                            // al eliminar elementos de la lista , se recorre de atras hacia delante por eso
                            // size() -1
                            break;
                        case 5:
                            System.out.println("Saliendo del Programa...");

                            break;

                        default:
                            System.out.println("Opcion NO valida.");
                            break;
                    }
                } while (opcion != 5);

            } catch (FechaException e) {
                pruebi = true;
                System.out.println("Error fecha...");
                sc.nextLine();
            } catch (InputMismatchException ee) {
                pruebi = true;
                System.out.println("Dato no valido, dime un dato numerico...");
                sc.nextLine();
            }
        } while (pruebi);
    }
}
