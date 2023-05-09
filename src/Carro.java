public class Carro {

    String cor;
    String modelo;
    double capacidadeTanque;
    double precoGasolina;

    public Carro(){    }

    public Carro(String modelo, String cor, double capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    void setCapacidadeTanque(double x){
        this.capacidadeTanque = x;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    void setPrecoGasolina(double y){
        this.precoGasolina = y;
    }

    public double calcularGasolina() {
        return (precoGasolina * capacidadeTanque);
    }



}
