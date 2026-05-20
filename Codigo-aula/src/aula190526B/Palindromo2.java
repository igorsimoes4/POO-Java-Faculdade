package aula190526B;

import java.util.Scanner;

public class Palindromo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String frase = input.nextLine();

        String fraseLimpa = frase.toLowerCase().replace(".", "").replace(",", "").replace(" ", "");

        String fraseInvertida = new StringBuilder(fraseLimpa).reverse().toString();

        if(fraseLimpa.equals(fraseInvertida)){
            System.out.println("A frase é um palíndromo");
        } else {
            System.out.println("A frase não é um palíndromo");
        }
        input.close();
    }
}
