package Ejercicio13;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ejercicio13{
    
    public static void main(String[] args) {

        Formulario ventana = new Formulario();
        ventana.setSize(500, 600);
        ventana.setLayout(new FlowLayout());//indicado en el enuciado
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana.setVisible(true);

        // Si lleva FlowLayout,
        // no usar X ->setBounds(), ya que FlowLayout coloca los componentes automáticamente.
    }
}