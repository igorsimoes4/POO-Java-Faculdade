package Livraria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LIvroDAO dao = new LIvroDAO();

        System.out.println("Cadastrar de Livros");
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Ano: ");
        int ano = sc.nextInt();

        Livro livro = new Livro(titulo, autor, ano);
        dao.inserir(livro);

        System.out.println("\nLivros cadastrados");
        for(Livro l : dao.listartodos()) {
            System.out.printf("%d - %s (%s, %d)\n", l.getId(), l.getTitulo(), l.getAutor(), l.getAno());
        }

    }
}
