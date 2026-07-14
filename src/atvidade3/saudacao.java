package atvidade3;
import java.util.Scanner;

public class saudacao {
    public static void main(String[] args){
        imprimisaudao();
    }


    public static void imprimisaudao(){
        String nome;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Olá, "+ nome +" Bem-vindo(a) à nossa aula de métodos.\n");

    }
}
