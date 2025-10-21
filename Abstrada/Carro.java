package Abstrada;

public class Carro {
    private int capacidade;
    private int qrRodas;
    private String placa;

    public Carro(int capacidade, int qrRodas, String placa) {
        this.capacidade = capacidade;
        this.qrRodas = qrRodas;
        this.placa = placa;
    }

    public void moverFrente(){
        System.out.println("O carro está se movendo para frente."); 
    }

    @Override
    public String toString() {
        return "Carro [capacidade=" + capacidade + ", qrRodas=" + qrRodas + ", placa=" + placa + "]";
    }

    
    
}
