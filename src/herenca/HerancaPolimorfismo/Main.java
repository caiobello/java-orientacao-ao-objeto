package herenca.HerancaPolimorfismo;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        //Up casting de  gerente para funcionario!!!
        Funcionario gerente = new Gerente();
        Funcionario Faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();
        //Evitar usar Down casting na orientacao ao objeto!
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
