import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.*;
import java.util.stream.Collectors;

import static java.util.OptionalDouble.*;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);

       List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
               .map(Integer::parseInt)
               .collect(Collectors.toList());




        System.out.println("\nPegue os 5 primeiros numeros e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de numeros inteiros: ");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toSet())
                .forEach(System.out::println);







        System.out.println("\nPegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaiorQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i %2 ==0 && i>2)).collect(Collectors.toList());
        System.out.println(listParesMaiorQue2);

        System.out.println("\nMostre a media dos numeros: ");

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
        .average()
    .ifPresent(System.out::println);

        System.out.println("\nRemova os valores impares: ");
        numerosAleatoriosInteger.removeIf(i ->  (i %2 !=0));
        System.out.println(numerosAleatoriosInteger);

    }
}
