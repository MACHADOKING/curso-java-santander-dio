package one.digitalinovation.builderpattern;

public class CasaBuilder {
    private Casa casa;

    public CasaBuilder() {
        this.casa = new Casa();
    }

    public CasaBuilder numeroQuartos(int numeroQuartos) {
        casa.setNumeroQuartos(numeroQuartos);
        return this;
    }

    public CasaBuilder tamanho(double tamanho) {
        casa.setTamanho(tamanho);
        return this;
    }

    // Outros métodos para configurar outras características da casa

    public Casa build() {
        return casa;
    }
}
