package Stratege.EstrategiaPagamentos;

public class Pix implements EstrategiaPagamentos{
    public double pagar(double valor) {
        return valor * 0.95;
    }
}
