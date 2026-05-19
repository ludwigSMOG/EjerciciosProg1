public class Ejercicio3 {

    public static int[] aleatorios(int n) {
        int num[] = new int[n];
        for (int i = 0; i < num.length; i++) {// repaso num.length longitug [0,0,0,0]
            num[i] = (int) (Math.random() * 5001 + 1000);
        }
        return num;
    }

    public static void elementos(int[] vector) {
        for (int i : vector) {
            System.out.println(i);
        }
    }

    public static int maximo(int[] vector) {
        int maximo = vector[0];// Tomamos el primer element como maximo inicial
        for (int i = 0; i < vector.length; i++) {
            if (maximo <= vector[i]) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    public static int minimo(int[] vector) {
        int minimo = vector[0];
        for (int i : vector) {
            if (minimo >= i) {
                minimo = i;
            }
        }
        return minimo;
    }

    public static boolean intercambio(int[] vector, int a, int b) {
        int inter;
        for (int i = 0; i < vector.length; i++) {
            if (a >=0 && b >=0 && a < vector.length && b < vector.length) {
                inter = vector[a];
                vector[a] = vector[b];
                vector[b] = inter;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
