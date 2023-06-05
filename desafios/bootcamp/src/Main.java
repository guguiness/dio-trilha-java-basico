import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição do curso de Java", 20);
        Curso curso2 = new Curso("Curso Javascript", "Descrição do curso de Javascript", 15);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição da mentoria de Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria Javascript", "Descrição da mentoria de Javascript",
                LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
