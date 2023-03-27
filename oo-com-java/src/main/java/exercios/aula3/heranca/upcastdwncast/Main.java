package exercios.aula3.heranca.upcastdwncast;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
