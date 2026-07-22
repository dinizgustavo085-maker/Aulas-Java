package Aulas.heranca.locomocao;

// extends vai definir que o carro vai ser filho do veiculo
public class Carro extends Veiculo{
    String cor;
    String categoria;
    String cambio;
    int quilometragem;


    public void ligarArCondicionado(){
        System.out.println("Ligando ar condicionado do meu carro! ");
    }
}
