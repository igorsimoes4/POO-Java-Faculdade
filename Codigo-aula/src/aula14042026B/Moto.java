package aula14042026B;

public class Moto extends Veiculo {
    protected int cilindradas;

    public Moto(String modelo, String placa, String marca, double valorDiaria, int cilindradas) {
        super(modelo, placa, marca, valorDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularAluguel(int dias){
        double valor = super.calcularAluguel(dias);
        if(cilindradas > 500){
            return valor * 1.15;
        }
        return valor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf(" | Cilindradas: %d cc\n", cilindradas);
    }
}
