package ProjetosDeEstudo;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        String querContinuar = "S";
        while (querContinuar.equalsIgnoreCase("S")) {
            System.out.println("Insira seu nome:");
            String Nome = input.nextLine();
            System.out.println("Insira sua idade:");
            int idade = (input.nextInt());
            input.nextLine();
            System.out.println("Insira seu peso:");
            double peso = (input.nextDouble());
            System.out.println("Insira sua altura:");
            double altura = input.nextDouble();
            input.nextLine();
            double Imc;
            Imc = peso / (altura * altura);
            String valorFormatado = String.format("%.2f", Imc);
            System.out.println("Seu nome é:" + Nome);
            System.out.println("Sua idade é:" + idade);
            System.out.println("Seu peso é:" + peso);
            System.out.println("Sua altura é:" + altura);
            System.out.println("Seu Imc é:" + valorFormatado);
            if (Imc <= 18.5) {
                System.out.println("Você está abaixo do peso");
            } else if (Imc <= 25) {
                System.out.println("Você está com o peso ideal");
            } else if (Imc <= 29.9) {
                System.out.println("Você está acima do peso");
            } else if (Imc <= 35) {
                System.out.println("Você tem obesidade nivel 1");
            } else if (Imc <= 39.9) {
                System.out.println("Você tem obesidade nivel 2");
            } else {
                System.out.println("Você tem obesidade nivel 3");
            }
            System.out.println("Você quer continuar a calcular? (S/N)");
            querContinuar = input.nextLine();
        }
        input.close();




    }
}
