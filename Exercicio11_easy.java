import javax.swing.JOptionPane;

public class Exercicio11_easy {

    public static void main(String[] args) {
        
        int contador = 1, numeroDigitado;
        numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
        while (contador <= 100) {
            numeroDigitado = numeroDigitado + 2;
            System.out.println("O Total somado é " + numeroDigitado);
            contador ++;
        }

    }
    
}