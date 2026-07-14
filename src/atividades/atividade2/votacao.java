package atividades.atividade2;

import java.util.Scanner;

public class votacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");

        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar.");
        } else if (idade > 18) {
            System.out.println("Voto obrigatório.");

        } else if ((idade >= 16 && idade <= 17) || idade > 70) {
            System.out.println("Voto facultativo.");
        }
    }
}