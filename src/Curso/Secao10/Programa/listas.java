package Programa;

import java.util.List;
import java.util.ArrayList;

public class listas {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /* os <> são justamente os generics,ali são colocadas as Classes Wrappers */
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); /*
                               * Faz a adição de uma nova strng no parametro informado, semprejudicar o resto
                               * da lista
                               */

        System.out.println(list.size());

        list.remove("Anna"); /* A liusta tem a capacidade de remover atrvés da comparação */

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); /*
                                                                     * Quando nao encontrado o elemento é retornado -1
                                                                     */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }

}
