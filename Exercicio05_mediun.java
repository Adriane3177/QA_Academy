import javax.swing.JOptionPane;

public class Exercicio05_mediun {
    public int MenorNumero() {
        int contador = 1, menorNumeroDigitado = 0;
        int numeroDigitado = lerNumeroDigitado();
        while (contador < 5) {
            numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
            if (numeroDigitado < menorNumeroDigitado || contador == 0 ) {
                menorNumeroDigitado = numeroDigitado;

            }
            contador ++;
        }
        return menorNumeroDigitado;
    }
    public int lerNumeroDigitado() {
        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
        return numeroDigitado;
    }
}
