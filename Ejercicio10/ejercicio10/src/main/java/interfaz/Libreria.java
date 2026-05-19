package interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {
    Scanner sc = new Scanner(System.in);
    
    public int pedirEntero() {
        int num = 0;
        boolean prue = true;
        do {
            try {
                System.out.println("dime un numero entero:");
                num = sc.nextInt();
                prue = true;//exit si cumple
            } catch (InputMismatchException e) {
                prue = false;//continue
                System.out.println("NUMERO ENTERO!");
                sc.nextLine();
            }
        } while (!prue);//continue
        return num; 
    }

    public double pedirReal() {
        double num = 0;
        boolean prue;

        do {
            sc.nextLine();
            prue = false;
            try {
                System.out.println("dime un numero real:");
                num = sc.nextDouble();
            } catch (InputMismatchException e) {
                prue = true;
                System.out.println("NUMERO REAL!");
                sc.nextLine();
            }
        } while (prue);
        return num;
    }
}
