import javax.swing.JOptionPane;

public class Execucao {
    
    public static void main(String[] args) {

    //    ExemploInstanciaDeClasse exemploInstanciaDeClasse = new ExemploInstanciaDeClasse();
    //    System.out.println(exemploInstanciaDeClasse.nomeDaClasse);
    //    exemploInstanciaDeClasse.exibirNomeClasse();
        
    String Primeirovalor = JOptionPane.showInputDialog("Digite o Primeiro Valor");
    String Segundovalor = JOptionPane.showInputDialog("Digite o Segundo Valor");

    Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
    System.out.println(exercicio03_easy.retornaValorTrocado(Primeirovalor,Segundovalor));
    
    }
}
