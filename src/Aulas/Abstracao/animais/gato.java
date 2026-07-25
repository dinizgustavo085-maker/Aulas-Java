package Aulas.Abstracao.animais;

public class gato extends animal implements AnimalTerrestre, AnimalCArnivoro{

    @Override
    public void comer() {
        super.comer();
    }

    @Override
    void mover() {
        System.out.println("O GATO ESTA SE MOVENDO");
    }

    @Override
    public void correr() {
        System.out.printf("MEu gato esta correndo");
    }

    @Override
    public void carcar() {
        System.out.println("O gato esta caçando o rato");
    }
}
