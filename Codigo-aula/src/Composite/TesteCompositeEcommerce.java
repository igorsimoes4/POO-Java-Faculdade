package Composite;

public class TesteCompositeEcommerce {
    public static void main(String[] args) {
        ItemComercial celular = new ProdutoIndivisual("Iphone15", 5000.00);
        ItemComercial carregador = new ProdutoIndivisual("Carregador USB-C", 150.00);
        ItemComercial foneDeOuvido = new ProdutoIndivisual("AirPods", 1200.00);
        ItemComercial capaProtetora = new ProdutoIndivisual("Capa Protetora de Silicone", 80.00);
        ItemComercial celular2 = new ProdutoIndivisual("Samsung A12", 120.23);

        CaixaDeProdutos kitAcessorios = new CaixaDeProdutos("Kit Acessórios Apple");
        kitAcessorios.adicionarItem(carregador);
        kitAcessorios.adicionarItem(foneDeOuvido);
        kitAcessorios.adicionarItem(capaProtetora);
        kitAcessorios.adicionarItem(celular2);

        CaixaDeProdutos pedidoCliente = new CaixaDeProdutos("Pedido #9982 - Adamastor Silva");
        pedidoCliente.adicionarItem(celular);
        pedidoCliente.adicionarItem(celular2);
        pedidoCliente.adicionarItem(kitAcessorios);

        System.out.println("---- ESTRUTURA DO PEDIDO ----");
        pedidoCliente.exibirDetalhes("");

        System.out.println("\n-----------------------------");
        System.out.printf("Valor Total do Pedido: R$ %,.2f\n", pedidoCliente.calcularPreco());

    }
}
