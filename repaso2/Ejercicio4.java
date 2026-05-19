public class Ejercicio4 {
    
    public static char [][] matriz(int fila, int columna){
        char [] [] matri = new char[fila][columna];
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri[i].length; j++) {
                matri[i][j] = (char) ((int)(Math.random()*26)+65);
            }
        }
        return matri;
    }

    public static void elementos(int [] [] matriz){

        System.out.printf("%4s", "");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%4d", i);
        }
    }
}
