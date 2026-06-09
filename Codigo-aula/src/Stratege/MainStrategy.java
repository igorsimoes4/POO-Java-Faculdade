package Stratege;

public class MainStrategy {
    public static void main(String[] args) {
        Pedido meupedido = new Pedido();
        double pesoEncomenda = 10.0;

        meupedido.setEstrategiadeFrete(new FreteSedex());
        double valorSedex = meupedido.calcularTotalFrete(pesoEncomenda);
        System.out.println("Valor do frete via Sedex: R$ " + valorSedex);

        meupedido.setEstrategiadeFrete(new FreteNormal());
        double valorNormal = meupedido.calcularTotalFrete(pesoEncomenda);
        System.out.println("Valor do frete via Normal: R$ " + valorNormal);
    }
}
