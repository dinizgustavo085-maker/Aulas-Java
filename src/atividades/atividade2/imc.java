package atividades.atividade2;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 30) {
            System.out.println("Obesidade.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
        }
    }
}
