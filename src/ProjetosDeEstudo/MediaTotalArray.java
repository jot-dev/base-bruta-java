package ProjetosDeEstudo;

import java.util.Locale;
import java.util.Scanner;

public class MediaTotalArray {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            input.useLocale(Locale.US);
            System.out.println("Bem vindo ao sistema de Alunos da Escola JotparaBaixinhos!");
            System.out.println("Esse sistema vai calcular a sua media geral da turma no ano!");
            System.out.println("------------------------------------------------------------");
            System.out.println("Digite o numero de alunos: ");
            int numeroDeAlunos = input.nextInt();
            double[] medias = new double[numeroDeAlunos];
            int qtdDeAprovados = 0;
            int qtdDeReprovados = 0;
            int qtdDeRecuperacao = 0;
            String[] alunos = new String[numeroDeAlunos];
            int indiceMelhor = 0;
            int indiceMenor = 0;
            double somaDasMedias = 0;
            double melhorMedia = 0;
            double menorMedia = 10;
            double[] notas = new double[4];
            for (int i = 0; i < numeroDeAlunos ; i++) {
                System.out.println("Digite Seu nome!");
                input.nextLine();
                alunos[i] = input.nextLine();
                double somaDasNotas = 0;
                for (int j = 0; j < notas.length; j++) {
                    System.out.println("Digite a sua nota do "+ (j+1)+" semestre!");
                    notas[j]= input.nextDouble();
                     somaDasNotas += notas[j];
                }
                double media = somaDasNotas / 4;
                medias[i] = media;
                System.out.println("------------------------------------------");
                System.out.println("Nome do aluno: " + alunos[i]);
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
                    indiceMelhor = i;
                }
                if (media < menorMedia) {
                    menorMedia = media;
                    indiceMenor = i;
                }
                System.out.println("------------------------------------------");
                somaDasMedias += media;
            }
            double mediaGeral = somaDasMedias / numeroDeAlunos;
            System.out.println("A quantidade de Aprovados da turma foi: "+ qtdDeAprovados);
            System.out.println("A quantidade em Recuperação da turma foi: "+ qtdDeRecuperacao);
            System.out.println("A quantidade de Reprovados da turma foi: "+ qtdDeReprovados);
            System.out.println("A Media geral da turma foi: "+ mediaGeral);
            System.out.println("A Melhor media da turma foi do aluno: "+ alunos[indiceMelhor]+"-"+ melhorMedia);
            System.out.println("A Pior media da turma foi do aluno: "+ alunos[indiceMenor]+"-"+ menorMedia);
            System.out.println("Essa é a media de todos os alunos: ");
            for (int i = 0; i < medias.length; i++) {
                System.out.println(alunos[i]+ " teve uma media de: " + medias[i]);
            }
            System.out.println("------------------------------------------");
        }
}
