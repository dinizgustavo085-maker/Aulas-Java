package atividades.atvidade3;

import java.util.Scanner;

public class atividadeDobro {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); // Ele permite que o usuário digite informações.

        int numero; // varivel declarada

        System.out.println("Digite o numero: ");

        numero = entrada.nextInt(); // recebe o numero

        System.out.println("numero digitado: " + numero); // mostra o numero digitado

        int resultado; // declarando variavel

        resultado = CalcularDobro(numero);
        //O valor armazenado em numero é enviado para o metodo calcula o dobro
        // O metodo calcula o dobro.
        //O resultado devolvido pelo metodo é armazena na variavel resultado.
        System.out.println("O dobro do número é: " + resultado);
    }

    public static int CalcularDobro(int numero){
       int resultado = numero * 2;
        return resultado;
    }
}
