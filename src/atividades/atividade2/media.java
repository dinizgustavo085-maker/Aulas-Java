package atividades.atividade2;
import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite suas notas:");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else if (media < 5.0) {
            System.out.println("Reprovado.");

        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Em Recuperação.");
        }
    }
}