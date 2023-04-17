import javax.swing.JOptionPane;

public class Exercicio10_01easy {

    public static void main(String[] args) {
        Double valorJuros, valorInvestimento = 0.0, valorTotal = 0.0, taxaJuros = 0.05;
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Investimento:"));
        valorJuros = ( 10 * taxaJuros ) * valorInvestimento;
        valorTotal = valorInvestimento + valorJuros;
        System.out.println("Valor do Investimento:" + valorInvestimento);
        System.out.println("Valor do Juros:" + valorJuros);
        System.out.println("Valor Total com Juros:" + valorTotal);

    }
 
}
