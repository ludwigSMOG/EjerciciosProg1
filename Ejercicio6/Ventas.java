import java.time.LocalDateTime;

public class Ventas {
    int[] ventas = new int[12];
    private int anho;

    public void setAnho(int anho) {
        LocalDateTime now = LocalDateTime.now();
        if (anho < now.getYear()) {
            this.anho = anho;
        }else{
            throw new IllegalArgumentException("Error, año no valido");
        }
    }

    public int getAnho() {
        return anho;
    }

    public Ventas(int anho) throws IllegalArgumentException {
        
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = (int) (Math.random()*1000); 
        }
        setAnho(anho);//fijate que devuelta el valor    
    }

    public double media(){
        double acu=0;
        for (int i = 0; i < ventas.length; i++) {
            acu+=ventas[i];
        }
        return  acu/ventas.length;//castearlo
    }

    public void grafica(){//TODO alinear correctamente y añadir #
        int nBloques;
        System.out.println(String.format("Año %d:", this.anho));

        for (int i = 0; i < ventas.length; i++) {
            nBloques = ventas[i]/100;
            System.out.print(String.format("Mes %2d %4s): ", i + 1, "("+ventas[i]));//repasalo
            for (int j = 0; j <= nBloques; j++) {
                System.out.printf("%s", "#");//en una linea
            }
            System.out.println();//retorno de carro
        }
    }

}