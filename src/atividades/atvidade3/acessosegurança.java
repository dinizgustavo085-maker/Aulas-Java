package atividades.atvidade3;

import java.util.Scanner;

public class acessosegurança {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o idade: ");
        int opcao;
        opcao = entrada.nextInt();

        if (VerificarMaioridade(opcao)) {
            System.out.println("acesso liberado");
        }else{
            System.out.println("acesso negado");
        }


    }

    public static boolean VerificarMaioridade(int idade) {
        if (idade >= 18) {
            return true;
        }else{
            return false;
        }
    }
}
