public class Main {
    public static void main(String[] args) {
        //calculadora
        System.out.println("Exercico calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.9);
        Calculadora.multiplicacao(9.988, 0.88);
        Calculadora.divisao(9, 0.023);

        //Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);
        Mensagem.obterMensagem(2);

        //Emprestimo
        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(2000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(3000, 5);
    }
}