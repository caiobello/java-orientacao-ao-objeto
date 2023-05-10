package interface_implements;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(double operan1, double operando2) {
        System.out.println("Soma: " + (operan1 + operando2));
    }

    @Override
    public void divisao(double operan1, double operando2) {
        System.out.println("Divisao: " + (operan1/operando2));

    }

    @Override
    public void multiplicacao(double operan1, double operando2) {
        System.out.println("Multiplicacao: " + (operan1 * operando2));
    }

    @Override
    public void subtracao(double operan1, double operando2) {
        System.out.println("Subtracao: " + (operan1 - operando2));
    }
}