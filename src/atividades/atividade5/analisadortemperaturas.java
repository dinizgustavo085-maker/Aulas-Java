package atividades.atividade5;

import java.util.Scanner;

public class analisadortemperaturas {
    public static void main(String[] args){
        double[] vetor = new double[6];
        Scanner input = new Scanner(System.in);

        for(int i=0; i < vetor.length; i++){
            System.out.println("Digite a temperatura: ");
            vetor[i] = input.nextDouble();
            
        }
        
        for(int i=0; i < vetor.length; i++){
            System.out.println( "Temperaturas: "+vetor[i]);
            
        }

        System.out.print("\n \n");

        for(int i=0; i < vetor.length; i++){
        if (vetor[i] <= 20) {
            System.out.println("Menor temperatura: " + vetor[i]);
        }else if (vetor[i] > 20.0) {
            System.out.println("Maior temperatura: " + vetor[i]);
        }
        }
    }
}


