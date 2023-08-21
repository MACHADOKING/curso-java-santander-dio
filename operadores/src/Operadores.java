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
        int a, b;
        a = 5;
        b = 6;
        // String resultado = "";
        // if(a==b)
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";
        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
            System.out.println("numeroUm é igual a numeroDois?" + simNao);
        simNao = numero1 != numero2;
            System.out.println("numeroUm é igual a numeroDois?" + simNao);
        simNao = numero1 > numero2;
            System.out.println("numeroUm é igual a numeroDois?" + simNao);
        simNao = numero1 < numero2;
            System.out.println("numeroUm é igual a numeroDois?" + simNao);
        simNao = numero1 <= numero2;
            System.out.println("numeroUm é igual a numeroDois?" + simNao);
        simNao = numero1 >= numero2;
            System.out.println("numeroUm é igual a numeroDois?" + simNao);
        if(numero1 < numero2)
            System.out.println("a nossa condição é verdadeira!");
        else if(numero1 == numero2)
            System.out.println("a nossa condição é falsa!");
        else
            System.out.println("a nossa condição é falsa!");
        String nomeUm = "Machado";
        String nomeDois = new String("Machado");
            System.out.println(nomeUm.equals(nomeDois));
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)) {
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 && condicao2) {
            System.out.println("as duas condicoes são verdadeiras");
        } else if(condicao1 || condicao2) {
            System.out.println("uma das duas condições é verdadeira");
        } else {
            System.out.println("as duas condições são falsas");
        }
    }
}
