package Observer;

public class TesteObserverEcommerce {
    public static void main(String[] args) {
        PedidoEcommerce pedido = new PedidoEcommerce("BR-12345");
        ObservadorStatus servicoEmail = new ServicoEmail();
        ObservadorStatus servicoPush = new ServicoNotificacaoPush();
        ObservadorStatus servicoLog = new ServicoLogAuditoria();

        pedido.adicionarObservador(servicoEmail);
        pedido.adicionarObservador(servicoPush);
        pedido.adicionarObservador(servicoLog);

        pedido.setStatus("Pagamento Aprovado.");

        try {
            Thread.sleep(5000); // Simula um tempo de processamento
        } catch (Exception e) {}

        pedido.setStatus("Em Transporte");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

        pedido.setStatus("Entrega ao Destinatário");
    }
}
