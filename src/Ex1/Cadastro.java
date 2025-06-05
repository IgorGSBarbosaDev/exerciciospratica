package Ex1;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cadastro {
    private Aluno[] alunos;
    private int contador;
    Scanner scan = new Scanner(System.in);

    public void cadastrarAluno(String nome, int idade, String curso, String CPF) {
        System.out.print("Insira seu nome completo: ");
        nome =scan.nextLine();
        System.out.print("Insira sua idade: ");
        idade =scan.nextInt();
        System.out.println("Digite o numero do curso desejado: ");
        System.out.println("1 - Engenharia de Software");
        System.out.println("2 - Engenharia de Manutenção e Suporte");
        System.out.println("3 - Engenharia Eletrônica");
        System.out.print("Digite o numero do curso desejado: ");
        curso = scan.nextLine();
        if (curso.equals("1")) {
            curso = "Engenharia de Software";
        } else if (curso.equals("2")) {
            curso = "Engenharia de Manutenção e Suporte";
        } else if (curso.equals("3")) {
            curso = "Engenharia Eletrônica";
        } else {
            System.out.println("Curso inválido. Tente novamente!");
        }

    }
}
