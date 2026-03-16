package ProjetosDeEstudo;

public class Desafionaruto {
    public static void main(String[] args) {
        // Esse foi um Desafio do Curso java10X aonde usa uma base de ninjas para o desafio
        String nomeninja1 = "Naruto";
        int idade1 = 17;
        double altura1 = 1.62;
        String missao1 = "Salvar o sasuke";
        String rank1 = "S";

        String nomeninja3 = "Minato";
        int idade3 = 42;
        double altura3 = 1.82;
        String missao3 = "Selar a kurama";
        String rank3 = "S";

        String nomeninja2 = "Konohamaru";
        int idade2 = 12;
        double altura2 = 1.40;
        String missao2 = "Passar na prova ninja";
        String rank2 = "D";
        // --- Ninja 1 (Naruto) ---
        System.out.println("Ninja: " + nomeninja1);
        System.out.println("Missão: "+ missao1);
        if (idade1 >= 17 && (rank1.equalsIgnoreCase("C") || rank1.equalsIgnoreCase("D") || rank1.equalsIgnoreCase("A"))) {
            System.out.println("Status: Você concluiu a sua missão!");
        } else {
            System.out.println("Status: Você Falhou!");
        }

        System.out.println("-------------------");

// --- Ninja 2 (Minato) ---
        System.out.println("Ninja: " + nomeninja3);
        System.out.println("Missão: "+ missao3);
        if (idade3 < 15) {
            if (rank3.equalsIgnoreCase("C") || rank3.equalsIgnoreCase("D")) {
                System.out.println("Status: Você falhou!");
            }
        } else {
            System.out.println("Status: Você concluiu a sua missão!");
        }

        System.out.println("-------------------");

// --- Ninja 3 (Konohamaru) ---
        System.out.println("Ninja: " + nomeninja2);
        System.out.println("Missão: "+ missao2);
        if (idade2 > 18) {
            if (rank2.equalsIgnoreCase("C") || rank2.equalsIgnoreCase("D") || rank2.equalsIgnoreCase("A")) {
                System.out.println("Status: Você falhou!");
            }
        } else {
            System.out.println("Status: Você concluiu a sua missão!");
        }
    }
}
