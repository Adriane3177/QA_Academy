import javax.swing.JOptionPane;

public class Exercicio08_easy {

    public static void main(String[] args) {
        Double salario, salarioLiquido = 0.0, impostoRenda = 0.0;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario: "));
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
        salarioLiquido =  salario - impostoRenda;
        System.out.println("O valor do salário é: " + salario);
        System.out.println("O valor do salário Líquido é: " + salarioLiquido);
        System.out.println("O valor do imposto de Renda é: " + impostoRenda);
    }    
    
}