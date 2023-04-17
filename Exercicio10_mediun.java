public class Exercicio10_mediun {

    public static void main(String[] args) {
        int contador = 20;
        int[] fibonacci;
        fibonacci = new int[contador];
        int i = 2;
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < contador) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            i++;
        }
        i=0;
        while (i < contador) {
            System.out.println("Termo: "+(i+1)+" - Valor: " +fibonacci[i]);
           i++; 
        }
    }
    

}
