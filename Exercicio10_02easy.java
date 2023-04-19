import javax.swing.JOptionPane;

public class Exercicio10_02easy {
    
    public Double CalculaValorJuros(Double valorInvestimento) {
   
        Double valorJuros = 0.0, taxaJuros = 0.05;
        Integer contador = 1;
        while (contador <= 10) {
            valorJuros = valorJuros + (taxaJuros * valorInvestimento);
            contador ++;
        }
        return valorJuros;           
    }

}
