public class Prueba1 {
    public static int[][] generaMatriz(int n) {

    int[][] matriz;

    // Si n > 1 → matriz nxn
    // Si no → 15x15
    if (n > 1) {
        matriz = new int[n][n];
    } else {
        matriz = new int[15][15];
    }

    // Recorrer matriz
    for (int i = 0; i < matriz.length; i++) {

        for (int j = 0; j < matriz[i].length; j++) {

            // FILAS PARES
            if (i % 2 == 0) {

                // Aleatorio entre 5 y 15
                matriz[i][j] = (int)(Math.random() * 11) + 5;

            } else {

                // FILAS IMPARES
                // Alternar 1 y -1

                if (j % 2 == 0) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = -1;
                }
            }
        }
    }

    return matriz;
}

public static void mostrar(int [][] matriz){

    System.out.printf("%4s", "");
    for (int i = 0; i < matriz[0].length; i++) {
        System.out.printf("%4d", i);
    }
    System.out.println();

    for (int i = 0; i < matriz.length; i++) {
        System.out.printf("%4d", i);
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.printf("%4d", matriz[i][j]);
        }
        System.out.println();
    }
}

public static int [][] media(int [][] matriz){
    double columna = matriz[0].length;
    matriz = new int[5][5];

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            
        }
    }
    

}

public static void main(String[] args) {
    int [][] matri = Prueba1.generaMatriz(5);
    mostrar(matri);
}
}
