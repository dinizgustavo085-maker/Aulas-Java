package Aulas.encapsulamento.banco.modelo;

import java.util.ArrayList;

public class ContaBancaria {
    // Atributos dessa classe
    private String titular;
    private int numeroDaConta;
    private double saldo;
    private int pessoa;


    // Contrustor dessa classe

    public ContaBancaria(String titular, int numeroDaConta) {
        this.titular = titular;
        this.numeroDaConta = this.pessoa;
        this.saldo = 0.0;


    }

    private int incremento(){
        return pessoa += 1;

    }


    // metodos Gets e Sets

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println(valor+" foi depositado");
        }else{
            System.out.println("Erro: valor invalido");
        }
    }

    public void sacardinheiro(double valor){
        if (this.saldo > valor){
            this.saldo -= valor;
            System.out.println(" foi retirada da conta");
        }
    }
    private String acessartodososdados(){
        return this.titular;
    }
}
