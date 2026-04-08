package aula070426C;

public class Professor extends Pessoa {
    protected String area;

    public Professor(String nome, String cpf, int matricula, String area) {
        super(nome, cpf);
        this.area = area;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Area: " + area);
    }


}
