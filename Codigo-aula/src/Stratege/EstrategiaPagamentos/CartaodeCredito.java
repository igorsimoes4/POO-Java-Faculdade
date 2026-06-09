package Stratege.EstrategiaPagamentos;

public class CartaodeCredito implements EstrategiaPagamentos{
    public double pagar(double valor) {
        return valor * 1.5;
    }
}
