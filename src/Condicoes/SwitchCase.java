package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha analise um programador backend para a sua escolha:");
        System.out.println("1 - Carlos");
        System.out.println("2 - Mariana");
        System.out.println("3 - Roberto");

        int EscolhaDoUsuario = input.nextInt();
        System.out.println("Você digitou o numero:"+ EscolhaDoUsuario);

        switch (EscolhaDoUsuario) {
            case 1:
                System.out.println("Nome:Carlos | Linguagem: Java | Cargo: Desenvolvedor Backend Pleno");
                break;
            case 2:
                System.out.println("Nome:Mariana | Linguagem: C# | Cargo: Arquiteta de Software");
                break;
            case 3:
                System.out.println("Nome:Roberto | Linguagem: Go (Golang) | Cargo: Engenheiro Backend Sênior");
                break;
            default:
                System.out.println("Você não digitou uma resposta valida, tente novamente!");
        }

        input.close();
    }
}
