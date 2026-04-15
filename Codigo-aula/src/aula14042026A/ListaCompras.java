package aula14042026A;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();

        Scanner ler = new Scanner(System.in);
        String item;
        System.out.println("Digite os produtos (ou 'fim' para encerrar):");

        while(true){
            item = ler.nextLine();
            if(item.equalsIgnoreCase("fim")) break;
            produtos.add(item);
        }

        System.out.println("\nSua lista contem " + produtos.size() + " itens.");
        for(String produto : produtos) {
            System.out.println(" - " + produto);
        }
    }
}
