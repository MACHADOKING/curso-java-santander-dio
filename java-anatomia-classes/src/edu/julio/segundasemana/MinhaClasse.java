package edu.julio.segundasemana;
public class MinhaClasse {
    public static void main (String [] args) {
        System.out.print( "Olá Mundo!!" );

        // Variaveis
        int ano = 2023;
        ano = 2024;
        final String BR = "Brasil";

        // BR = "Brazil" (colocar final na variavel em JAVA, funciona igual const para JAVASCRIPT.)

        String meuNome = "Júlio";
        int anoFabricacao = 2022;
        boolean verdadeira = true;
        anoFabricacao = 2018;

        // Métodos
        String primeiroNome = "Julio";
        String segundoNome = "Machado";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    // Métodos
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
