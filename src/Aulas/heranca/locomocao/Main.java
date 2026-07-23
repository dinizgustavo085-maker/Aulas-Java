package Aulas.heranca.locomocao;

public class Main {
    public static void main(String[] args) {
        Carro carro =  new Carro();
        Moto motoEletrica = new Motoeletrica();
        Moto motoAcombustao = new Motocombustao();

        carro.getNomeVeiculo();
        motoEletrica.ligar();
        motoAcombustao.abastecer();

    }
}
