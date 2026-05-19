package Ejercicio12;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener, MouseMotionListener, MouseListener, KeyListener {

    JButton amarillo;
    JButton azul;
    JButton aleatorio;
    JLabel lbl;

    public Formulario() {
        super("Colores");

        amarillo = new JButton("Amarillo");
        amarillo.setBounds(50, 50, 50, 100);
        amarillo.addActionListener(this);
        amarillo.addMouseMotionListener(this);
        amarillo.addMouseListener(this);
        this.add(amarillo);
        
        azul = new JButton("Azul");
        azul.setBounds(150, 50, 50, 100);
        azul.addActionListener(this);
        azul.addMouseMotionListener(this);
        azul.addMouseListener(this);
        this.add(azul);
        
        aleatorio = new JButton("Aleatorio");
        aleatorio.setBounds(250, 50, 120, 120);
        aleatorio.addActionListener(this);
        aleatorio.addMouseMotionListener(this);
        aleatorio.addMouseListener(this);
        this.add(aleatorio);
        
        lbl = new JLabel("Pulsa una tecla.");
        lbl.setBounds(50, 150, 300, 30);
        this.add(lbl);
        
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.addKeyListener(this);
        this.setFocusable(true);
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
            this.setLocation(x, y);
            if ((e.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {
                aleatorio.setLocation(x, y);// muevo el boton aleatorio
            }else{
                this.setLocation(x, y);//muevo ventana
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.setTitle("Control del ratón - (X:" + e.getX() + ", Y:" + e.getY() + ")");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setTitle("Colores");

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char letra = e.getKeyChar();
        int codiTecla = e.getKeyCode();

        lbl.setText("La tecla:" + letra + " y el Codigo:" + codiTecla);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}