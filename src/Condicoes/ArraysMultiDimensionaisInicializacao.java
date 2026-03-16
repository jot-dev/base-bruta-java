package Condicoes;

public class ArraysMultiDimensionaisInicializacao {
    public static void main(String[] args) {

        String [][] programas = new String[2][];
        programas[0] = new String[2];
        programas[1] = new String[1];
        programas[0][0] = "Netflix";
        programas[0][1] = "Primevideo";
        programas[1][0] = "Nubank";

        System.out.println("Você assina esses streamings e tem conta nesses bancos: ");

        for ( String[] arrbase: programas){
            for (String num: arrbase){
                System.out.print(num+ " ");
            }
        }
    }
}
