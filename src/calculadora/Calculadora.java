package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        int opcao;
        
        JOptionPane.showMessageDialog(null, "Iniciando o programa!");
        JOptionPane.showMessageDialog(null, "@@@@@@@@@@@ Bem Vindo a Calculadora @@@@@@@@@@@");
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "\n Escolha a opçao \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 0 - Sair"));

            Operacoes res = new Operacoes();
            switch (opcao) {
                case 1:
                    float retorno = Float.parseFloat(JOptionPane.showInputDialog("Entre com o primeiro número"));
                    float retorno2 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o segundo número"));
                    JOptionPane.showMessageDialog(null, res.soma(retorno, retorno2));
                    break;
                case 2:
                    float retorno3 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o primeiro número"));
                    float retorno4 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o segundo número"));
                    JOptionPane.showMessageDialog(null, res.subtracao(retorno3, retorno4));
                    break;
                case 3:
                    float retorno5 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o primeiro número"));
                    float retorno6 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o segundo número"));
                    JOptionPane.showMessageDialog(null, res.multiplicacao(retorno5, retorno6));
                    break;
                case 4:
                    float retorno7 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o primeiro número"));
                    float retorno8 = Float.parseFloat(JOptionPane.showInputDialog("Entre com o segundo número"));
                    JOptionPane.showMessageDialog(null, res.divisao(retorno7, retorno8) + " Resto: " + res.resto(retorno7, retorno8));
                    break;
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Programa encerrado");
    }
}
