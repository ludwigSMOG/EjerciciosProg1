package Ejercicio12;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener, MouseMotionListener, KeyListener {
    // TODO Coor en botones.

    // TODO eliminar listeenr innecesarios
    // llamar a todos los componentes con un bucle
    JButton amarillo;
    JButton azul;
    JButton aleatorio;
    JLabel lbl;

    public Formulario() {
        super("Colores");

        amarillo = new JButton("Amarillo");
        amarillo.setBounds(50, 50, 100, 50);
        amarillo.addActionListener(this);
        amarillo.addKeyListener(this);
        amarillo.addMouseMotionListener(this);
        this.add(amarillo);

        azul = new JButton("Azul");
        azul.setBounds(150, 50, 100, 50);
        azul.addActionListener(this);
        azul.addKeyListener(this);
        azul.addMouseMotionListener(this);
        this.add(azul);

        aleatorio = new JButton("Aleatorio");
        aleatorio.setBounds(250, 50, 100, 50);
        aleatorio.addActionListener(this);
        aleatorio.addKeyListener(this);
        aleatorio.addMouseMotionListener(this);
        this.add(aleatorio);

        lbl = new JLabel("Pulsa una tecla.");
        lbl.setBounds(155, 15, 350, 30);
        lbl.addKeyListener(this);
        this.add(lbl);

        this.getContentPane().addMouseMotionListener(this);//añadirlo al panel para que no pille los bordes 
        this.addKeyListener(this);
        this.setFocusable(true);

        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseExited(MouseEvent e) {

                setTitle("Colores");
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == amarillo) {
            this.getContentPane().setBackground(Color.YELLOW);
        } else if (e.getSource() == azul) {
            this.getContentPane().setBackground(Color.BLUE);
        } else if (e.getSource() == aleatorio) {
            // int x = (int) (Math.random() * 600);
            // int y = (int) (Math.random() * 400);
            int x = (int) (Math.random() *
                    (this.getContentPane().getWidth() - aleatorio.getWidth()));
            int y = (int) (Math.random() *
                    (this.getContentPane().getHeight() - aleatorio.getHeight()));
            if ((e.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
                aleatorio.setLocation(x, y);// muevo el boton aleatorio
            } else {
                this.setLocation(x, y);// muevo ventana
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if (e.getSource() == amarillo) {
            x += amarillo.getX();
            y += amarillo.getY();
        }
        if (e.getSource() == azul) {
            x += azul.getX();
            y += azul.getY();
        }

        if (e.getSource() == aleatorio) {
            x += aleatorio.getX();
            y += aleatorio.getY();
        }
        this.setTitle("Control raton, X: " + x + " Y: " + y);

        lbl.setText("Raton Coorde, X:" + x + " Y:" + y);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char letra = e.getKeyChar();
        int codiTecla = e.getKeyCode();

        lbl.setText("Caracter:" + letra + " / Codigo del caracter:" + codiTecla);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}