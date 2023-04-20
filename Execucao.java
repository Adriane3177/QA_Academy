import javax.swing.JOptionPane;

public class Execucao {
    
    public static void main(String[] args) {

    //    ExemploInstanciaDeClasse exemploInstanciaDeClasse = new ExemploInstanciaDeClasse();
    //    System.out.println(exemploInstanciaDeClasse.nomeDaClasse);
    //    exemploInstanciaDeClasse.exibirNomeClasse();
        
    //    String Primeirovalor = JOptionPane.showInputDialog("Digite o Primeiro Valor");
    //    String Segundovalor = JOptionPane.showInputDialog("Digite o Segundo Valor");
    //    Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
    //    System.out.println(exercicio03_easy.retornaValorTrocado(Primeirovalor,Segundovalor));
    
    //    String numerodigitadousuario = JOptionPane.showInputDialog("Digite o valor: ");
    //    int numerodigitado = Integer.parseInt(numerodigitadousuario);
    //    Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
    //    System.out.println(exercicio04_easy.retornaDobroValor(numerodigitado));

    //  String primeiroDigitadoStr = JOptionPane.showInputDialog("Informe o primeiro número: ");
    //  String segundoDigitadoStr = JOptionPane.showInputDialog("Informe o segundo número: ");
    //  String terceiroDigitadoStr = JOptionPane.showInputDialog("Informe o terceiro número: ");
    //  int numeroDigitado1 = Integer.parseInt(primeiroDigitadoStr);
    //  int numeroDigitado2 = Integer.parseInt(segundoDigitadoStr);
    //  int numeroDigitado3 = Integer.parseInt(terceiroDigitadoStr);
    //  Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
    //  System.out.println("A soma é:" + exercicio05_easy.soma(numeroDigitado1, numeroDigitado2, numeroDigitado3));
    //  System.out.println("A subtração é:" + exercicio05_easy.subtracao(numeroDigitado1, numeroDigitado2, numeroDigitado3));
    //  System.out.println("A multiplicação é:" + exercicio05_easy.multiplicacao(numeroDigitado1, numeroDigitado2, numeroDigitado3));
    //  System.out.println("A media é:" + exercicio05_easy.media(numeroDigitado1, numeroDigitado2, numeroDigitado3));

    //  Double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: "));
    //  Double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: "));
    //  Exercicio06_easy exercicio06_easy = new Exercicio06_easy();
    //  System.out.println(exercicio06_easy.verificaAprovacao(nota1, nota2));

    //  Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
    //  Exercicio07_easy exercicio07_easy = new Exercicio07_easy();
    //  System.out.println(exercicio07_easy.RetornaCalculaInss(salario));

    // Double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario: "));
    // Exercicio08_easy exercicio08_easy = new Exercicio08_easy();
    // System.out.println(salario);
    // Double impostoRenda = exercicio08_easy.calculaImpostoRenda(salario);
    // System.out.println(impostoRenda);
    // System.out.println(exercicio08_easy.calculaSalarioLiquido(salario, impostoRenda));
    
    // int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número digitado"));
    // Exercicio09_easy exercicio09_easy = new Exercicio09_easy();
    // exercicio09_easy.CalculaTabuada(numeroDigitado);

    // Double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Investimento:"));
    // Exercicio10_02easy exercicio10_02easy = new Exercicio10_02easy();
    // Double valorJuros = exercicio10_02easy.CalculaValorJuros(valorInvestimento);
    // Double valorTotal = valorInvestimento + valorJuros;
    // System.out.println("Valor do Investimento:" + valorInvestimento);
    // System.out.println("Valor do Juros:" + valorJuros);
    // System.out.println("Valor Total com Juros:" + valorTotal); 

    // int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
    // Exercicio11_easy exercicio11_easy = new Exercicio11_easy();
    // int valorTotal = exercicio11_easy.somaDois(numeroDigitado);
    // System.out.println("O Total somado é " + valorTotal);

    // Exercicio01_mediun exercicio01_mediun = new Exercicio01_mediun();
    // exercicio01_mediun.verificaImparOuPar();

    // Double valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Investimento"));
    // Exercicio02_mediun exercicio02_mediun = new Exercicio02_mediun();
    // System.out.println("O valor do investimento é " + valorInvestimento);
    // Double totalJuros = exercicio02_mediun.calculaValorJuros(valorInvestimento);
    // System.out.println("O valor total do juros é " + totalJuros);
    // System.out.println("O valor atualizado do investimento é " + exercicio02_mediun.calculaTotalComJuros(valorInvestimento, totalJuros));
    
    // Exercicio03_mediun exercicio03_mediun = new Exercicio03_mediun();
    // exercicio03_mediun.calculaSoma();

    //    Exercicio04_mediun exercicio04_mediun = new Exercicio04_mediun();
    //    exercicio04_mediun.MultiplicaNumeros();

    // Exercicio05_mediun exercicio05_mediun = new Exercicio05_mediun();
    // int menorNumeroDigitado = exercicio05_mediun.MenorNumero();
    // System.out.println("O menor número digitado é " + menorNumeroDigitado);

    int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Informe o número a ser calculado"));
    Exercicio06_mediun exercicio06_mediun = new Exercicio06_mediun();
    fatorial = exercicio06_mediun.ExibeFatorial(fatorial);
    System.out.println("O resultado do fatorial é: " + fatorial);


    
 
    }   
}