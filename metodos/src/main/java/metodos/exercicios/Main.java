package metodos.exercicios;

public class Main {
    public static void main(String[] args) {


        //calculadora
        System.out.println("Exercio calculadora");
        Calculadora.soma(10,3);
        Calculadora.multiplicacao(10,3);
        Calculadora.subtraicao(10,3);
        Calculadora.divisao(10,3);

        //Mensagem
       Mensagem.obterMensagem(1);
       Mensagem.obterMensagem(13);
       Mensagem.obterMensagem(20);
       Mensagem.obterMensagem(9);

       //Emprestimo
       Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
       Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
       Emprestimo.calcular(1000, 5);


    }
}
