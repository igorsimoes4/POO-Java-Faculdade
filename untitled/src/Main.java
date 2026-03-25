import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Teste");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Igor");
        pessoa.setSobrenome("Silva");
        pessoa.setIdade(23);
        pessoa.setCategoria("Aluno");
        pessoa.setDataNascimento("01/01/2000");
        pessoa.setEndereco("Rua A");
        pessoa.setEmail("igor@email.com");
        pessoa.setGenero("Masculino");
        pessoa.setTelefone("99999-9999");

        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Categoria: " + pessoa.getCategoria());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Genero: " + pessoa.getGenero());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }


}

