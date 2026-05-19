import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    // void no deulve nada solo IMPRIME
    // valor devuelve NO imprime
    public static int sumar(int numero, boolean prueba) {
        int acu = 0;
        for (int i = 0; i <= numero; i++) {// importante el = si queremos ese num incluido
            if (i % 2 == 0 && prueba) {// tambien prueba == true
                acu += i;
            } else {
                if (i % 2 != 0 && !prueba) {
                    acu += i;
                }
            }
        }
        return acu;
    }

    public static boolean añoBi(int año) {// devuelve bool
        // fijarse en el OR y AND, es clave
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {// orden importa
            // System.out.println("El año " + año + " es Bisiesto!");
            return true;
        } else {
            // System.out.println("El año " + año + " NO es Bisiesto!");
            return false;
        }

        // return (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;
    }

    public static double potencia(double b, int expo) {// importante valores/decimales en funcion de que pida
        double resultado = 1;
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

    public static boolean primos(int num) {
        for (int i = 2; i < num; i++) {// divisores empezar en 2
            if (num % i == 0) {
                return false;
            }
        }
        return true;// orden de comprobacion!
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // empeza en 1 hasta el numero maximo
        // comprobar si es par o impar dependiendo de si bool
        // acumular la suma
        // devolver el total
        System.out.println("**********EJERCICIO A*************");
        System.out.println(sumar(10, true));
        System.out.println("**********EJERCICIO B*************");

        int numero;
        boolean error;
        do {
            error = false;
            try {
                System.out.println("Dime un año: (0 terminar)");
                numero = sc.nextInt();
                sc.nextLine();
                if (numero != 0) {// estructura condi/haceralgo/pedirotravez
                    System.out.println(añoBi(numero));
                    error = true;

                }
            } catch (InputMismatchException e) {
                error = true;
                System.out.println("Error, Escribe un numero...");
                sc.nextLine();// importante limpiar para que pueda volver a pedir el numero
            }
        } while (error);
        System.out.println("**********EJERCICIO C*************");
        System.out.println(potencia(2, -4));// lo muestro llamando a la funcion
        System.out.println("**********EJERCICIO D*************");

        boolean erro;
        int num=0;
        do {
            erro = false;
            try {
                System.out.println("Dime un numero: (Primos)");
                num = sc.nextInt();

            } catch (InputMismatchException e) {
                erro = true;
                System.out.println("Error: Introduce un valor/numero...");
                sc.nextLine();//IMPORTANTEEE!!!

            }
        } while (erro);
        // Tienes asegurado que el dato num es correcto
        //Proceso

        for (int i = 2; i < num; i++) {
            if (primos(i)) {// USAR LA FUNCION y comprobar i los Numeros
                System.out.println(i + " es primo");
            }
        }
    }

}
