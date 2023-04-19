import javax.swing.JOptionPane;

public class Exercicio11_easy {

    public int somaDois(int numeroDigitado) {
        
        int contador = 1;
        while (contador <= 100) {
            numeroDigitado = numeroDigitado + 2;
            contador ++;
        }
        return numeroDigitado;
    }
    
}