package Aula280426A;

import java.util.ArrayList;

public class Biblioteca {
    public static void main(String[] args) {

        Leitor l1 = new Leitor("Igor", "igor@email.com", 20);
        Bibliotecario b1 = new Bibliotecario("Zezinho dos anzois", "zezinho@email.com", "Livros de Pesca");

        Participante l2 = new Leitor("João", "joao@email.com", 5);
        Participante b2 = new Bibliotecario("Maria", "maria@email.com", "Bibliotecaria");

        l1.setQuantidadeLivrosLidos(15);
        ((Leitor) l2).setQuantidadeLivrosLidos(30);

        ArrayList<Participante> listaParticipantes = new ArrayList<>();
        listaParticipantes.add(l1);
        listaParticipantes.add(b1);

        listaParticipantes.add(b2);
        listaParticipantes.add(l2);

        System.out.println("=== Sistema de Gestão da Biblioteca ===");

        for(Participante p : listaParticipantes){
            p.exibirInformacoes();
            System.out.println("------------------------------------------------------------");
        }
    }
}
