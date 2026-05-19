import java.util.ArrayList;

public class Ejercicio5 {
    
    
    public static ArrayList<Integer> aleatorio(int tamanho){
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < col.size(); i++) {//añadir valores ADD
            col.add((int) (Math.random()*4001)+1000);
        }
        return col;
    }   

    public static void elementos(ArrayList<Integer> col){
        for (Integer integer : col) {
            System.out.println(integer);
        }
    }

    public static int maximo(ArrayList<Integer> col){
        int maximo = col.get(0);
        for (int i = 0; i < col.size(); i++) {
            if (maximo<col.get(i)) {
                maximo = col.get(i);
            }
        }
        return maximo;
    }

    public static int minimo(ArrayList<Integer> col){
        int minimo = col.get(0);

        for (Integer integer : col) {
            if (minimo>integer) {
                minimo = integer;
            }
        }
        return minimo;
    }

    public static boolean intercambio(ArrayList<Integer> col, int a, int b){
        int nuevo;
        if (a>=0 && b>=0 && a<col.size() && b<col.size()) {//longitud
            nuevo = col.get(a);//importante set SETEAR LOS VALORES
            col.set(a, col.get(b));
            col.set(b, nuevo);
            return true;
        }else{
            return false;
        }
    }
}
