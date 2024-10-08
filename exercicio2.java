
import javax.swing.JOptionPane;

public class exercicio2 {

    public static void main(String[] args) {

        String turno, entradaHoras;
        int horasTrabalhadas;
        double valorHora, salario;

        turno = JOptionPane.showInputDialog("Digite seu turno de trabalho (N para Noturno ou qualquer outra letra): ");

        entradaHoras = JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: ");

        horasTrabalhadas = Integer.parseInt(entradaHoras);

        if (turno.equalsIgnoreCase("N")) {
            valorHora = 45.00;
        } else {
            valorHora = 37.50;
        }

        salario = horasTrabalhadas * valorHora;

        JOptionPane.showMessageDialog(null, "O valor fo salario é: R$ " + salario);

    }

}
