package aula24032026A;

public class Produto {
    private String nome;
    private double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void calculaDesconto(double percentualDesconto) {
        double Desconto = this.preco * (percentualDesconto / (double)100.0F);
        double novoPreco = this.preco - Desconto;
        System.out.printf("Produto: %s | Preço Original: R$ %.2f | Novo Preço: %.2f", this.nome, this.preco, novoPreco);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Produto A", (double)6500.0F);
        produto.calculaDesconto((double)10.0F);
    }
}
