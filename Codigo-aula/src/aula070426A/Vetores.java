package aula070426A;

import java.util.Scanner;

public class Vetores {
    // int[] numeros = new int[5]; // Declaração e criação de um vetor de inteiros com 5 posições
    // numeros[0] = 10; // Atribuição de valor à posição 0 do vetor

    public static void main(String[] args) {
      int[] numeros = new int[5];
      int soma = 0;
      Scanner ler = new Scanner(System.in);

      for (int i = 0; i < numeros.length; i++) {
          System.out.println("Digite um número inteiro: " + (i + 1));
          numeros[i] = ler.nextInt();
      }

      String texto;

      for (int item : numeros) {
          soma += item;
          if(soma > 10){
              System.out.println("Parcial = " + soma);
          }
          texto = (soma > 20) ? "Acima de 15 " : "";
          System.out.print(texto);
      }
      System.out.print("O resultado da soma é: " + soma);
    }
}
