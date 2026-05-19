public class Ejercicio4 {

    public static char[][] matriz(int fila, int columnas) {
        char[][] matriz = new char[fila][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char) ((int) (Math.random() * 26) + 65);
            }//con i y j
        }
        return matriz;
    }

    public static void matri(char[][] matriz) {

        System.out.printf("%4s", "");//texto
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%4d", i);//entero
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%4d", i);//añadirle el char y A
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4c", matriz[i][j]);//caracter
            }
            System.out.println();
        }
        System.out.println("***********************");
    }
//TODO max y min

    public static int maximo(int [] [] matriz){
        int maximo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
              if (maximo<matriz[i][j]) {
                    maximo = matriz[i][j];
              }  
            }
        }
        return maximo;
    }

    public static int minimo(int [] [] matriz){
        int minimo = matriz[0][0];

        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (minimo>valor) {
                    minimo = valor;
                }
                
            }
        }
        
        return minimo;
    }
    public static boolean intercambio(char[][] matriz, int f1, int c1, int f2, int c2) {
        char valor = ' ';
        if (f1 >= 0 && f2 >= 0 && f1 < matriz.length && f2 < matriz.length && c1 >= 0 && c2 >= 0
                && c1 < matriz[0].length && c2 < matriz[0].length) {
            valor = matriz[f1][c1];
            matriz[f1][c1] = matriz[f2][c2];
            matriz[f2][c2] = valor;
            return true;
        }else{
            System.out.println("Fuera de Rango!");
            return false;
        }
    }

    public static void main(String[] args) {

        char[][] matriz = matriz(3, 4);
        char[][] matriz2 = matriz(4, 3);
        matri(matriz);
        matri(matriz2);

    }
}

// }
// public static char[][] matriz(int fila, int columnas) {
// char[][] matriz = new char[fila][columnas];
// for (int i = 0; i < matriz.length; i++) {
// for (int j = 0; j < matriz[i].length; j++) {
// matriz[i][j] = (char) ((int) (Math.random() * 26) + 65);// 1.decimales por
// math/2.a enteros para poder
// // pasarlo a char/3.char letras
// }
// }
// return matriz;
// }

// public static void matri(char [][] matriz) {
// System.out.printf("%2s", "");
// for (int i = 0; i < 4; i++) {
// System.out.printf("%4d", i);
// }
// System.out.println();
// for (int i = 0; i < matriz.length; i++) {
// System.out.printf("%2d", i);
// for (int j = 0; j < matriz[i].length; j++) {
// System.out.printf("%4c", matriz[i][j]);
// }
// System.out.println("");
// }
// }

// public static void main(String[] args) {
// char[][] matriz = matriz(3, 4);
// char[][] matriz2 = matriz(4, 3);

// }
// }
