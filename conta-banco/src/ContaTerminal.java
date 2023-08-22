import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAgencia;

        do {
            System.out.println("Por favor, digite o número da conta (4 dígitos):");
            numeroAgencia = scanner.nextInt();
        } while (String.valueOf(numeroAgencia).length() != 4);

        scanner.nextLine();

        String agencia;

        do {
            System.out.println("Por favor, digite o número da agência (somente números e um hífen no formato XXX-X):");
            agencia = scanner.nextLine();
        } while (!agencia.matches("\\d{3}-\\d"));

        System.out.println("Por favor, qual é o nome completo do cliente?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o valor a depositar:");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
