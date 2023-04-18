// import javax.swing.JOptionPane;

public class Exercicio07_easy {//inicio algoritimo

    public String RetornaCalculaInss(Double salario) {
        Double inss = 0.0;
    //    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
        if (salario <= 1045.00) {
            inss = salario * 0.075;
        }
        if (salario > 1045.00 && salario <= 2089.60) {
            inss = salario * 0.09;
        }
        if (salario > 2089.60 && salario <= 3140.40) {
            inss = salario * 0.12;
        }
        if (salario > 3140.40 && salario <= 6101.06) {
            inss = salario * 0.14;
        }
        if (salario > 6101.06) {
            inss = 854.15;
        }
        return "O valor do inss a ser pago é R$: " + inss;
    }

} // fim algoritimo