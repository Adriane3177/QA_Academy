public class Exercicio08_easy {

    public Double calculaImpostoRenda(Double salario) {
        Double impostoRenda = 0.0;
        // salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario: "));
        if (salario <= 1903.98) {
            impostoRenda = 0.0;
        }
        if (salario > 1903.98 && salario <= 2826.25) {
            impostoRenda = (salario * 0.075) - 142.80;
        }
        if (salario > 2826.25 && salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.80;
        }
        if (salario > 3751.05 && salario <= 4664.68) {
            impostoRenda = (salario * 0.225) - 636.13;
        }
        if (salario > 4664.68) {
            impostoRenda = (salario * 0.275) - 869.36;
        }
        return impostoRenda;
    }    

    public Double calculaSalarioLiquido(Double salario, Double impostoRenda) {
        Double salarioLiquido = 0.0;
        salarioLiquido =  salario - impostoRenda;
        return salarioLiquido;
    }    
    
}