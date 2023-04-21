import javax.swing.JOptionPane;

public class Exercicio09_mediun {
    
    public void InformaDados() {
        int contador = 0;
        String[] vetorNomeAluno = new String[4];
        int[] vetorNumeroAluno = new int[4];

        while (contador < 4) {
            vetorNomeAluno[contador] = informaNomeAluno();
            vetorNumeroAluno[contador] = informaNumeroAluno();
            contador ++;
                        
        }
        ExibeDados(vetorNomeAluno,vetorNumeroAluno);
    }
    public String informaNomeAluno() {
        return JOptionPane.showInputDialog("Nome do Aluno:");
    }
    public int informaNumeroAluno() {
        return Integer.parseInt(JOptionPane.showInputDialog("Número do Aluno:"));
    }
    public void ExibeDados(String[] vetorNomeAluno, int[] vetorNumeroAluno) {
        int contador = 0;
        while (contador < 4) {
            System.out.println("Nome do Aluno: "+ vetorNomeAluno[contador] + " - Número do Aluno: "+ vetorNumeroAluno[contador]);
            contador ++;
                        
        }
    }
                               
     
}
