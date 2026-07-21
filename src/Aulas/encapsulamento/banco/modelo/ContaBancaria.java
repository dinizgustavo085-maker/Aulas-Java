package Aulas.encapsulamento.banco.modelo;

import java.util.ArrayList;

public class ContaBancaria {
    // Atributos dessa classe
    private String titular;
    private int numeroDaConta;
    private double saldo;
    private static int contador = 1;


    // Contrustor dessa classe
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.numeroDaConta = contador;
        this.saldo = 0.0;
        contador++;
    }

    private int incremento(){
        return contador += 1;

    }


    // metodos Gets e Sets

    public String getTitular() {
        return titular;
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
    @Override
    public String toString() {
        return "ContaBancaria{" +
                "titular='" + titular + '\'' +
                ", numeroDaConta=" + numeroDaConta +
                ", saldo=" + saldo +
                '}';
    }

}
