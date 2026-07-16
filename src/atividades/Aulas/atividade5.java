package atividades.Aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // declarando vetores
        int[] numero = new int[3];
        numero[0] = 1;
        numero[1] = 2;
        numero[2] = 3;


        for (int j : numero) {
            System.out.println(j);
        }

        // declarando arraylist
        ArrayList<String> listadenomes= new ArrayList<>();


        int opcao = 0;
        while (opcao == 0){
            int opcaolista;
            System.out.println("Escolha uma opcao: ");
            System.out.println("Adicionar = 1 \n apagar = 2");
            input.nextLine();
            input.nextInt();
            if (opcaolista == 1){
                System.out.println("Digite o nome: ");
                listadenomes.add(input.nextLine());
            }else {

            }
            System.out.println("Digite o nome: ");
            listadenomes.add(input.nextLine());
            input.nextLine();

            System.out.println("Continuar = 0");
            System.out.println("Sair = 2");

            opcao = input.nextInt();
            input.nextLine();
        }
        System.out.println(listadenomes);

    }
}
