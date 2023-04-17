import javax.swing.JOptionPane;

public class Exercicio10_02easy {
    
    public static void main(String[] args) {
   
        Double valorJuros = 0.0, valorInvestimento, valorTotal, taxaJuros = 0.05;
        Integer contador = 1;
        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Investimento:"));
        while (contador <= 10) {
            valorJuros = valorJuros + (taxaJuros * valorInvestimento);
            contador ++;
        }
                   
        valorTotal = valorInvestimento + valorJuros;
        System.out.println("Valor do Investimento:" + valorInvestimento);
        System.out.println("Valor do Juros:" + valorJuros);
        System.out.println("Valor Total com Juros:" + valorTotal); 

    }

}
