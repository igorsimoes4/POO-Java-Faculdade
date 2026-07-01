package ListaCompras.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBD {
    private static ConectaBD instance;
    private Connection con;

    private ConectaBD() {
        try {
            this.con = DriverManager.getConnection("jdbc:sqlite:lista_compras.db");
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão do banco!", e);
        }
    }

    public static synchronized ConectaBD getInstance() {
        if (instance == null) {
            instance = new ConectaBD();
        }
        return instance;
    }

    public Connection getConnection() {
        return con;
    }
}
