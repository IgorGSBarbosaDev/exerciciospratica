package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de cadastro de alunos!");
        System.out.println("Para realizar o cadastro, por favor responda corretamente os dados necessarios.");

        Menu menu = new Menu();
        Scanner scan = new Scanner(System.in);

        menu.exibirMenu();

    }
}
