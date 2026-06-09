package Factory;

public class MainFactory {
    public static void main(String[] args) {
        Veiculo meucarro = VeiculoFactory.CriarVeiculo("carro");
        Veiculo minhaMoto = VeiculoFactory.CriarVeiculo("mOtO");

        meucarro.acelerar();
        minhaMoto.acelerar();
    }
}
