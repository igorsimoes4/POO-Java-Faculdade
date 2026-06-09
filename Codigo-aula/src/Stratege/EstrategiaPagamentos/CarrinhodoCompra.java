package Stratege.EstrategiaPagamentos;

public class CarrinhodoCompra {
    private EstrategiaPagamentos estrategiaPagamentos;

    public void setEstrategiaPagamentos(EstrategiaPagamentos estrategiaPagamentos) {
        this.estrategiaPagamentos = estrategiaPagamentos;
    }

    public double realizarPagamento(double valor) {
        return estrategiaPagamentos.pagar(valor);
    }
}
