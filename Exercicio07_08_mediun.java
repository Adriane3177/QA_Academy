public class Exercicio07_08_mediun {

    public void CriaVetor() {
        String[] vetorMeses;
        int contador = 0;
        vetorMeses = new String[12];

        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

        LerVetor(vetorMeses);
    }
        
    public void LerVetor(String[] vetorMeses) {
        int contador=0;
        while (contador < 12) {
            System.out.println("Mês: " + vetorMeses[contador]);
            contador ++;
        }
    }

}
