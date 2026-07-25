package Aulas.Abstracao.animais;

public class Aguia extends animal implements AnimalVoador, AnimalCArnivoro{
    @Override
    void mover() {
        System.out.println("Pulando de galho em galho");
    }

    @Override
    public void voar() {
        System.out.println("A aguia está voando");
    }

    @Override
    public void carcar() {
        System.out.println("A aguia está caçando o hamister");
    }
}
