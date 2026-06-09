package Singleton.Log;

public class Logger {
    private static Logger instancia;

    private Logger() {
        System.out.println("Inicializando Logger......");
    }

    public void Log(String mensagem) {
        System.out.println("[LOG]: " + mensagem);
    }

    public static Logger getInstance() {
        if(instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }
}
