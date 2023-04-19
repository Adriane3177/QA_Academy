import javax.swing.JOptionPane;

public class Exercicio09_easy {

   public void CalculaTabuada(int numeroDigitado) {
        int resultado, contador = 1;
     //    numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número digitado"));
        while (contador <= 10) {
             resultado = numeroDigitado * contador;
             System.out.println("Número digitado: " + numeroDigitado + " x " + contador +" = " + resultado);
             contador ++;


        }
   
    }
    
}