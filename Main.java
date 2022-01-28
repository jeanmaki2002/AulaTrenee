package Exercício1;

public class Main{

   public static void main(String[] args) {

       System.out.println("Os resultados da calculadora");
        Calculadora.soma(9,8);
        Calculadora.substração(6,4);
        Calculadora.multiplicação(9,2);
        Calculadora.divisão(9,3);
        System.out.println("Mensagem solicitada");
        Mensagem.obterMensagem(7);
        System.out.println("As taxas do emprestimo no Banco do Brasil");
        Emprestimo.calculator(1200,Emprestimo.getDuasParcela());
        Emprestimo.calculator(1200,Emprestimo.getTresParcela());
    }
}
