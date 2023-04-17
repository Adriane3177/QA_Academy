public class ExercicioMetodosComParametro {
    
    public static void main(String[] args) {
        //com retorno

        System.out.println(exemploComParametros(33,"Adriane Carvalho"));
        System.out.println(retornarPalavra("Teste")); 
        System.out.println(retornarDobro(10));
        System.out.println(retornarNomeSobrenome("Flavio", "Dias"));
        System.out.println(retornarSalario("Flavio"));

        // sem retorno
        
        exemploComParametrosSemRetorno(33,"Adriane Carvalho");
        retornarPalavraSemRetorno("Teste");
        retornarDobroSemRetorno(10);
        retornarNomeSobrenomeSemRetorno("Flavio", "Dias");
        retornarSalarioSemRetorno("Flavio");

    }
    public static String exemploComParametros(int idade, String nome) {
        return "Nome: " + nome + " Idade: " + idade;
    }
    public static String retornarPalavra(String palavra) {
        return "Palavra: " + palavra;
    }
    public static int retornarDobro(int contador) {
        return (contador * 2);
    }
    public static String retornarNomeSobrenome(String nome, String sobrenome) {
        return "Nome : " + nome + " " + sobrenome;
    }
    public static Double retornarSalario(String nome) {
        return 2000.00;
    }

    public static void exemploComParametrosSemRetorno(int idade, String nome) {
        System.out.println("Nome: " + nome + " Idade: " + idade );
    }
    public static void retornarPalavraSemRetorno(String palavra) {
        System.out.println("Palavra: " + palavra );
    }
    public static void retornarDobroSemRetorno(int contador) {
        System.out.println("O dobro: " + (contador * 2));
    }
    public static void retornarNomeSobrenomeSemRetorno(String nome, String sobrenome) {
        System.out.println("Nome : " + nome + " " + sobrenome);
    }
    public static void retornarSalarioSemRetorno(String nome) {
        System.out.println("Salário : R$ " + 2000.00);
    }
}
