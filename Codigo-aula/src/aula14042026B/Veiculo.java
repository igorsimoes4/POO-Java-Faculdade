package aula14042026B;

public class Veiculo {
    protected String modelo;
    protected String placa;
    protected String marca;
    protected double valorDiaria;

    public Veiculo(String modelo, String placa, String marca, double valorDiaria) {
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double calcularAluguel(int dias){
        return this.valorDiaria * dias;
    }

    public void exibirDados() {
        System.out.printf("Placa: %s | Modelo: %s | Marca: %s | Aluguel: R$ %.2f", placa, modelo, marca, calcularAluguel(5));
    }
}
