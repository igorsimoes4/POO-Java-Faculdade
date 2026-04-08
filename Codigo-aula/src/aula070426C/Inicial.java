package aula070426C;
import aula070426C.Heranca;
public class Inicial {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", "987.654.321-00", 2023001);

        Professor professor1 = new Professor("Dr. Silva", "111.222.333-44", 2023002, "Matemática");

        Aluno aluno2 = new Aluno("João", "123.456.789-00", 2023003);

        Professor professor2 = new Professor("Dra. Souza", "555.666.777-88", 2023004, "Física");


        System.out.println("Dados do Professor:");
        professor1.exibirDados();
        System.out.println("Dados do Professor:");
        professor2.exibirDados();

        System.out.println("Dados do Aluno:");
        aluno1.exibirDados();
        System.out.println("Dados do Aluno:");
        aluno2.exibirDados();


    }
}
