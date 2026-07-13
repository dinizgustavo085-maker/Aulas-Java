package Atividade2;

import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorTotal;

        System.out.println("Digite valor da compra:");
        double valorCompra = scanner.nextDouble();

        if (valorCompra < 100.00) {
            System.out.println("Sem desconto.");
            System.out.println("Valor original: " + valorCompra);
        } else if (valorCompra >= 100.00 && valorCompra <= 299.99) {
            valorTotal = valorCompra - (valorCompra * 0.10);
            System.out.println("10% de desconto.");
            System.out.println("Valor a pagar com desconto: " + valorTotal);
        } else if (valorCompra >= 300.00) {
            valorTotal = valorCompra - (valorCompra * 0.20);
            System.out.println("20% de desconto.");
            System.out.println("Valor a pagar com desconto: " + valorTotal);
        }
    }
}