package aula14042026A;

import java.util.ArrayList;

public class ListaDinamica {

    // String
    // int -> Integer
    // double -> Double
    // boolean -> Boolean
    // float -> Float

    // .add(valor) -> adiciona um valor no final da lista
    // .get(indice) -> retorna o valor do indice
    // .size() -> retorna o tamanho da lista
    // .remove(indice) -> remove o valor do indice
    // .remove(objeto) -> remove o valor do objeto (primeira ocorrência)
    // .clear() -> limpa a lista
    // .contains(objeto) -> retorna true se a lista contém o objeto
    // .indexOf(objeto) -> retorna o indice do objeto (primeira ocorrência)
    // .lastIndexOf(objeto) -> retorna o indice do objeto (última ocorrência)
    // .isEmpty() -> retorna true se a lista estiver vazia
    // .toArray() -> retorna um array com os elementos da lista

    // Autounboxing - conversão automática de um objeto wrapper para o tipo primitivo correspondente
    // Autoboxing - conversão automática de um tipo primitivo para o objeto wrapper correspondente


    public void teste() {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        lista.add(10);
        precos.add(5.99);

        System.out.println(lista.get(0));
        System.out.println(precos.get(0));

    }

}
