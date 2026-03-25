package aula24032026D;

import java.util.Scanner;

public class Semana {
    private String nomePessoa;
    private int diaSemana;

    Semana(String nomePessoa, int diaSemana) {
        this.nomePessoa = nomePessoa;
        this.diaSemana = diaSemana;
    }

    void exibirMensagem() {
        String dia = "";
        switch (diaSemana) {
            case 1:
                dia = "Segunda-feira";
                System.out.println("Olá, " + nomePessoa + "!, tenha uma ótima " + dia + ".");
                break;
            case 2:
                dia = "Terça-feira";
                System.out.println("Olá, " + nomePessoa + "!, tenha uma ótima " + dia + ".");
                break;
            case 3:
                dia = "Quarta-feira";
                System.out.println("Olá, " + nomePessoa + "!, tenha uma ótima " + dia + ".");
                break;
            case 4:
                dia = "Quinta-feira";
                System.out.println("Olá, " + nomePessoa + "!, tenha uma ótima " + dia + ".");
                break;
            case 5:
                dia = "Sexta-feira";
                System.out.println("Olá, " + nomePessoa + "!, tenha uma ótima " + dia + ".");
                break;
            case 6:
                dia = "Sábado";
                System.out.println("Olá, " + nomePessoa + "!, tenha um ótimo " + dia + ".");
                break;
            case 7:
                dia = "Domingo";
                System.out.println("Olá, " + nomePessoa + "!, tenha um ótimo " + dia + ".");
                break;
            default:
                System.out.println("Escolha um número entre 1 e 7 para representar o dia da semana.");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nomePessoa = input.nextLine();

        System.out.println("Qual o dia da semana é hoje? (Digite o número correspondente)");

        System.out.println("1 - segunda-feira, 2 - terça-feira, 3 - quarta-feira, 4 - quinta-feira, 5 - sexta-feira, 6 - sábado, 7 - domingo");

        int diaSemana = input.nextInt();

        Semana semana = new Semana(nomePessoa, diaSemana);

        semana.exibirMensagem();
    }


}
