package desafios;

import java.util.*;

public class MonitoramentoLogsAWS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeLogs = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Map<String, Long> eventosPorServico = new HashMap<>();
        String maiorServico = null;
        String menorServico = null;
        long maiorQuantidade = Long.MIN_VALUE;
        long menorQuantidade = Long.MAX_VALUE;

        for (int i = 0; i < quantidadeLogs; i++) {
            String[] parts = scanner.nextLine().split(",");
            String servico = parts[1];

            // Utilize o mapa para registrar/incrementar o serviço em questão.
            eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);

            // Atualize o serviço com maior quantidade, se necessário.
            if (eventosPorServico.get(servico) > maiorQuantidade) {
                maiorServico = servico;
                maiorQuantidade = eventosPorServico.get(servico);
            }
        }

        // Identifique o serviço com a menor quantidade após processar todos os logs.
        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            if (entry.getValue() < menorQuantidade) {
                menorServico = entry.getKey();
                menorQuantidade = entry.getValue();
            }
        }

        // Imprima a saída no padrão definido no enunciado deste desafio.
        System.out.println("Eventos por servico:");
        for (Map.Entry<String, Long> entry : eventosPorServico.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("Maior:" + maiorServico);
        System.out.println("Menor:" + menorServico);

        scanner.close();
    }
}
