package aula070426B;

public class Matiz {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                matriz[l][c] = ((l+1)*10) + (c+1);
            }
        }
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                System.out.printf("%7d", matriz[l][c]);
                if (c == 3) {
                    System.out.println();
                }
            }
        }
    }
}
