package Aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {
        Carro carro =  new Carro();
        Moto moto = new Motocombustao();


        carro.nomeVeiculo = "Corsa";
        carro.ligar();
        carro.cor = "Azul";
        carro.ligarArCondicionado();

        moto.cor = "Amarelo";
        moto.puxarPezinho();


    }
}
