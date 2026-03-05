package Condicoes;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um Numero: ");
        int contador = input.nextInt();
        System.out.println("Escolha outro Numero: ");

        while (contador < 5) {
            contador = input.nextInt();
            System.out.println("Escolha outro Numero: ");
        }
        System.out.println("Voce passou dos limites do contador");

    }
}
