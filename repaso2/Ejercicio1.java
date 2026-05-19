import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static int suma(int maximo, boolean flag) {
        int acu = 0;

        for (int i = 1; i <= maximo; i++) {
            if (i % 2 == 0 && flag) {
                System.out.print(i + ",");
                acu += i;
            } else if (i % 2 != 0 && !flag) {
                System.out.print(i + ",");
                acu += i;
            }
        }
        return acu;
    }

    public static boolean bisiesto(int anho) {

        if ((anho % 4 == 0 && anho % 100 != 0) || anho % 400 == 0) {
            return true;
        }
        return false;
    }

    public static double potencia(double num, int potencia) {
        double nume = 1;
        if (potencia > 0) {
            for (int i = 0; i < potencia; i++) {
                nume *= num;
            }
        } else if (potencia < 0) {
            for (int i = 0; i >= potencia; i--) {
                nume *= (1 / num);
            }
        }
        return nume;
    }

    public static boolean primos(int num) {
        for (int i = 2; i < num; i++) {//importante el 2.
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = suma(10, true);
        System.out.println(num);

        int anho;
        boolean flag;
        do {
            flag = false;
            try {
                System.out.print("dime un año;");
                anho = sc.nextInt();
                if (anho!=0) {
                    System.out.println(bisiesto(anho));
                    flag = true;   
                }
                
            } catch (InputMismatchException e) {
                flag = true;
                System.out.println("Error, escribe un numero...");
                sc.nextLine();
            }
        } while (flag);

        System.out.println(potencia(5, 2));
        
    }
}
