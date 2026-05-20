package TrabalhoGA.Externo;

public class TesteBiblioiteca {
    public static void main(String[] args) {
        Bibliotecario b = new Bibliotecario("Igor Simoes", "igor@email.com", "bibliotecario", "1234");

        System.out.println("Nome: " + b.nome);


        /*
            Acessar email (protected) ❌
            System.out.println("Email: " + b.email);

                ERRO:
                    java: email has protected access in TrabalhoGA.Biblioteca.Usuario

                    O atributo email foi declarado com modificador protected.
                    Isso significa que ele pode ser acessado:
                        - por classes do MESMO pacote;
                        - ou por subclasses (herança).

                    Neste caso, a classe atual não está no mesmo pacote
                    e também não herda diretamente de Usuário.
                    Por isso, o acesso direto ao atributo não é permitido.
        */


        /*
            Acessar tipoUsuario (default) ❌
            System.out.println("Tipo: " + b.tipoUsuario);

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
            Acessar senha (private) ❌
            System.out.println("Senha: " + b.senha);

                ERRO:
                    java: senha has private access in TrabalhoGA.Biblioteca.Usuario

                    O atributo senha foi declarado como private na classe Usuário dentro do pacote Biblioteca.

                    A visibilidade private restringe o acesso apenas
                    à própria classe onde o atributo foi criado.

                    Nem subclasses, nem classes do mesmo pacote,
                    nem objetos externos podem acessar diretamente
                    esse atributo.

                    O acesso só pode ser realizado através dos métodos
                    públicos controlados, como getSenha(), caso existam.
        */

        // Usar getter isAcessoLiberado() ✅
        System.out.println("Acesso permitido? " + b.isAcessoLiberado());

        // Testar métodos públicos
        b.autenticar("1234");
        b.exibirMensagemBoasVindas();
        b.exibirStatusAcesso();

    }
}
