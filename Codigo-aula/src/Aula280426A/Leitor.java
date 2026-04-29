package Aula280426A;

public class Leitor extends Participante {
    private int quantidadeLivrosLidos;

    public int getQuantidadeLivrosLidos() {
        return quantidadeLivrosLidos;
    }

    public void setQuantidadeLivrosLidos(int quantidadeLivrosLidos) {
        this.quantidadeLivrosLidos = quantidadeLivrosLidos;
    }

    public Leitor(String nome, String email, int quantidadeLivrosLidos) {
        super(nome, email);
        this.quantidadeLivrosLidos = quantidadeLivrosLidos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf(" | Quantidade de Livros lidas: %d \n", quantidadeLivrosLidos);
    }

}
