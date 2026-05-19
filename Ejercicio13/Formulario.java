package Ejercicio13;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {

    JTextField txt1;
    JTextField txt2;
    JTextField txt3;
    JTextField txt4;
    JLabel lbl;
    JButton btn;

    public Formulario() {
        super("Formulario");

        txt1 = new JTextField(3);
        txt1.setToolTipText("color: 0-255");
        txt1.addActionListener(this);
        this.add(txt1);
        
        txt2 = new JTextField(3);
        txt2.setToolTipText("color: 0-255");
        txt2.addActionListener(this);
        this.add(txt2);
        
        txt3 = new JTextField(3);
        txt3.setToolTipText("color: 0-255");
        txt3.addActionListener(this);
        this.add(txt3);
        
        txt4 = new JTextField(25);
        txt4.setToolTipText("ruta de la imagen");
        txt4.addActionListener(this);
        this.add(txt4);

        lbl = new JLabel();
        this.add(lbl);

        btn = new JButton("Colores");
        btn.setToolTipText("cambiar de color");
        btn.addActionListener(this);
        this.add(btn);

        CerrarVentana cerrar = new CerrarVentana();
        this.addWindowListener(cerrar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btn) {
           int r = Integer.parseInt(txt1.getText());
           int g = Integer.parseInt(txt2.getText());
           int b = Integer.parseInt(txt3.getText());
   
           Color colores = new Color(r, g, b);
            if ((e.getModifiers() & ActionEvent.CTRL_MASK)!=0) {
                btn.setForeground(colores); //cambia color de Texto  
            }else{
                btn.setBackground(colores);//cambia color del Fondo
              
            }
            if (e.getSource() == txt3) {
                btn.setBackground(colores);
            }
       }


       if (e.getSource() == txt4) {
        ImageIcon image = new ImageIcon(txt4.getText());
        lbl.setIcon(image);
       }
    }

    //si el usuario desea salir, realmente quiere salir? SI = cerramos programa.
    private class CerrarVentana extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {//JOptionPane.showConfirmDialog --> es la VENTANA, contiene Titulo, Pregunta y Botones SI y NO.
            int respuestaUser = JOptionPane.showConfirmDialog(rootPane, "Deseas salir?", "Cierre de la ventana" , JOptionPane.YES_NO_OPTION);
            if (respuestaUser == JOptionPane.YES_OPTION) {
                System.exit(respuestaUser);
            }
        }
    }
    // rootPane ->componente principal del formulario, indica a jv q cuadro de dialogo pertenece a esta ventana
    // JOptionPane.YES_NO_OPTION -> Indica que solo habra 2BOTONES SI y NO.
}
