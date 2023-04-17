import javax.swing.JOptionPane;

public class Exercicio09_mediun {
    
    public static void main(String[] args) {
        int contador = 0;
        String[] vetorNomeAluno = new String[4];
        int[] vetorNumeroAluno = new int[4];

        while (contador < 4) {
            vetorNomeAluno[contador] = JOptionPane.showInputDialog("Nome do Aluno:");
            vetorNumeroAluno[contador] = Integer.parseInt(JOptionPane.showInputDialog("Número do aluno"));
            contador ++;
                        
        }
        contador = 0;
        while (contador < 4) {
            System.out.println("Nome do Aluno: "+ vetorNomeAluno[contador] + " - Número do Aluno: "+ vetorNumeroAluno[contador]);
            contador ++;
                        
        }


    }
}
