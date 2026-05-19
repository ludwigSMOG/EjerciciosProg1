
public class Ejercicio3 {
    // EJERCICIO A
    // Si piden funcion que DEVUELVA VECTOR -> VARIABLES
    // ESTRUCTURA-> 1crear vector/2.for para rellenarlo /3.return vector
    public static int[] aleatorios(int tamaño) {// int num -tamaño del vector
        int[] vector = new int[tamaño];// crearemos vector con x tamaño
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 4001) + 1000;
            // +1000 ->indica comienzo contando con ese numero
            // 40001 -> indica 5000 incluido, por el (1).
        }
        return vector;
    }

    // EJERCICIO B
    // NO DEVUELVE NADA, solo IMPRIME/MUESTRA -> VOID
    public static void numeros(int[] num) {
        // FOREACH xq solo quiero ver los valores
        System.out.println("\n***Ejercicio B***");
        for (int valor : num) {
            // valor-> en el for each no es el indice es el VALOR del VECTOR
            // si el VECTOR es [15,10,13] el bucle hara i=15, i=10, i=13
            System.out.print(" ||" + valor + " || ");
        }
    }

    // EJERCICIO C
    public static int maximo(int[] num) {
        int aux = num[0];
        for (int i = 0; i < num.length; i++) {
            if (aux <= num[i]) {
                aux = num[i];
            }
        }
        return aux;
    }

    // EJERCICIO D
    public static int minimo(int[] num) {
        int aux = num[0];// valor de la longitud al LIMITE num.length
        // este caso porque se el limite yo pero si no lo supiera??
        System.out.print("\n***Ejercicio D***");
        for (int valor : num) {
            if (aux >= valor) {
                aux = valor;
            }
        }
        return aux;
    }

    public static boolean intercambio(int[] num, int a, int b) {
        // 1.11 posi0
        // 2.22 posi1
        // num.length<5000 && num.length>0 al no saber la longitud
        int numero;
        System.out.println("\n ***Ejercicio E***");
        if (a >= 0 && b >= 0 && a < num.length && b < num.length) {// Rango/Valores
            // rango de Array desde 0 hasta length
            // Array, indices[0,1,2,3,4] y elementos {11,22,33,44,55}.
            numero = num[a];// num[a]=11
            num[a] = num[b];// num[b]=22
            num[b] = numero;// numero=11
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] vector = aleatorios(5);//ENTENDER
        System.out.println("***Ejercicio A***");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("//" + vector[i] + " // ");
        }
        numeros(vector);

     System.out.print("\n***Ejercicio C***");

        System.out.print("\n" + maximo(vector));
        System.out.print("\n" + minimo(vector));
        System.out.println(intercambio(vector, 0, 1));
    }
}