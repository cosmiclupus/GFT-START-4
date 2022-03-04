package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercício calculadora");
        Calculadora.soma(2,4);
        Calculadora.subtracao(1,49);
        Calculadora.soma(6,2);
        Calculadora.soma(5,4);

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(1);

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1231, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1231, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1231, 5);


    }
}
