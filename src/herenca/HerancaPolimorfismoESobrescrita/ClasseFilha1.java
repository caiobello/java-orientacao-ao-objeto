package herenca.HerancaPolimorfismoESobrescrita;

public class ClasseFilha1 extends ClasseMae {

    @Override //Palavra para Sobrescrever o método!!!
    void metodo1() {
        System.out.println("Método 1 da Classe filha 1");
    }
}
