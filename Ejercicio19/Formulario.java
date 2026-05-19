import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Formulario extends JFrame{
    
    JCheckBox check;

    public Formulario() {
    
        for (int i = 0; i < 49; i++) {
            check = new JCheckBox();
        }
    }
}