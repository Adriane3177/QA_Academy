public class Exercicio10_mediun {

    public void CalculaFibonacci(int contador) {
        int[] fibonacci;
        fibonacci = new int[contador];
        int i = 2;
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < contador) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            i++;
        }
        ExibeFibonacci(fibonacci);
    }
    public void ExibeFibonacci(int[] fibonacci) {
        int contador = fibonacci.length;
        int i=0;
        while (i < contador) {
            System.out.println("Termo: "+(i+1)+" - Valor: " +fibonacci[i]);
           i++; 
        }
    }
    

}
