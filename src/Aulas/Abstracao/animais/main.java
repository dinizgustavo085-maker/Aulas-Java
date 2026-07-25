package Aulas.Abstracao.animais;

public class main {
    public static void main(String[] args) {
        gato gato = new gato();
        cachorro cachorro = new cachorro();
        Aguia aguia = new Aguia();

        gato.carcar();
        gato.correr();
        gato.comer();
        gato.mover();
        System.out.printf("");


        cachorro.comer();
        System.out.printf("");

        aguia.carcar();
        aguia.voar();
        aguia.comer();



    }
}
