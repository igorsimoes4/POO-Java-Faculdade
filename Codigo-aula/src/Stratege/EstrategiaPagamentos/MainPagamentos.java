package Stratege.EstrategiaPagamentos;

public class MainPagamentos {
    public static void main(String[] args) {
        CarrinhodoCompra carrinhodoCompra = new CarrinhodoCompra();

        carrinhodoCompra.setEstrategiaPagamentos(new Pix());
        double valorPix = carrinhodoCompra.realizarPagamento(100.0);
        System.out.println("Valor pago via Pix: R$ " + valorPix);

        carrinhodoCompra.setEstrategiaPagamentos(new CartaodeCredito());
        double valorCartao = carrinhodoCompra.realizarPagamento(100.0);
        System.out.println("Valor pago via Cartão de Crédito: R$ " + valorCartao);
    }
}
