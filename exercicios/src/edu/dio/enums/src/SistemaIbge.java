public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro i : EstadoBrasileiro.values()) {
            System.out.println(i.getSigla() + " - " + i.getNome() + " - " + i.getCodIbge());
        }

        System.out.println("---------------------------------------");
        EstadoBrasileiro pr = EstadoBrasileiro.PARANA;
        System.out.println(pr.getSigla());
        System.out.println(pr.getNomeMaiusculo());
        System.out.println(pr.getNome());
        System.out.println(pr.getCodIbge());
    }
}
