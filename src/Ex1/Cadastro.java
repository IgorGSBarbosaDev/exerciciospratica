package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    ArrayList<Aluno> alunos = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void cadastrarAluno() {

        Aluno aluno = new Aluno();

        System.out.print("Insira seu nome completo: ");
        aluno.setNome(scan.nextLine());
        System.out.print("Insira sua idade: ");
        aluno.setIdade(scan.nextInt());
        scan.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite seu CPF(apenas número): ");
        aluno.setCPF(scan.nextLine());

        System.out.println("Digite o numero do curso desejado: ");
        System.out.println("1 - Engenharia de Software");
        System.out.println("2 - Engenharia de Manutenção e Suporte");
        System.out.println("3 - Engenharia Eletrônica");
        System.out.print("Digite o numero do curso desejado: ");
        aluno.setCurso(scan.nextLine());
        if (aluno.getCurso().equals("1")) {
            aluno.setCurso("Engenharia de Software");
        } else if (aluno.getCurso().equals("2")) {
            aluno.setCurso("Engenharia de Manutenção e Suporte");
        } else if (aluno.getCurso().equals("3")) {
            aluno.setCurso("Engenharia Eletrônica");
        } else {
            System.out.println("Curso inválido. Tente novamente!");
        }
        alunos.add(aluno);
        System.out.println("Aluno cadastrado!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("Lista de alunos cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("CPF: " + aluno.getCPF());
            System.out.println("-----------------------------");
        }
    }

    public void excluirAluno(){
        System.out.println("Digite o CPF do aluno que deseja excluir: ");
        String cpfExclusao = scan.nextLine();
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCPF().equals(cpfExclusao)){
                alunos.remove(i);
                System.out.println("Aluno excluído com sucesso!");
                return;
            }
        }
    }
}
