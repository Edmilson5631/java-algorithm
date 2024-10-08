
import javax.swing.JOptionPane;

public class exercicio5 {

    public static void main(String[] args) {
        String entradaIdade, classeEleitoral;
        int idade;

        entradaIdade = JOptionPane.showInputDialog("Digite a idade da pessoa: ");
        idade = Integer.parseInt(entradaIdade);

        if (idade < 16) {
            classeEleitoral = "não eleitor";
        } else if (idade >= 18 && idade <= 65) {
            classeEleitoral = "eleitor obrigatório";
        } else {
            classeEleitoral = "eleitor facultativo";
        }

        JOptionPane.showMessageDialog(null, "classe eleitoral: " + classeEleitoral);
    }
}
