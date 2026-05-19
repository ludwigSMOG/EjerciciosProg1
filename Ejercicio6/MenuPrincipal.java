import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anho = 10;
        do {
            try {

                System.out.println("Dime un año: (0 para salir).");
                anho = sc.nextInt();
                System.out.println();

                Ventas venta = new Ventas(anho);
                venta.grafica();

                double resultado = venta.media();
                System.out.println(String.format("\nLa media es %.2f\n", resultado));

            } catch (InputMismatchException e) {
                System.out.println("Error, introduce otro año.");
                sc.nextLine();
            }
        } while (anho != 0);
    }
}
