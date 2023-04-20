import javax.swing.JOptionPane;

public class Exercicio02_mediun {

    public Double calculaValorJuros(Double valorInvestimento) {
        Double totalAtualizadoComJuros, taxaJuros = 0.05;
        int contador = 1;
        // valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Investimento"));
        totalAtualizadoComJuros = valorInvestimento;
        while (contador <= 10) {
            totalAtualizadoComJuros = totalAtualizadoComJuros + (totalAtualizadoComJuros * taxaJuros);
            contador ++;
        }
        return totalAtualizadoComJuros - valorInvestimento;
    }
    public Double calculaTotalComJuros(Double valorInvestimento, Double totalAtualizadoComJuros) {
       return totalAtualizadoComJuros + valorInvestimento;
    }

    
}