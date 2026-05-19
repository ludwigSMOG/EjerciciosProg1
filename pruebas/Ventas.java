
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ventas{
    int[] ventas = new int[12];

    private int anho;

    public void setAnho(int anho) {
        LocalDateTime now = LocalDateTime.now();// LocalDateTime devuelve Localda..
        if (anho < now.getYear()) {// para obtener el año llamar a su funcion .getYear()
            this.anho = anho;
        } else if(anho>=now.getYear()){
            throw new IllegalArgumentException("Error, año invalido...");
        }
    }

    public int getAnho() {
        return anho;
    }

    public Ventas(int anho) {
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random() * 1000);
        }
        setAnho(anho);
    }

    public double media() {
        int total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return (double) total / ventas.length;//fuerzo a q devuelva con decimales
    }

    public void grafica() {
        int nBloques;

        System.out.println(String.format("Año %d:", this.anho));// CABECERA, llamando a la variable
        for (int i = 0; i < ventas.length; i++) {// si empiezo en 1 debo llegar hasta el final =
            nBloques = ventas[i] / 100;
            System.out.print(String.format("Mes %d (%d): ", i + 1, ventas[i]));
            for (int j = 0; j < nBloques; j++) {
                System.out.print("#");// todo en una linea
            }
            System.out.println();// retorno de carro
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("dime un año: ");
        int anho1 = sc.nextInt();

        Ventas venta = new Ventas(anho1);// 2026 año invalido
        venta.grafica();

        double resultado = venta.media();
        System.out.println(String.format("%.2f", resultado));

    }
}
