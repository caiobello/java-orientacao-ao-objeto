package herenca.HerancaPolimorfismoESobrescrita;

public class Main {
    public static void main(String[] args) {
    //Polimorfismo acontece quando os objetos são diferentes
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for(ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println(" ");

        //Sobrescrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();




    }
}
