
import javax.swing.JOptionPane;

public class exercicio4 {

    public static void main(String[] args) {

        String entradaA, entradaB, entradaC;
        double a, b, c, delta, raiz1, raiz2;

        entradaA = JOptionPane.showInputDialog("Digite o valor A: ");
        a = Double.parseDouble(entradaA);

        entradaB = JOptionPane.showInputDialog("Digite o valor B: ");
        b = Double.parseDouble(entradaB);

        entradaC = JOptionPane.showInputDialog("Digite o valor C: ");
        c = Double.parseDouble(entradaC);

        delta = b * b - 4 * a * c;

        if (delta > 0) {
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

            JOptionPane.showMessageDialog(null, "As raizes da equação são:\nraiz 1: " + raiz1 + "\nraiz 2: " + raiz2);
        } else {
            JOptionPane.showMessageDialog(null, "Não será possível calcular as raízes, pois o delta e menor ou igual a zero. ");
        }

    }

}
