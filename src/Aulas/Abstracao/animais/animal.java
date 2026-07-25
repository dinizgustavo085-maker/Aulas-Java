package Aulas.Abstracao.animais;

public abstract class animal {
    private String nome;

    // metodo concreto
    public void comer(){
        System.out.println("O "+nome+" está comendo");
    }

    // metodo abstrato
    abstract void mover();
}
