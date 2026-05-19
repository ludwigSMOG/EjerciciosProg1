import java.util.Scanner;

public class Ejercicio1 {

    public static int pares(int numero, boolean par) {
        int acu = 0;
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 0 && par) {
                acu += i;
            } else if (i % 2 != 0 && !par) {
                acu += i;
            }
        }
        return acu;
    }

    public static boolean bisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return true;
        }
        return false;
    }

    public static double potencia(double b, int expo) {
        double resultado = 1;//importante darle valor 1
        if (expo >= 1) {
            for (int i = 0; i < expo; i++) {
                resultado *= b;
            }
        } else {
            for (int i = 0; i > expo; i--) {
                resultado *= (1 / b);
            }
        }
        return resultado;
    }

    public static boolean primo(int num) {
        for (int i = 2; i < num; i++) {//importante empezar en 2
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = pares(10, true);
        System.out.println(pares);
        System.out.println(bisiesto(2000));
        int año;
        do {
            System.out.println("dime un año:");
            año = sc.nextInt();
            boolean prueba = bisiesto(año);
            System.out.println(prueba);

        } while (año != 0);

        double pote = potencia(3, -2);
        System.out.println(pote);
        System.out.println(primo(2));
        System.out.println(primo(3));
        System.out.println(primo(4));
    }
}
