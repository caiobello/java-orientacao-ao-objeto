package ExOOCarro;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();

        car.setCor("Amarelo");
        car.setModelo("Hibrido");
        car.setCapacidadeTanque(40);
        car.setPrecoGasolina(4.00);

        System.out.println("Para encher o tanque do carro o preço será: " + car.calcularGasolina() + " R$");
        System.out.println("O modelo do carro é: " + car.modelo + " cor: " + car.cor + " sua capacidade gasolina é de: " + car.capacidadeTanque + "L");

        Carro car2 = new Carro("Combustão", "Azul", 60);
        System.out.println("O modelo do carro é: " + car2.modelo + " cor: " + car2.cor + " sua capacidade gasolina é de: " + car2.capacidadeTanque + "L");


    }
}
