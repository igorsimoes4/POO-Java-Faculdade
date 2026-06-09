package Factory;

public class VeiculoFactory {
    public static Veiculo CriarVeiculo(String tipo) {
        if(tipo.equalsIgnoreCase("carro")){
            return new Carro();
        }
        if(tipo.equalsIgnoreCase("moto")){
            return new Moto();
        }
        throw new IllegalArgumentException("Tipo de veículo desconhecido: ");

        /*
        switch(tipo.toLowerCase()) {
            case "carro":
                return new Carro()
            case "moto":
                return new Moto();
            case null, default:
                throw new IllegalArgumentException("Tipo de veículo desconhecido: ");
        }

        return switch (tipo.toLowerCase()) {
            case "carro" -> new Carro();
            case "moto" -> new Moto();
            case null, default -> throw new IllegalArgumentException("Tipo de veículo desconhecido: ");
        };

        */

    }
}
