package ListaCompras.DAO;

import ListaCompras.Modelo.Compras;

import java.util.List;

public interface ComprasDAO {
    void comprar(String data, int mercado, int item, double preco);
    List<Compras> listarCompra();
}
