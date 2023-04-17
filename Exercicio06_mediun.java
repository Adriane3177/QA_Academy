import javax.swing.JOptionPane;

public class Exercicio06_mediun {

    public static void main(String[] args) {

        int contador = 10, fatorial;
        fatorial = Integer.parseInt(JOptionPane.showInputDialog("Informe o número a ser calculado"));
        fatorial = contador;
        while (contador >= 1) {
            System.out.println("Fatorial = " + fatorial +" X "+ (contador) + " = " + (fatorial * (contador)));
            fatorial = fatorial * contador;
            contador = contador - 1;

        }
        System.out.println("O resultado do fatorial é: " + fatorial);

    }    
}