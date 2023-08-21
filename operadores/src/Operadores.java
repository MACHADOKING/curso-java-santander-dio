public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "Linguagem" + "JAVA";
            System.out.println(nomeCompleto);
        int numero = 5;
            System.out.println(- numero);
            System.out.println(numero);
        numero = - numero;
            System.out.println(numero);
        numero = numero * -1;
            System.out.println(numero);
        // x repetição
        numero = numero++;
            System.out.println(numero);
        // boolean
        boolean variavel = true;
            System.out.println(variavel);
            System.out.println(!variavel);
        variavel = !variavel;
            System.out.println(variavel);
    }
}
