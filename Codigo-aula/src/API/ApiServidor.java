package API;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class ApiServidor {
    static ArrayList<Veiculo> frota = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        frota.add(new Carro("Toyota", "Corolla", 4));
        frota.add(new Carro("RAM", "Rampage", 4));

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/api/frota", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
                exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
                String metodo = exchange.getRequestMethod();

                if("GET".equals(metodo)) {
                    exchange.getResponseHeaders().add("Content-Type", "application/json; charset=utf-8");
                    StringBuilder jsonResponse = new StringBuilder("[");
                    for(int i = 0; i < frota.size(); i++) {
                        jsonResponse.append(frota.get(i).toJson());

                        if(i < frota.size()-1) {
                            jsonResponse.append(",");
                        }
                        jsonResponse.append("]");
                        enviarResposta(exchange, 200, jsonResponse.toString());
                    }
                } else if("POST".equals(metodo)) {
                    InputStreamReader reader = new InputStreamReader(exchange.getRequestBody(), "utf-8");
                    BufferedReader br = new BufferedReader(reader);
                    String jsonRecebido = br.readLine();

                    String dadosLimpos = jsonRecebido.replace("{", "").replace("}", "").replace("\"", "");
                    String[] partes = dadosLimpos.split(",");

                    String novaMarca = partes[0].split(":")[1];
                    String novoModelo = partes[1].split(":")[1];
                    int novoNumeroPortas = Integer.parseInt(partes[2].split(":")[1]);

                    frota.add(new Carro(novaMarca, novoModelo, novoNumeroPortas));

                    enviarResposta(exchange, 201, "{\"status:\":\"Veículo adicionado com sucesso\"}");
                } else if ("OPTIONS".equals(metodo)) {
                    exchange.sendResponseHeaders(204, -1);
                }
            }
        });
        server.setExecutor(null);
        server.start();
        System.out.println("Servidor rodando e aceitando POST e GET na porta 8080...");

    }

    private static void enviarResposta(HttpExchange exchange, int statuscode, String resposta) throws IOException {
        byte[] responseBytes = resposta.getBytes("utf-8");
        exchange.sendResponseHeaders(statuscode, responseBytes.length);
        OutputStream os = exchange.getResponseBody();
        os.write(responseBytes);
        os.close();
    }

}
