import java.util.ArrayList;
import java.util.Scanner;

public class Loteria {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Integer> numeros() {
        // pedir numeros al usuario
        ArrayList<Integer> lista = new ArrayList<>();
        int numero;
        do {// se repite hasta tener 6 numeros validos
            System.out.println("Dime un numero dentro del rango: '1-49'");
            numero = sc.nextInt();
            // compro que esta en rango y no repetido
            if (numero >= 1 && numero <= 49 && !lista.contains(numero)) {
                lista.add(numero);
            } else {
                System.out.println("Error, numero no valido/repetido!");
            }
        } while (lista.size() < 6);
        return lista;
    }

    public void rellenaCol(ArrayList<Integer> col) {
        // genera combinacion aleatoria
        col.clear();

        int numero;
        do {// genera numeros hasta tener 6
            numero = ((int) (Math.random() * 49) + 1);// del 1 al 49
            if (!col.contains(numero)) {// evitamos repetidos
                col.add(numero);
            }
        } while (col.size() < 6);
    }

    public int compara(ArrayList<Integer> col1, ArrayList<Integer> col2) {
        // comparar 2 combis
        int cont = 0;
        for (int i = 0; i < col1.size(); i++) {// recorre lista del usuario
            // si el numero esta en la otra lista, bien.
            if (col2.contains(col1.get(i))) {// comparamos elemento por elementos b
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> usuario = new ArrayList<>();// lista usu
        ArrayList<Integer> colAleatorio = new ArrayList<>();// lista combis aleatorias
        int[] resultados = new int[7];// contar resultados 0 a 6 aciertos
        int opcion;

        do {
            Loteria loteria = new Loteria();
            System.out.println("***Bienvenido****");
            System.out.println("1.Introducir numeros.\n/2.Loteria simulacion.\n/3.Mostrar resultados.\n/4.Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    usuario = loteria.numeros();
                    break;
                case 2:
                    if (usuario.size() != 6) {
                        System.out.println("Primero debes introducir tus numeros!");
                        break;
                    }

                    // reiniciar resultados
                    for (int i = 0; i < resultados.length; i++) {
                        resultados[i] = 0;
                    }

                    // repetir muchas veces
                    for (int i = 0; i < 1000000; i++) {

                        // generar combinacion aleatoria
                        loteria.rellenaCol(colAleatorio);

                        // comparar con usuario
                        int aciertos = loteria.compara(usuario, colAleatorio);

                        //CLAVE: usar aciertos como indice
                        resultados[aciertos]++;
                    }

                    System.out.println("Simulacion completada!");
                    break;
                case 3:
                    for (int i = 0; i < resultados.length; i++) {
                        System.out.println("Aciertos " + i + ": " + resultados[i]);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("opcion, no valida!");
                    break;
            }
        } while (opcion != 4);
    }
}
