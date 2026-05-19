import java.awt.FlowLayout;
import javax.swing.JFrame;

public class ejercicio2 {
    public static void main(String[] args) {
        
        Formulario2  f2 = new Formulario2();
        
        f2.setSize(500,600);//Definimos el tamaño de la ventana
        f2.setLayout(new FlowLayout());//coloca automati los componentes de izq a derech y luego baja de linea
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//al cerrar la ventana termina el proceso
        f2.setVisible(true);

        //setSize:tamaño de la habitacion. (500,600)
        //setLayout->FlowLayout: Forma de colocar los muebles.
    }
}
