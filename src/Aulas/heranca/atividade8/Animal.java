package Aulas.heranca.atividade8;

public class Animal {
    private String setorZoo;
    private int peso;
    private String nome;


    public void emitirSom(String nome){
        System.out.println("O som deste Animal "+nome);
    }

    public void comer(String nome){
        System.out.println("Este animal "+nome+ " comendo");
    }

    public String getSetorZoo() {
        return setorZoo;
    }

    public void setSetorZoo(String setorZoo) {
        this.setorZoo = setorZoo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
