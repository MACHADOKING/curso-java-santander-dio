package desafios;

import java.util.Scanner;

public class CalculandoCustos {
    public static void main(String[] args) {
        // Definindo as taxas
        double custoPorHoraServidor = 0.15;
        double custoPorHoraBancoDados = 0.05;

        // Criando um objeto Scanner para receber as entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Recebendo as informações do usuário
        System.out.println("Informe a quantidade de servidores necessários:");
        int quantidadeServidores = scanner.nextInt();

        System.out.println("Informe a quantidade de bancos de dados necessários:");
        int quantidadeBancosDados = scanner.nextInt();

        // Calculando os custos
        double custoTotalServidores = calcularCustoTotal(custoPorHoraServidor, quantidadeServidores);
        double custoTotalBancoDados = calcularCustoTotal(custoPorHoraBancoDados, quantidadeBancosDados);
        double custoTotal = custoTotalServidores + custoTotalBancoDados;

        System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

        // Fechando o Scanner
        scanner.close();
    }

    public static double calcularCustoTotal(double custoPorHora, int quantidade) {
        return custoPorHora * quantidade;
    }
}
