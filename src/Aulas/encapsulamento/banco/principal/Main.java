package Aulas.encapsulamento.banco.principal;

import Aulas.encapsulamento.banco.modelo.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria pessoa1 = new ContaBancaria("Gustavo");
        ContaBancaria pessoa2 = new ContaBancaria("Jhony");

        System.out.println(pessoa1);
        System.out.println(pessoa2);

    }

}
