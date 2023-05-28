import java.util.Arrays;
import java.util.TreeSet;

public class ExercicioArcoIris {
    public static void main(String[] args) {
        TreeSet<String> arcoIris = new TreeSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul",
                "anil", "violeta"));

        System.out.println("===\tCores do Arco-Íris\t===");
        System.out.print("Quantidade de cores: ");
        System.out.println(arcoIris.size());

        System.out.print("Cores em ordem alfabética: ");
        System.out.println(arcoIris);

        System.out.print("Cores em ordem inversa da informada: ");
        System.out.println(arcoIris.descendingSet());

        arcoIris.removeIf(cor -> !cor.startsWith("v"));
        System.out.print("Cores que começam com a letra 'v': ");
        System.out.println(arcoIris);

        arcoIris.clear();
        System.out.println("Conjunto limpo: " + arcoIris);

        System.out.println("Set vazio? " + arcoIris.isEmpty());
    }
}
