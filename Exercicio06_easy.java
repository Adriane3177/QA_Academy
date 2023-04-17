import javax.swing.JOptionPane;

public class Exercicio06_easy {

    public static void main(String[] args) {
        Double nota1, nota2, media;
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
        media = (nota1 + nota2) / 2;
        if (media < 5) {
            System.out.println("Resultado: Reprovado: " + media);
        }
        else if (media == 5) {
            System.out.println("Resultado: Exame: " + media);
        }
        else{
            System.out.println("Resultado: Aprovado: " + media);
        }
            
    }
}