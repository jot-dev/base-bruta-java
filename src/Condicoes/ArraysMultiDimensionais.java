package Condicoes;

public class ArraysMultiDimensionais {
    public static void main(String[] args) {
        //Arrays multi dimensionais são arrays porem que guardam outros arrays
        String [][] programas = new String[2][3];
        programas[0][0] = "Netflix";
        programas[0][1] = "Prime Video";
        programas[0][2] = "Disney+";
        programas[1][0] = "Nubank";
        programas[1][1] = "Itaú";
        programas[1][2] = "banco master";
        System.out.println("Você assina esses streamings e tem conta nesses bancos: ");

        for ( String[] arrbase: programas){
            for (String num: arrbase){
                System.out.println(num);
            }
        }



    }
}
