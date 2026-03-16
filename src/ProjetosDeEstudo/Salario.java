package ProjetosDeEstudo;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Digite o numero do funcionario: ");
        int Numerodofuncionario = input.nextInt();
        System.out.println("Digite quantas horas você trabalhou no mes: ");
        int horastrabalhadas = input.nextInt();
        System.out.println("Digite quanto você ganha por hora: ");
        int ganhaPorHora = input.nextInt();
        int Salario = horastrabalhadas * ganhaPorHora;
        double valorComDesconto = Salario * 0.8;
        double valorComAumento = Salario / 0.8;
        
        System.out.println("------------------------------------------");
        System.out.println("Seu numero é: "+ Numerodofuncionario);


        if (horastrabalhadas >= 220) {
            System.out.println("ProjetosDeEstudo.Salario bruto: "+ Salario);
            System.out.println("Voce recebeu um aumento de 20%!");
            System.out.println("ProjetosDeEstudo.Salario final: "+ valorComAumento);
        } else if (horastrabalhadas < 150) {
            System.out.println("ProjetosDeEstudo.Salario bruto: "+ Salario);
            System.out.println("Voce recebeu um desconto de 20%!");
            System.out.println("ProjetosDeEstudo.Salario final: "+ valorComDesconto);

        } else if (Salario > 1450) {
            System.out.println("Voce recebeu: "+ Salario);

        } else {
            System.out.println("Você recebeu o salario minimo: 1450");
        }
        System.out.println("------------------------------------------");

        input.close();

    }
}
