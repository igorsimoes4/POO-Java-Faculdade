package TrabalhoGA.Externo;

import TrabalhoGA.Biblioteca.Usuario;

public class Bibliotecario extends Usuario {

    public Bibliotecario(String nome, String email, String tipoUsuario, String senha) {
        super(nome, email, tipoUsuario, senha);
    }

    public void exibirStatusAcesso() {
        // Pode acessar email (protected) ✅
        System.out.println("Email do bibliotecário: " + this.email);

        /*
            Pode acessar tipoUsuario (default)? ❌
            System.out.println("Tipo: " + this.tipoUsuario);
                ERRO:
                    java: tipoUsuario is not public in TrabalhoGA.Biblioteca.Usuario; cannot be accessed from outside package
                    O atributo tipoUsuario possui modificador de acesso default
                    (sem public, private ou protected).
                    Isso significa que ele só pode ser acessado por classes
                    que estejam no MESMO pacote.
                    Como esta classe está em outro pacote, o compilador
                    não permite o acesso direto ao atributo.
         */

        /*
            Tentar acessar senha diretamente ❌
            System.out.println("Senha: " + this.senha);
                ERRO:
                    java: senha has private access in TrabalhoGA.Biblioteca.Usuario
                    O atributo senha foi declarado como private na classe Usuario.
                    A visibilidade private restringe o acesso apenas à própria classe.
                    Nem as sub-classes nem as classes de outros pacotes podem acessar
                    esse atributo diretamente.
                    O acesso deve ser feito através dos métodos públicos.
         */

        /*
            Tentar acessar acessoLiberado diretamente ❌
            System.out.println("Acesso: " + this.acessoLiberado);
                ERRO:
                    java: acessoLiberado has private access in TrabalhoGA.Biblioteca.Usuario
                    O atributo acessoLiberado também possui modificador private.
                    Por isso, ele só pode ser utilizado dentro da própria classe Usuario.
                    Qualquer tentativa de acesso direto fora da classe gera erro de compilação.
                    O correto seria utilizar um método público, como: isAcessoLiberado().

         */

        // Pode chamar autenticar() da superclasse ✅
        boolean resultado = this.autenticar("1234");
        System.out.println("Autenticação realizada: " + resultado);

        // Pode usar getter isAcessoLiberado() ✅
        System.out.println("Acesso permitido? " + this.isAcessoLiberado());
    }

}
