import java.util.ArrayList;

public class Ejercicio5 {

    public static ArrayList<Integer> aleatorio(int tamanho) {
        ArrayList<Integer> cole = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {// cole.size() no, crear 10 elementos
            cole.add((int) (Math.random() * 4001) + 1000);
        }

        return cole;
    }

    public static void elementos(ArrayList<Integer> cole) {
        for (Integer integer : cole) {
            System.out.println(integer);
        }
    }

    public static int maximo(ArrayList<Integer> cole) {
        int max = cole.get(0);
        for (int i = 0; i < cole.size(); i++) {
            if (max < cole.get(i)) {
                max = cole.get(i);
            }
        }
        return max;
    }

    public static int minimo(ArrayList<Integer> cole) {
        int min = cole.get(0);
        for (Integer integer : cole) {
            if (min > integer) {// cole.size() no, integer
                min = integer;
            }
        }
        return min;
    }

    public static boolean intercambio(ArrayList<Integer> cole, int a, int b) {

        int valor1;
        if (a >= 0 && b >= 0 && a < cole.size() && b < cole.size()) {
            valor1 = cole.get(a);
            cole.set(a, cole.get(b));
            cole.set(b, valor1);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> cole = aleatorio(10);

        System.out.println("***ELEMENTOS***");
        elementos(cole);

        System.out.println("\n***MAXIMO***");
        System.out.println(maximo(cole));

        System.out.println("\n***MINIMO***");
        System.out.println(minimo(cole));

        System.out.println("\n***INTERCAMBIO***");
        System.out.println(intercambio(cole, 0, 1));

        System.out.println("\n***Coleccion despues de Intercambio***");
        elementos(cole);
    }
}
