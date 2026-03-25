package aula24032026B;

public class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    Aluno (String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularMedia(double nota1, double nota2, double nota3) {
        double media;
        return media = (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Igor", 7.5, 8.0, 9.0);
        System.out.printf("Aluno: %s | Nota 1: %.1f | Nota 2: %.1f | Nota 3: %.1f | Média Final: %.1f \n", aluno.nome, aluno.nota1, aluno.nota2, aluno.nota3, aluno.calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3));
    }
}
