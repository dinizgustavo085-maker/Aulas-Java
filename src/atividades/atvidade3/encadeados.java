package atividades.atvidade3;

import java.util.Scanner;

public class encadeados {
    public static void main(String[] args) {
        imprimir();

    }
    public static int subtrair() {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero de X: ");
        x = input.nextInt();

        System.out.println("Digite o numero de Y: ");
        y = input.nextInt();

        int resultado = x - y;
        return resultado;
    }
    public static void imprimir(){
        int resultado;
        resultado = subtrair();
        System.out.println("o resultado da operacão: " + resultado);
    }
}
