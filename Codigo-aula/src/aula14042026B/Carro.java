package aula14042026B;

public class Carro extends Veiculo {
    protected int numPortas;

    public Carro(String modelo, String placa, String marca, double valorDiaria, int numPortas) {
        super(modelo, placa, marca, valorDiaria);
        this.numPortas = numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public double calcularAluguel(int dias) {
        double valor = super.calcularAluguel(dias);
        if (numPortas > 2) {
            return valor * 1.1;
        }
        return valor;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf(" | Número de Portas: %d\n", numPortas);
    }
}
