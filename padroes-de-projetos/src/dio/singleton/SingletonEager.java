package dio.singleton;

/*
 * Singleton eager"apressado"
 * 
 * @author MACHADOKING
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
