package Singleton.Log;

public class MainLog {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.Log("Usuário logou no sistema.");

        Logger logger2 = Logger.getInstance();
        System.out.println(logger == logger2);
        logger2.Log("Usuário realizou uma ação.");
    }
}
