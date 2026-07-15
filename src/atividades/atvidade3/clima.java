package atividades.atvidade3;

import java.util.Scanner;

public class clima {
    public static double converterParaFahrenheit(double celsius){
        double resultado = (celsius * 1.8) + 32;
        return resultado;
    }
    public static void AvaliarClima(double resultado){

        if (resultado < 50.0 ) {
            System.out.println("Clima Frio");
        } else if (resultado > 50.00 && resultado <= 79.99 ) {
            System.out.println("Clima Agradavel ");
        } else {
            System.out.println("Clima quente");
        }


    }
    public static void main(String[] args){
        double resultado;
        double celsius;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do Celsius: ");
        celsius = input.nextDouble();

        resultado = converterParaFahrenheit(celsius);
        AvaliarClima(resultado);
        System.out.println("resultado em Fahrenheit" + resultado);

    }
}
