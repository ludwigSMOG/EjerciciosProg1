import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Fecha> fecha = new ArrayList<>();
        int opcion=0;

        do {
            try {
                System.out.println("Elige una opcion: 1,2,3,4,5");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("dime dia:");
                        int dia =sc.nextInt();
                        System.out.println("dime mes:");
                        int mes =sc.nextInt();
                        System.out.println("dime anho:");
                        int anho =sc.nextInt();
                        Fecha f2 = new Fecha(dia, mes, anho);
                        fecha.add(f2);

                        break;
                    case 2:
                        System.out.println("elige 1.corto 2.largo");
                        int opcion1= sc.nextInt();

                        if (opcion1==1) {
                            for (int i = 0; i < fecha.size(); i++) {
                                System.out.println(fecha.get(i).fechaFormateada(true));
                            }
                        }else if (opcion1==2) {
                                for (Fecha fecha2 : fecha) {
                                    System.out.println(fecha2.fechaFormateada(false));
                                }
                        }else{
                            System.out.println("opcion no valida");
                        }
                        break;
                    case 3:
                        System.out.println("dime dia:");
                        int dia2 =sc.nextInt();
                        System.out.println("dime mes:");
                        int mes2 =sc.nextInt();
                        System.out.println("dime anho:");
                        int anho2 =sc.nextInt();
                        Fecha f3 = new Fecha(dia2, mes2, anho2);

                        for (int i = 0; i <fecha.size(); i++) {
                            System.out.println(Fecha.diferenciaFechas(f3, fecha.get(i)));
                        }
                        break;
                    case 4:
                        System.out.println("dime año:");
                        int anho4 = sc.nextInt();
                        for (int i = fecha.size() -1; i >=0; i--) {
                            if (anho4 == fecha.get(i).getAnho()) {
                                fecha.remove(i);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("saliendo del programa...");
                        break;
                
                    default:
                        System.out.println("opcion no valida");
                        break;
                }

            } catch (FechaException e) {
                System.out.println("Error, Fecha no valida");
                sc.nextLine();
            } catch (InputMismatchException ee){
                System.out.println("Error, dato no valido");
                sc.nextLine();
            }
        } while (opcion!=5);
    }
}
