package Aula280426A;

public class Bibliotecario extends Participante {
    private String setorResponsavel;

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }

    public Bibliotecario(String nome, String email, String setorResponsavel) {
        super(nome, email);
        this.setorResponsavel = setorResponsavel;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.printf(" | Setor Responsável: %s \n", setorResponsavel);
    }

}
