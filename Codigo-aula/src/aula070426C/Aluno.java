package aula070426C;

public class Aluno extends Pessoa {
    protected int matricula;

    public Aluno(String nome, String cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
    }

}
