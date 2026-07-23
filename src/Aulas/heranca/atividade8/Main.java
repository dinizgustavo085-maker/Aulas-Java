package Aulas.heranca.atividade8;

public class Main {
    public static void main(String[] args) {
        ArraAzul arara = new ArraAzul();
        Animal lobo = new LoboGuara();

        lobo.setNome("Lobo Gurá");
        arara.setNome("Arara Azul");


        arara.comer(arara.getNome());
        arara.emitirSom(arara.getNome());

        System.out.println("\n");

        lobo.comer(lobo.getNome());
        lobo.emitirSom(lobo.getNome());




    }
}
