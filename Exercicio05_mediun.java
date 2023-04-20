import javax.swing.JOptionPane;

public class Exercicio05_mediun {
    public int MenorNumero() {
        int contador = 0, menorNumeroDigitado=0;
        while (contador < 5) {
            int numeroDigitado = lerNumeroDigitado();
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
