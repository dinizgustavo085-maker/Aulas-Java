package Aulas.heranca.locomocao;

// extends vai definir que o moto vai ser filho do veiculo
public class Moto extends Veiculo {
    String cor;
    String categoria;
    String cambio;
    int quilometragem;

    public void puxarPezinho(){
        System.out.println("Puxando pé da moto pra estacionar!");
    }

    public void abastecer(){
        System.out.println("moto abastecendo");
    }

}
