package Condicoes;

import java.util.Scanner;

public class Scannerdousuario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva aqui o seu nome:");
        String SeuNome = input.nextLine();
        System.out.println("Seu nome é: "+ SeuNome);
        //Aqui vai estar a sua idade
        System.out.println("Escreva aqui sua idade: ");
        int Suaidade = input.nextInt();
        System.out.println("Sua idade é: "+ Suaidade);
        if (Suaidade >= 18) {
            System.out.println("Voçê pode cursar faculdade");}
            else {
                System.out.println("Voçê não pode cursar faculdade");

        }


        input.close();
    }
}
