import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStreamsAPI {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numeros.forEach(s -> System.out.print(s + " "));

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:");
        Set<String> collectSet = numeros.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> collectInteger = numeros.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectInteger);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaioresQue2 = numeros.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .toList();
        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");
        numeros.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(i -> System.out.println(i + " "));

        System.out.println("Remova os valores ímpares: ");
        collectInteger.removeIf(i -> i % 2 != 0);
        System.out.println(collectInteger);
    }
}
