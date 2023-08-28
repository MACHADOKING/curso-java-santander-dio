package encapsulamento;
public class Carro {
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }
}
