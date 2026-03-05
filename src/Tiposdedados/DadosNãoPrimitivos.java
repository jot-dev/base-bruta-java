package Tiposdedados;

import com.sun.security.jgss.GSSUtil;

public class DadosNãoPrimitivos {
    public static void main(String[] args) {
        String nome = "Jot";
        String cidade = "São Fidelis";
        String nomeuppercase = nome.toUpperCase(); // Um dado não primitivo te permite altera-lo com um metodo
        System.out.println(nomeuppercase);
    }
}
