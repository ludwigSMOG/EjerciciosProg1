import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matri = new Matriz(3);// crear objeto...
        // R:clase es el plano de una casa
        // objeto es la casa construida y toda la linea significa construir una matriz

        int opcion;
        boolean flag;
        do {
            try {
                flag = false;
                System.out.println();
                System.out.println("*****Bienvenido*****");
                System.out.println(
                        "1.Mostrar matriz\n2.Mostrar suma de todos los elementos\n3.Mostrar suma de la Diagonal\n4.Mostrar suma de los elementos salvo diagonal\n5.Mostrar suma de elementos de una fila\n6.Salir");

                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("*******TABLA*******");
                        matri.tabla();
                        flag = true;
                        // Matriz.tabla(matri.getMatriz());// usar getter o matri.matriz
                        break;
                    case 2:
                        System.out.println("Resultado, suma Total:" + matri.suma());
                        flag = true;
                        break;
                    case 3:
                        System.out.println("Resultado, suma Diagonal:" + matri.suma(true));
                        flag = true;
                        break;
                        case 4:
                            System.out.println("Resultado, Total Resto:" + matri.suma(false));
                            flag = true;
                            break;
                            case 5:
                                System.out.println("dime la fila: ");
                                int fila = sc.nextInt();
                                int resultado = matri.suma(fila);
                                
                                if (resultado != -1) {
                                    System.out.println("Resultado, suma fila:" + resultado);
                                } else {
                                    System.out.println("La fila no es valida!");
                                }
                                flag = true;
                        // System.out.println("Suma Elementos de Usuario:" + matri.suma(fila));
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        flag = true;
                        break;
                }
            } catch (InputMismatchException e) {
                flag = true;
                System.out.println("Error, Dato no valido!");
                sc.nextLine();
            }
        } while (flag);
    }
}
