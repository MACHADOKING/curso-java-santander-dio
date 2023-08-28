package pilaresdopoo;

public class Autodromo {
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.setChassi("897897");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("789789");
        z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
