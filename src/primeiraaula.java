import java.util.Scanner;

public class primeiraaula {
    public static void main(String[] args){
        String nome;
        int idade;
        float altura;
        String cargo;
        String período;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();


        System.out.print("Digite a sua idade: ");
        idade = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite sua altura: ");
        altura = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite seu nome: ");
        cargo = entrada.nextLine();

        System.out.print("Digite seu período (Matutino/ Vespertino/ Noturno): ");
        período = entrada.nextLine();

        System.out.print("Seu nome e: " + nome + "\n"
                + "Sua idade e: " + idade + "\n" +
                "Sua altura e: " + altura +
                "\n" + "Seu cargo e : " + cargo + "\n"
                + "Periodo e: " + período );
    }
