package Condicoes;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] Nota = new int[4];
        int melhornota = 0;
        System.out.print("Aluno 1: ");
        Nota[0] = input.nextInt();
        System.out.print("Aluno 2: ");
        Nota[1] = input.nextInt();
        System.out.print("Aluno 3: ");
        Nota[2] = input.nextInt();
        System.out.print("Aluno 4: ");
        Nota[3] = input.nextInt();
        for (int i = 0; i < Nota.length; i++) {
            System.out.println("A nota do aluno "+i+1+" é: "+ Nota[i]);
            if (Nota[i] > melhornota){
                melhornota = Nota[i];
                System.out.println("A melhor nota da turma é: "+ melhornota);
            }
        }
    }
}
