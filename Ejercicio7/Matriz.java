public class Matriz {
    private int[][] matriz;

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public Matriz(int n) {
        this.matriz = new int[n][n];// usar la propiedad de la matriz
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 11);// desde 0 a 10
            }
        }
    }   

    public void tabla() {
        System.out.printf("%4s", "");

        for (int i = 0; i < matriz[0].length; i++) {//cabe columnas
            System.out.printf("%4d", i);
        }
        System.out.println();// importante

        for (int i = 0; i < matriz.length; i++) {//filas con letras
            System.out.printf("%4c", (char) ('A' + i));// 1ro sumo y luego convierto
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();// importante
        }
    }

    public int suma() {
        int acu = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                acu += matriz[i][j];
            }
        }
        return acu;
    }

    public int suma(boolean comprobar) {
        int acu = 0;
        if (comprobar) {// recorremos las filas
            for (int i = 0; i < matriz.length; i++) {
                acu += matriz[i][i];// si la i es igual
                // i = misma fila = i y misma columna = i -> matriz[i][i]
            }
        } else {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i != j) {// sino no esto en la diagonal
                        acu += matriz[i][j];
                    }
                }
            }
        }
        return acu;
    }

    // de fila 0 tengo que sumar todos los valores.
    public int suma(int numero) {
        int acu = 0;
        if (numero >= 0 && numero < matriz.length) {
            for (int j = 0; j < matriz.length; j++) {
                acu += matriz[numero][j];
                // recuerda el return te sale del bucle
            }
            return acu;
        }
        return -1;
    }
}

// for (int i = 0; i < matriz.length; i++) {
// for (int j = 0; j < matriz[i].length; j++) {
// if (i == j) { fila igual a columna i!=j Todo lo que NO ES DIAGONAL
// acu+=matriz[i][j];
// }}}

// matriz completa: 2For matriz[i][j]->valor.
// Diagonal: 1For matriz[i][i] ->diagonal.
