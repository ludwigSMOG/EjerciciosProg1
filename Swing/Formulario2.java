import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario2 extends JFrame implements ActionListener{

    JTextField txt1;
    JTextField txt2;
    JTextField txt3;
    JButton color;
    JTextField txtruta;
    JLabel lblimagen;

     public Formulario2() {
        super("Colores");
        this.setSize(WIDTH, HEIGHT);

        txt1 = new JTextField("text1");
        txt1.setBounds(50, 50, 120, 30);
        txt1.addActionListener(this);
        this.add(txt1);

        txt2 = new JTextField("text2");

        txt3 = new JTextField("text3");
     }

     @Override
     public void actionPerformed(ActionEvent e) {
        
     }
}