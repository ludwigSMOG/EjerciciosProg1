public class Ejercicio4 {

    public static char[][] aleatorio(int n, int m) {
        char[][] matriz = new char[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char) ((int) (Math.random() * 26) + 65);
            }
        }
        return matriz;
    }

    public static void tabla(char[][] matriz) {

        System.out.printf("%4s", "");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%4c", ('A' + i));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean intercambio(int[][] matriz, int f1, int f2, int c1, int c2) {
        int nuevo;
        if (f1 >= 0 && f2 >= 0 && f1 < matriz.length && f2 < matriz.length && c1 >= 0 && c2 >= 0
                && c1 < matriz[0].length && c2 < matriz[0].length) {
            nuevo = matriz[f1][c1];
            matriz[f1][c1] = matriz[f2][c2];
            matriz[f2][c2] = nuevo;
            return true;
        }else{
            System.out.println("fuera de rango");
            return false;
        }
    }
}
