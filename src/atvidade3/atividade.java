package atvidade3;

import java.util.Scanner;

public class atividade {

    public static int soma(int x, int y) {
        int resultado = x + y;
        return resultado;
    }

    public static void imprimirsoma(){
        System.out.println("\nMetodo de impressão\n");
        System.out.println(soma(10, 20));
        System.out.println("\n Fim Metodo de impressão\n ");
    }

    public static boolean comparacao(int resultado){

        if (resultado == 1) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Metodo main");

        imprimirsoma();
        int opcao = entrada.nextInt();

        if (comparacao(opcao)){ // esta comparando o metodo // metodo = função
            System.out.println("a opcao está correta ");
        }else{
            System.out.println("a opcao está errada");
        }
        System.out.println("Fim do main");
    }
}
