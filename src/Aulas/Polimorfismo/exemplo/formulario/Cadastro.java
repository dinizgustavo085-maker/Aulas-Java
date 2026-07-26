package Aulas.Polimorfismo.exemplo.formulario;

public class Cadastro {
    private int idade;
    private String nome;
    private boolean ativo;
    private String cargo;



    public Cadastro(String nome, int idade, String cargo, boolean ativo){
        this.idade = idade;
        this.nome = nome;
        this.ativo = ativo;
        this.cargo = cargo;
    }

    public Cadastro(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
        this.ativo = false;
    }
    public Cadastro(String nome){
        this.nome = nome;
        this.ativo = false;

    }

    public boolean isIncompleto(){
        return this.idade == 0 || this.cargo == null;
    }

    public void completarCdastro(){
        this.ativo = true;
        this.idade = idade;
        this.cargo = cargo;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", ativo=" + ativo +
                ", cargo='" + cargo + '\'' +
                '}';
    }




}
