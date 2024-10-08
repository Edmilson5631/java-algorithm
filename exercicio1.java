
import javax.swing.JOptionPane;

public class exercicio1 {

    public static void main(String[] args) {

        String entrada;
        int numero;

        entrada = JOptionPane.showInputDialog(" Digite um numero entre 0 e 9: ");

        numero = Integer.parseInt(entrada);

        if (numero >= 0 && numero <= 9) {
            JOptionPane.showMessageDialog(null, " valor correto.");
        } else {
            JOptionPane.showMessageDialog(null, " valor incorreto ");
        }
    }

}
