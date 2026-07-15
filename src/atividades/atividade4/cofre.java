package atividades.atividade4;

import java.util.Scanner;

public class cofre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        abrircofre(input);

        input.close();
    }

    public static void abrircofre(Scanner input) {
        int senha;
        int repeticao = 5;
        int senhaCorreta = 9999;

        while (repeticao > 0) {
            System.out.println("Quantidade de tentativas: " + repeticao);
            System.out.println("Digite a senha: ");
            senha = input.nextInt();

            if (senha == senhaCorreta) {
                System.out.println("Cofre aberto!");
                break;
            } else {
                System.out.println("Senha errada!");
                repeticao--;
            }

        }

        if (repeticao == 0) {
            System.out.println("Cofre bloqueado!");
        }
    }
}

