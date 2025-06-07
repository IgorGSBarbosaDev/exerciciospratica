package Ex1;

import java.util.Scanner;

public class Menu {
    private int opcao;
    Cadastro cadastro = new Cadastro();
    Scanner scan = new Scanner(System.in);

    public void exibirMenu(){
        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Excluir Aluno");
            System.out.println("4 - Sair");
            System.out.println("Digite  número da opcao desejada: ");
            opcao = scan.nextInt();
            switch(opcao){
                case 1:
                    cadastro.cadastrarAluno();
                    break;
                case 2:
                    cadastro.listarAlunos();
                    break;
                case 3:
                    cadastro.excluirAluno();
                    break;
                case 4:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Erro!");
            }
        } while (opcao != 4);
    }
}
