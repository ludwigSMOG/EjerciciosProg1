import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> astro = new ArrayList<>();

        int opcion = 0;
        do {
            System.out.println("***Bienvenido***");
            System.out.println(
                    "Elige una opcion: \n1.Añadir planeta\n2.Añadir Astro\n3.Mostrar datos\n4.Eliminar repetidos\n5.Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("dime nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("dime radio:");
                    double radio = sc.nextDouble();
                    System.out.println("El planeta es Gaseoso?");
                    boolean gaseoso = sc.nextBoolean();
                    Planeta planeta = new Planeta(nombre, radio, gaseoso);

                    System.out.println("Cuantas lunas tiene?");
                    int numLunas = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < numLunas; i++) {
                        System.out.println("dime un nombre:");
                        String nomLuna = sc.nextLine();
                        System.out.println("dime un radio:");
                        double numRadio = sc.nextDouble();
                        sc.nextLine();

                        Astro luna = new Astro(nomLuna, numRadio);
                        planeta.getSatelites().add(luna);// añado esta luna a la lista de satelistes del planeta
                    }
                    break;
                case 2:
                    System.out.println("dime un nombre:");
                    String nombre1 = sc.nextLine();
                    System.out.println("dime un radio:");
                    double radio2 = sc.nextDouble();
                    sc.nextLine();
                    Astro astro2 = new Astro(nombre1, radio2);
                    astro.add(astro2);
                    break;
                case 3:

                    for (int i = 0; i < astro.size(); i++) {
                        if (astro.get(i).getClass() == Astro.class) {// repaso,este objeto es un planeta?? if
                                                                     // (astro.get(i) instanceof Planeta)
                            System.out.println(astro.get(i).toString());
                            // System.out.println(astro.get(i).getNombre('/'));
                            // System.out.println(astro.get(i).getRadio());
                        } else if (astro.get(i).getClass() == Planeta.class) {
                            Planeta p = (Planeta) astro.get(i);

                            System.out.println(p.getNombre('.'));
                            System.out.println(p.getRadio());
                            System.out.println(p.getGaseoso());
                            // System.out.println(((Planeta) astro.get(i)).getGaseoso());
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < astro.size(); i++) {

                        Astro actual = astro.get(i);

                        while (astro.indexOf(actual) != astro.lastIndexOf(actual)) {
                            astro.remove(astro.lastIndexOf(actual));
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion, no valida.");
                    break;
            }
        } while (opcion != 5);
    }
}
