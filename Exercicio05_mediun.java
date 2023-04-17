import javax.swing.JOptionPane;

public class Exercicio05_mediun {
    public static void main(String[] args) {
        int contador = 0, numeroDigitado, menorNumeroDigitado = 0;
        while (contador < 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
            if (numeroDigitado < menorNumeroDigitado || contador == 0 ) {
                menorNumeroDigitado = numeroDigitado;

            }
            contador ++;
        }
        System.out.println("O menor número digitado é " + menorNumeroDigitado);
    }
}
