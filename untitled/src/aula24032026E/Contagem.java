package aula24032026E;

import java.util.Scanner;

public class Contagem {
   private int numero;

   Contagem(int numero){
       this.numero = numero;
   }

   public static void main(String[] args){
       System.out.println("Informe o numero inteiro final da contagem: ");
       Scanner ler = new Scanner(System.in);
       int numero = ler.nextInt();

       for (int i = 1; i <= numero; i++){
           System.out.println("Contagem: ");
           System.out.println(i);
       }
   }
}
