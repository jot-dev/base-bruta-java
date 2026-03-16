package ProjetosDeEstudo;

import java.util.Locale;
import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Bem vindo ao sistema de Alunos da Escola JotparaBaixinhos!");
        System.out.println("Esse sistema vai calcular a sua media geral do aluno no ano!");
        System.out.println("------------------------------------------------------------");
        System.out.println("Digite Seu nome!");
        String Nome = input.nextLine();
        System.out.println("Digite a sua nota do 1 semestre!");
        double nota1Semestre = input.nextDouble();
        System.out.println("Digite a sua nota do 2 semestre!");
        double nota2Semestre = input.nextDouble();
        System.out.println("Digite a sua nota do 3 semestre!");
        double nota3Semestre = input.nextDouble();
        System.out.println("Digite a sua nota do 4 semestre!");
        double nota4Semestre = input.nextDouble();
        System.out.println("Calculando sua media!");
        double media = (nota1Semestre + nota2Semestre + nota3Semestre + nota4Semestre)/ 4;
        System.out.println("------------------------------------------");
        System.out.println("Nome do aluno: "+ Nome);
        System.out.println("Media: "+ media);
    if (media >= 7.0){
            System.out.println("Status: Aprovado!");
        } else if (media < 7 && media >= 5) {
        System.out.println("Status: Recuperação!");
    }
    else {
        System.out.println("Status: Reprovado!");
    }
        System.out.println("------------------------------------------");
    }
}
