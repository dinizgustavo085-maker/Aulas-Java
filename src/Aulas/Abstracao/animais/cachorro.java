package Aulas.Abstracao.animais;

public class cachorro extends animal{
    @Override
    public void comer() {
        super.comer();
    }

    @Override
    void mover(){
        System.out.println("o cachorro está correndo");
    }
}
