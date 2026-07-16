package atividades.atividade5;

import java.util.Scanner;

public class somavetor{
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int resultado = 0; 

        for(int i=0; i < vetor.length; i++ ){

            Scanner input = new Scanner(System.in);
            System.out.println("Digite o numero: ");
            vetor[i] = input.nextInt();


            resultado =vetor[i] + resultado;
        
        }
        System.out.println("Resultado da soma: " + resultado);

    }
}