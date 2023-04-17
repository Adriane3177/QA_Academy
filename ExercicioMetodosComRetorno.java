public class ExercicioMetodosComRetorno {
 
    public static void main(String[] args){
        System.out.println(metodoUm());
        System.out.println(metodoDois());
        System.out.println(metodoTres());
        System.out.println(metodoQuatro());
        System.out.println(metodoCinco());

    }

    public static String metodoUm() {
        String mensagem;
        mensagem = "Metodo Um";
        return mensagem;
               
    }
    public static int metodoDois() {
        return 2;
               
    }
    public static Double metodoTres() {
        return 3.0;
               
    }
    public static Boolean metodoQuatro() {
        return true;
               
    }
    public static String metodoCinco() {
        return "Método Cinco";
               
    }
}