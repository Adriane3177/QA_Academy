
public class Exercicio06_mediun {

    public int ExibeFatorial(int fatorial) {

        int contador = 10;
        fatorial = contador;
        while (contador >= 1) {
            fatorial = fatorial * contador;
            contador = contador - 1;
        }
        return fatorial;
      
    }    
}