package Stratege;

public class Pedido {
    private EstrategiadeFrete estrategiadeFrete;
    public void setEstrategiadeFrete(EstrategiadeFrete estrategiadeFrete) {
        this.estrategiadeFrete = estrategiadeFrete;
    }
    public double calcularTotalFrete(double peso) {
        return estrategiadeFrete.calcular(peso);
    }

}
