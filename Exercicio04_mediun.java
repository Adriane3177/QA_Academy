public class Exercicio04_mediun {
    
    public static void main(String[] args) {
        int contador = 1, resultadoMultiplicacao = 1;
        while (contador <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * contador;
            System.out.println("O resultado da multiplicação é " + resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000) {
                resultadoMultiplicacao = 1;
            }
            contador ++;
        }
        
    }
}
