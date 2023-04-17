public class Exercicio01_mediun {
    
    public static void main(String[] args) {    
        int contador = 1;
        while (contador <=100) {
            if (contador % 2 == 0) {
                System.out.println("O número " + contador + " é par");
            }
            else {
                System.out.println("O número " + contador + " é ímpar");
            }
            contador ++;
        }
    }
}
