package atvidade3;

import java.util.Scanner;

public class atividadeDobro {
    public static void main(String[] args){

    }

    public static int CalcularDobro(int numero){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nuemro: ");
        numero = entrada.nextInt();
        int resultado = numero * 2;
        return resultado;
    }
}
