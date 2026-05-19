import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario1 extends JFrame implements ActionListener, MouseMotionListener {

    //para un formulario PRINCIPAL heredas de JFrame siempre si es uno secundario, heredas de otro
    //siempre cuando tengas que gestionar eventos o veas que hay eventos como el click de un boton o asi
    //automaticamente piensa en que tienes que implementar el ActionListener
    //y SOLO se añaden los elementos que van a tener eventos no todos

    // todos los elementos se declaran fuera del constructor
    // luego dentro del constructor es cuando le das las propiedades
    // correspondientes
    JButton amari;
    JButton azul;
    JButton aleatorio;
    JLabel lblInfo;

    public Formulario1() {
        // aunque no lo parezca el orden es fundamental
        // primero se crea el boton, nombre, posicion y tamaño
        // segundo se añade y aqui da igual si lo añades primero al panel o al gestor de
        // eventos

        // NOTA: dividelo por bloques, no mezcles, primero el boton amarillo, luego el
        // azul y luego el aleatorio asi con todo lo que te pidan

        // para cambiar el titulo
        super("Colores");

        // boton amarillo
        amari = new JButton("Amarillo");
        amari.setBounds(50, 50, 120, 30);
        amari.addActionListener(this);
        this.add(amari);

        // boton azul
        azul = new JButton("Azul");
        azul.setBounds(200, 50, 120, 30);
        azul.addActionListener(this);
        this.add(azul);

        // boton aleatorio
        aleatorio = new JButton("Aleatorio");
        aleatorio.setBounds(50, 100, 120, 30);// x,y,ancho,alto
        aleatorio.addActionListener(this);
        this.add(aleatorio);

        lblInfo = new JLabel("Pulsa una tecla");
        lblInfo.setBounds(50,150,400,30);
        this.add(lblInfo);

        // raton -> tiene su propio listener porque no entran dentro del action
        // tienes el MouseMotionListener para movimientos del raton
        this.getContentPane().addMouseMotionListener(this);

        // MouseListener para los clicks y entradas/salidas del raton
        this.getContentPane().addMouseListener(new MouseListener() {

            @Override
            public void mouseExited(MouseEvent e) {
                setTitle("Colores");
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
        });

        // tecla -> el teclado tiene su gestor de eventos a parte como el raton
        // solo existe el KeyListener o KeyAdapter que tiene diferentes eventos
        // que te auyudan a saber las teclas
        this.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                lblInfo.setText("Tecla: " + e.getKeyChar() +
                                " Codigo: " + e.getKeyCode());
            }
        });

        this.setFocusable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //ActionEvent es quien se encarga de recoger todo tipo de eventos que se disparan de componentes
        if (e.getSource() == amari) {
            this.getContentPane().setBackground(Color.YELLOW);

        } else if (e.getSource() == azul) {
            this.getContentPane().setBackground(Color.BLUE);

        } else if (e.getSource() == aleatorio) {
            int x = (int) (Math.random() * 600);
            int y = (int) (Math.random() * 400);

            // SI aleatorio + SHIFT cambia pos del btnAleatorio zona vis del formulario
            if ((e.getModifiers() & ActionEvent.SHIFT_MASK) != 0) {

                int maxX = this.getContentPane().getWidth() - aleatorio.getWidth();
                int maxY = this.getContentPane().getHeight() - aleatorio.getHeight();

                x = (int) (Math.random() * Math.max(1, maxX));
                y = (int) (Math.random() * Math.max(1, maxY));

                aleatorio.setLocation(x, y);
            } else {
                this.setLocation(x, y);
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        // no se usa en este ejercicio
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        setTitle("Control del raton (X:" + e.getX() + ", Y:" + e.getY() + ")");
    }

}
    //raton -> tiene su propio listener porque no entran dentro del action
    //tienes el MouseMotionListener para movimientos del raton
    //MouseListener para los clicks y entradas/salidas del raton

    //tecla -> el teclado tiene su gestor de eventos a parte como el raton
    //solo existe el KeyListener o KeyAdapter que tiene diferentes eventos 
    //que te auyudan a saber las teclas

