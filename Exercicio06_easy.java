import javax.swing.JOptionPane;

public class Exercicio06_easy {

    public String verificaAprovacao(Double nota1, Double nota2) {
        // nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
        // nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
        Double media = (nota1 + nota2) / 2;
        if (media < 5) {
            return "Resultado: Reprovado: " + media;
        }
        else if (media == 5) {
            return "Resultado: Exame: " + media;
        }
        else{
            return "Resultado: Aprovado: " + media;
        }
            
    }
}