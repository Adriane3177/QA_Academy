import javax.swing.JOptionPane;

public class Exercicio03_easy {//inicio algoritmo
    static String Primeirovalor;
    static String Segundovalor;

     /**
     * @param args
     */
    public static void main(String[] args) {
        Primeirovalor = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        Segundovalor = JOptionPane.showInputDialog("Digite o segundo valor: ");
        System.out.println("Primeiro Valor digitado:"+Segundovalor);
        System.out.println("Segundo Valor digitado:"+Primeirovalor);
    }

    
}//fim algoritimo
