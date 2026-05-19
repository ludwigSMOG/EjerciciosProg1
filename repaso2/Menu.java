import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//6. ¿CUÁNDO HAY QUE HACER add()?
//Solo cuando quieres guardar un objeto en la colección.
//listaFecha.add(f3);
public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Ejercicio2> fecha = new ArrayList<>();
        int opcion = 0;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.println("menu: 5salir.");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("dime un dia:");
                        int dia = sc.nextInt();
                        System.out.println("dime un mes:");
                        int mes = sc.nextInt();
                        System.out.println("dime un año:");
                        int anho = sc.nextInt();
                        Ejercicio2 fecha1 = new Ejercicio2(dia, mes, anho);
                        fecha.add(fecha1);
                        break;

                    case 2:
                        System.out.println("dime una opcion: 1.corto, 2.largo");
                        int opci = sc.nextInt();
                        if (opci == 1) {
                            for (int i = 0; i < fecha.size(); i++) {
                                System.out.println(fecha.get(i).fechaFormateada(true));
                            }
                        } else if (opci == 2) {
                            for (Ejercicio2 fech : fecha) {
                                System.out.println(fech);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("dime un dia:");
                        int dia1 = sc.nextInt();
                        System.out.println("dime un mes:");
                        int mes1 = sc.nextInt();
                        System.out.println("dime un anho:");
                        int anho1 = sc.nextInt();
                        Ejercicio2 fecha2 = new Ejercicio2(dia1, mes1, anho1);

                        for (int i = 0; i < fecha.size(); i++) {
                            System.out.println(
                                    Ejercicio2.diferenciaFechas(fecha2, fecha.get(i)));
                        } // llamar a la clase Ejercicio2
                        break;

                    case 4:
                        System.out.println("dime el año:");
                        int anho2 = sc.nextInt();
                        for (int i = fecha.size() - 1; i >= 0; i--) {
                            if (anho2 == fecha.get(i).getAnho()) {
                                System.out.println(fecha.remove(i));
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Saliendo del programa.");
                        break;

                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            } catch (FechaException e) {
                flag = true;
                System.out.println("Error, fecha no valida.");
                sc.nextLine();
            }catch (InputMismatchException ee){
                flag = true;
                System.out.println("Error, dato no valido");
                sc.nextLine();
            }

        } while (opcion != 5);
    }
}