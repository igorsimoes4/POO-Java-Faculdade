package aula24032026C;

public class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    void verificarMaiorIdade(){
        if (idade >= 18){
            System.out.printf("Pessoa: %s | Idade: %d anos | Status: Maior de idade \n", nome, idade);
        } else {
            System.out.printf("Pessoa: %s | Idade: %d anos | Status: Menor de idade \n", nome, idade);
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Igor", 20);
        Pessoa pessoa2 = new Pessoa("Maria", 10);
        pessoa1.verificarMaiorIdade();
        pessoa2.verificarMaiorIdade();
    }
}
