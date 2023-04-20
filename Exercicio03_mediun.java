public class Exercicio03_mediun {

    public void calculaSoma() {
        
        int contador = 0, soma = 0;
        while (contador <= 1000) {
            soma = soma + contador;
            contador ++;
            System.out.println("A soma é: " + soma);
            if (soma >= 1500) {
                break;
            }
        }
    }
    
}