public class Exercicio04_mediun {
    static void MultiplicaNumeros() {
        int contador = 1, resultadoMultiplicacao = 1;
        while (contador <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * contador;
            System.out.println("O resultado da multiplicação é " + resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000) {
                resultadoMultiplicacao = 1;
                System.out.println("O resultado da multiplicação é " + resultadoMultiplicacao);
            }
            contador ++;
        }
        
    }
}
