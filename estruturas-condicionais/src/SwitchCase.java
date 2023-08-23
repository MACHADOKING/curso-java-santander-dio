public class SwitchCase {
    public static void main(String[] args) {
        /*
        **Estrutura encadeada**

        String sigla = "M";

        if (sigla == "P")
            System.out.println("Pequeno");
        else if (sigla == "M")
            System.out.println("Medio");
        else if (sigla == "G")
            System.out.println("Grande");
        else
            System.out.println("Indefinido");
        */

        // **Quando não há vantagem sobre o if**
        String sigla = "P";
        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            } case "M": {
                System.out.println("Medio");
                break;
            } case "G": {
                System.out.println("Grande");
                break;
            } default: {
                System.out.println("Indefinido");
                break;
            }
        }

        // **Quando tem vantagem sobre o if**
        String plano = "M";

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
    }
}
