public class Repaso1ejer {

    public static int[] generar(int n) {
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) ((Math.random() * 4001) + 1000);
        }
        return num;
    }

    public static void elementos(int[] vector) {
        boolean prue = true;
        for (int i : vector) {
            if (!prue) {
                System.out.print(",");
            }
            System.out.print(i);
            prue = false;
        }
    }

    public static int maximo(int[] vector) {
        int maximo = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    public static int minimo(int[] vector) {
        int minimo = vector[0];
        for (int i : vector) {
            if (i < minimo) {
                minimo = i;
            }
        }
        return minimo;
    }

    public static boolean intercambia(int[] vector, int indi1, int indi2) {
        int nuevo;
        if (indi1 >= 0 && indi2 >= 0 && indi1 < vector.length && indi2 < vector.length) {
            nuevo = vector[indi1];
            vector[indi1] = vector[indi2];
            vector[indi2] = nuevo;
            return true;
        }
        return false;
        //for (int i = 0; i < vector.length; i++) {
          //  System.out.print(vector[i] + " ");
        //}
    }

    public static void main(String[] args) {
        int[] vector = generar(5);
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        elementos(vector);// devuelve directo
        System.out.println("");
        System.out.println("maximo: " + maximo(vector));// necesita mostrarse
        System.out.println("minimo: " + minimo(vector));

        System.out.println(intercambia(vector, 0, 1));
        // System.out.println(intercambia(vector, 0, 1));
    }
}
