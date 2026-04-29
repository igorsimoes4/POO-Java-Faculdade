package aula14042026B;

import java.util.ArrayList;
import java.util.Scanner;

public class GestaoFrota {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> frota = new ArrayList<>();

        int opcao = 0;

        do {
            System.out.println("\n--- Gestão de Frota ---");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Listar Frota");
            System.out.println("4. Sair");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Modelo: ");
                    String modeloCarro = sc.nextLine();
                    System.out.print("Placa: ");
                    String placaCarro = sc.nextLine();
                    System.out.print("Marca: ");
                    String marcaCarro = sc.nextLine();
                    System.out.print("Valor Diária: ");
                    double valorDiariaCarro = sc.nextDouble();
                    System.out.print("Número de Portas: ");
                    int numPortas = sc.nextInt();
                    frota.add(new Carro(modeloCarro, placaCarro, marcaCarro, valorDiariaCarro, numPortas));
                    System.out.println("Carro cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.print("Modelo: ");
                    String modeloMoto = sc.nextLine();
                    System.out.print("Placa: ");
                    String placaMoto = sc.nextLine();
                    System.out.print("Marca: ");
                    String marcaMoto = sc.nextLine();
                    System.out.print("Valor Diária: ");
                    double valorDiariaMoto = sc.nextDouble();
                    System.out.print("Cilindradas: ");
                    int cilindradas = sc.nextInt();
                    frota.add(new Moto(modeloMoto, placaMoto, marcaMoto, valorDiariaMoto, cilindradas));
                    System.out.println("Moto cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("\n--- Listar Frota Cadastrada ---");
                    for (Veiculo v : frota) {
                        v.exibirDados();
                        System.out.println("-------------------");
                    }
                    break;
                case 4:
                    System.out.print("Saindo..... ");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
        sc.close();
    }
}
