package TrabalhoGA.Biblioteca;

public class Usuario {
    public String nome;
    protected String email;
    String tipoUsuario;
    private String senha;
    private boolean acessoLiberado;

    public Usuario(String nome, String email, String tipoUsuario, String senha) {
        this.nome = nome;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.senha = senha;
        this.acessoLiberado = false;
    }

    public boolean isAcessoLiberado() {
        return acessoLiberado;
    }

    public boolean autenticar(String tentativaDeSenha) {
        if(this.senha.equals(tentativaDeSenha)) {
            acessoLiberado = true;
        } else {
            acessoLiberado = false;
        }
        registrarTentativa();
        return acessoLiberado;
    }

    public void registrarTentativa() {
        System.out.println("Tentativa de acesso registrada.");
    }

    public void exibirMensagemBoasVindas() {
        registrarTentativa();
        System.out.println("Mensagem de boas-vindas exibida.");
    }

}
