import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição do curso de Java", 20);
        Curso curso2 = new Curso("Curso Javascript", "Descrição do curso de Javascript", 15);
        Curso curso3 = new Curso("Curso HTML/CSS", "Descrição do curso de Curso HTML/CSS", 20);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Descrição da mentoria de Java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria Javascript", "Descrição da mentoria de Javascript",
                LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp1 = new Bootcamp("Bootcamp Backend", "Descrição do Bootcamp Backend");
        bootcamp1.getAtividades().add(curso1);
        bootcamp1.getAtividades().add(mentoria1);

        Bootcamp bootcamp2 = new Bootcamp("Bootcamp Frontend", "Descrição do Bootcamp Frontend");
        bootcamp2.getAtividades().add(curso2);
        bootcamp2.getAtividades().add(curso3);
        bootcamp2.getAtividades().add(mentoria2);

        System.out.println("Jorge ----------------------- ");
        Dev devJorge = new Dev("Jorge");
        devJorge.inscreverBootcamp(bootcamp1);
        devJorge.progredir();
        devJorge.progredir();
        System.out.println("Atividades inscritas: " + devJorge.getAtividadesInscritas());
        System.out.println("Atividades concluídas: " + devJorge.getAtividadesConcluidas());
        System.out.println("XP: " + devJorge.calcularTotalXP());

        System.out.println("Carlota ----------------------- ");
        Dev devCarlota = new Dev("Carlota");
        devCarlota.inscreverBootcamp(bootcamp1);
        devCarlota.inscreverBootcamp(bootcamp2);
        while(devCarlota.getAtividadesInscritas().size() > 1) devCarlota.progredir();
        System.out.println("Atividades inscritas: " + devCarlota.getAtividadesInscritas());
        System.out.println("Atividades concluídas: " + devCarlota.getAtividadesConcluidas());
        System.out.println("XP: " + devCarlota.calcularTotalXP());

        System.out.println("Inscrições em Bootcamps ----------------------- ");
        System.out.println(bootcamp1.getNome() + ": " + bootcamp1.getDevsInscritos());
        System.out.println(bootcamp2.getNome() + ": " + bootcamp2.getDevsInscritos());
    }
}
