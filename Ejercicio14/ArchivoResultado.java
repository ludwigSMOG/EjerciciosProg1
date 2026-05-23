import java.io.*;

public class ArchivoResultado {

    public static void guardarOperacion(double num1, String signo, double num2, double resultado) {

        try {
            File archivo = new File("resultado.txt");
            System.out.print("El archivo fue creado en: "+ archivo.getAbsolutePath());
            PrintWriter pw = new PrintWriter(archivo);

            pw.println(num1 + " " + signo + " " + num2 + " = " + resultado);
            pw.close();
            
        } catch (IOException e) {
            System.out.println("Error, escribe bien el archivo");
        }
    }

}

    // public static void main(String[] args) {

    //     File nombre = new File("NombreArchivo.txt");

    //     PrintWriter pw = new PrintWriter(nombre);
    //     try {
    //         pw.write("hola me llamo Ludwing");
    //         pw.println("hola");
    //         pw.println("aadios");
    //         pw.close();
    //     } catch (IOException e) {
    //         System.out.println("");
    //     }

    //     try {
    //         Scanner leer = new Scanner(nombre);
    //         while (leer.hasNextLine()) {
    //             String lectura = leer.nextLine();
    //             System.out.println(lectura);
    //         }
    //         leer.close();
    //     } catch (FileNotFoundException e) {
    //         TODO: handle exception
    //     }

    // }


