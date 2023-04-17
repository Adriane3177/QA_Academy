import javax.swing.JOptionPane;

public class Exercicio02_mediun {

    public static void main(String[] args) {
        Double valorInvestimento, totalAtualizadoComJuros, taxaJuros = 0.05;
        int contador = 1;
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Investimento"));
        totalAtualizadoComJuros = valorInvestimento;
        while (contador <= 10) {
            totalAtualizadoComJuros = totalAtualizadoComJuros + (totalAtualizadoComJuros * taxaJuros);
            contador ++;
        }
        System.out.println("O valor do investimento é " + valorInvestimento);
        System.out.println("O valor total do juros é " + (totalAtualizadoComJuros - valorInvestimento) );
        System.out.println("O valor atualizado do investimento é " + totalAtualizadoComJuros);
    }
    
}