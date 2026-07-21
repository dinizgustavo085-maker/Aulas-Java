package Aulas.encapsulamento.banco.principal;

import Aulas.encapsulamento.banco.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaconta = new ContaBancaria("Gustavo");
        minhaconta.getTitular();
        System.out.println(minhaconta.getTitular());
        minhaconta.depositar(100);


    }

}
