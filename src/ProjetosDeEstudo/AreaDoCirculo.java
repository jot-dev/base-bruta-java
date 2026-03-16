package ProjetosDeEstudo;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double π = 3.14159;
        System.out.println("Digite o raio para calcular a area do circulo: ");
        double raio = input.nextDouble();
        double Area = π * (raio * raio);
        String valorFormatado = String.format("%.2f", Area);
        System.out.println("A= "+ valorFormatado);
        input.close();
    }
}
