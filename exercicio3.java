
import javax.swing.JOptionPane;

public class exercicio3 {

    public static void main(String[] args) {

        String entradaBolsa, entradaTempoEstagio;
        double bolsa;
        int tempoEstagio;

        entradaBolsa = JOptionPane.showInputDialog("Digite o valor da bolsa: ");

        bolsa = Double.parseDouble(entradaBolsa);

        entradaTempoEstagio = JOptionPane.showInputDialog("Digite o tempo de estagio em anos: ");

        tempoEstagio = Integer.parseInt(entradaTempoEstagio);

        if ((bolsa >= 750.00 && bolsa <= 950.00) && (tempoEstagio >= 2)) {
            JOptionPane.showMessageDialog(null, "participa do treinamento");
        } else {
            JOptionPane.showMessageDialog(null, "não participará");
        }
    }
}
