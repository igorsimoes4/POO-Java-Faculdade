package Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Configuracao config1 = Configuracao.getInstance();
        Configuracao config2 = Configuracao.getInstance();
        System.out.println("É a mesma instancia? " + (config1 == config2));
    }
}
