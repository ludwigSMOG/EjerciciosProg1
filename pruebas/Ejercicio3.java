public class Ejercicio3 {
    
    public static int [] aleatorios(int tamaño){
        int [] vector = new int[tamaño];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*4001)+1000;
        }
        return vector;
    }

    public static void elementos(int [] vector){
        for (int i : vector) {
            System.out.println(i);
        }
    }

    public static int maximo(int [] vector){
        int maximo = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (maximo<=vector[i]) {
                maximo = vector[i];
            }
        }
        return maximo;
    }

    public static int minimo(int [] vector){
        int minimo = vector[0];
        for (int i : vector) {
            if (minimo>=i) {
              minimo = i;  
            }
        }
        return minimo;
    }

    public static boolean intercambio(int [] vector, int a, int b){
        int nuevo;
        for (int i = 0; i < vector.length; i++) {
            if (a>=0 && b>=0 && a<vector.length && b<vector.length) {
                nuevo = vector[a];
                vector[a]= vector[b];
                vector[b] = nuevo;
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] tamaño = aleatorios(5);
        
        for (int i = 0; i < tamaño.length; i++) {
            System.out.print(tamaño[i]);
        }
        elementos(tamaño);
        int maximo = maximo(tamaño);
        System.out.println(maximo);
        int minimo = minimo(tamaño);
        System.out.println(minimo);

        boolean prueba = intercambio(tamaño, 0, 1);
        System.out.println(prueba);
    }
}
