package atividades.atividade4;

import java.util.Scanner;

public class cofre {
    public static void main(String[] args){
        abrir();
    }


    public static void abrircofre(int senha){
        int repeticao = 5;
        int senhaCorreta = 9999;

        while (0 <= repeticao){
            System.out.println("Quantidade de tentativas: " + repeticao);
                if (senha == senhaCorreta){
                    System.out.println("Cofre aberto!");
                    break;
                }else if (senha != repeticao){
                    System.out.println("Cofre Errado!");
                }else {
                    System.out.println("Cofre Bloqueado");
                }
            repeticao--;
        }
    }

    public static void abrir(){
        int repeticao = 5;
        int senha;

        Scanner input = new Scanner(System.in);
        System.out.println("digite a senha: ");
        senha = input.nextInt();

        while (0 < repeticao){
            if (senha == 9999){
                System.out.println("Cofre aberto");
            } else if () {
                
            }
        }
    }
}

