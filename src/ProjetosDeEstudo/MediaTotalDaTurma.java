package ProjetosDeEstudo;

import java.util.Locale;
import java.util.Scanner;

public class MediaTotalDaTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Bem vindo ao sistema de Alunos da Escola JotparaBaixinhos!");
        System.out.println("Esse sistema vai calcular a sua media geral da turma no ano!");
        System.out.println("------------------------------------------------------------");
        System.out.println("Digite o numero de alunos: ");
        int numeroDeAlunos = input.nextInt();
        int contador = 0;
        int qtdDeAprovados = 0;
        int qtdDeReprovados = 0;
        int qtdDeRecuperacao = 0;
        double somaDasMedias = 0;
        double mediaDaTurma = 0;
        double melhorMedia = 0;
        while (numeroDeAlunos >= contador) {

            System.out.println("Digite Seu nome!");
            String fantasma = input.nextLine();
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
            double media = (nota1Semestre + nota2Semestre + nota3Semestre + nota4Semestre) / 4;
            System.out.println("------------------------------------------");
            System.out.println("Nome do aluno: " + Nome);
            System.out.println("Media: " + media);
            if (media >= 7.0) {
                System.out.println("Status: Aprovado!");
                qtdDeAprovados ++;
            } else if (media < 7 && media >= 5) {
                System.out.println("Status: Recuperação!");
                qtdDeRecuperacao ++;
            } else {
                System.out.println("Status: Reprovado!");
                qtdDeReprovados ++;
            }
            if (media > melhorMedia) {
                melhorMedia = media;
            }
            System.out.println("------------------------------------------");
            contador ++;
            somaDasMedias += media;
        }
        double mediaGeral = somaDasMedias / numeroDeAlunos;
        System.out.println("A quantidade de Aprovados da turma foi: "+ qtdDeAprovados);
        System.out.println("A quantidade em Recuperação da turma foi: "+ qtdDeRecuperacao);
        System.out.println("A quantidade de Reprovados da turma foi: "+ qtdDeAprovados);
        System.out.println("A Media geral da turma foi: "+ mediaGeral);
        System.out.println("A Melhor media da turma foi: "+ melhorMedia);
        System.out.println("------------------------------------------");
    }
}

