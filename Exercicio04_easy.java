import javax.swing.JOptionPane;

public class Exercicio04_easy {
   
   
    public static void main(String[] args) {
        int numerodigitado, resultado;
        String numerodigitadousuario = JOptionPane.showInputDialog("Digite o valor: ");
        numerodigitado = Integer.parseInt(numerodigitadousuario);
        resultado = numerodigitado * 2;
        System.out.println("O dobro do número é: " + resultado);
        JOptionPane.showMessageDialog(null, "O dobro do número é: " + resultado);
   
       }  
}
