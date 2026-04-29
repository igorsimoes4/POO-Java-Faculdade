package Aula280426A;

public class Participante {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Participante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s | Email: %s", nome, email);
    }


}
