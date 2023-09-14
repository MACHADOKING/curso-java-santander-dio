package desafios;

import java.util.Scanner;

public class RegrasEKS {
    public static void main(String[] args) {
        // Definindo as regras básicas
        int podsPorNode = 10;
        int podsPorServidor = 4;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        System.out.println("Digite o número total de pods do aplicativo:");
        int numeroTotalPods = scanner.nextInt();

        // Calculando o número mínimo de nodes necessários
        int numeroMinimoNodes = (int) Math.ceil((double) numeroTotalPods / podsPorNode);

        // Calculando o número mínimo de servidores necessários
        int numeroMinimoServidores = (int) Math.ceil((double) numeroTotalPods / podsPorServidor);

        // Exibindo o resultado com as recomendações de quantidades de servidores e
        // nodes.
        System.out.println("Numero minimo de nodes:" + numeroMinimoNodes);
        System.out.println("Numero minimo de servidores:" + numeroMinimoServidores);

        // Verificando as recomendações
        if (numeroMinimoNodes <= 1) {
            System.out.println("Recomendamos usar um unico node");
        }
        if (numeroMinimoServidores <= 1) {
            System.out.println("Recomendamos usar um unico servidor.");
        }

        // Fechando o Scanner
        scanner.close();
    }
}
