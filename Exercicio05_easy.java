import javax.swing.JOptionPane;

public class Exercicio05_easy {

   public static void main(String[] args) {
       int numeroDigitado1, numeroDigitado2, numeroDigitado3, soma, subtracao, multiplicacao, media;
       numeroDigitado1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
       numeroDigitado2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
       numeroDigitado3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: "));
    soma = numeroDigitado1 + numeroDigitado2 + numeroDigitado3;
    multiplicacao = numeroDigitado1 * numeroDigitado2 *numeroDigitado3;
    subtracao = numeroDigitado1 - numeroDigitado2 - numeroDigitado3;
    media = soma / 3;
    System.out.println("A soma é : " + soma);
    System.out.println("A multiplicação é : " + multiplicacao);
    System.out.println("A subtração é : " + subtracao);
    System.out.println("A média é : " + media);
    JOptionPane.showMessageDialog(null,"A média é : " + media);

    

    
    }
    
}