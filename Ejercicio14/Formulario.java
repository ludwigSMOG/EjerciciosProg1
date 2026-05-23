
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class Formulario extends JFrame implements ActionListener {
    JTextField txt1;
    JTextField txt2;

    JLabel lbl;
    JLabel lbl2;
    JLabel lbl3Rojo;

    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    JRadioButton rb4;

    JButton btn;

    JComboBox comb;

    int cont = 0;

    public Formulario() {
        super("Formulario");

        txt1 = new JTextField("");
        txt1.setBounds(50, 50, 50, 20);
        txt1.addActionListener(this);
        this.add(txt1);

        lbl = new JLabel("?");
        lbl.setBounds(120, 46, 10, 30);
        this.add(lbl);

        txt2 = new JTextField("");
        txt2.setBounds(150, 50, 50, 20);
        txt2.addActionListener(this);
        this.add(txt2);

        lbl2 = new JLabel("= ");
        lbl2.setBounds(210, 46, 100, 30);
        this.add(lbl2);

        btn = new JButton("Operacion");
        btn.setBounds(200, 100, 100, 30);
        btn.addActionListener(this);
        this.add(btn);

        lbl3Rojo = new JLabel();
        lbl3Rojo.setBounds(300, 100, 200, 30);
        this.add(lbl3Rojo);

        rb1 = new JRadioButton("Suma");
        rb1.setBounds(200, 150, 100, 30);
        rb1.setSelected(true);// opcion sum selec por defecto.
        this.add(rb1);

        rb2 = new JRadioButton("Resta");
        rb2.setBounds(200, 200, 100, 30);
        this.add(rb2);

        rb3 = new JRadioButton("Multiplicacion");
        rb3.setBounds(200, 250, 150, 30);
        this.add(rb3);

        rb4 = new JRadioButton("Division");
        rb4.setBounds(200, 300, 100, 30);
        this.add(rb4);

        comb = new JComboBox<>();
        comb.setBounds(200, 350, 150, 30);
        comb.addItem(0);
        comb.addItem(1);
        comb.addItem(2);
        comb.addItem(3);
        comb.addItem(4);
        comb.addItem(5);

        comb.setSelectedItem(accessibleContext);
        this.add(comb);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        grupo.add(rb4);

        Timer temporizador = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cont++;
                int minutos = cont / 60;
                int segundos = cont % 60;// me quedo con el resto de la division

                setTitle(minutos + ":" + segundos);
            }
        });
        temporizador.start();// empieza
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Scanner sc = new Scanner(System.in);
        // boolean flag;
        try {

            if (e.getSource() == btn | e.getSource() == txt2) {
                double num1 = Double.parseDouble(txt1.getText());// leer los dos numeros
                double num2 = Double.parseDouble(txt2.getText());

                double resultado = 0;
                lbl3Rojo.setText("");
                if (rb1.isSelected()) {
                    lbl.setText("+");
                    resultado = num1 + num2;

                } else if (rb2.isSelected()) {
                    lbl.setText("-");
                    resultado = num1 - num2;

                } else if (rb3.isSelected()) {
                    lbl.setText("*");
                    resultado = num1 * num2;

                } else if (rb4.isSelected()) {
                    if (num2 != 0) {
                        lbl.setText("/");
                        resultado = num1 / num2;
                    } else {
                        lbl3Rojo.setText("Error, operacion invalida!");
                        lbl3Rojo.setForeground(Color.RED);

                    }

                }

                switch (comb.getSelectedIndex()) {
                    case 0:
                        lbl2.setText(String.format(" = %.0f", resultado));
                        break;
                    case 1:
                        lbl2.setText(String.format(" = %.1f", resultado));

                        break;
                    case 2:
                        lbl2.setText(String.format(" = %.2f", resultado));

                        break;
                    case 3:
                        lbl2.setText(String.format(" = %.3f", resultado));

                        break;
                    case 4:
                        lbl2.setText(String.format(" = %.4f", resultado));

                        break;
                    case 5:
                        lbl2.setText(String.format(" = %.5f", resultado));

                        break;
                    default:
                        System.out.println("opcion no valida!");
                        break;
                }

            }
        } catch (NumberFormatException ee) {
            // flag = true;
            System.out.print("dato no valido!");
            sc.nextLine();
        }

    }
}
