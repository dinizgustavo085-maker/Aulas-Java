package atividades.atividade5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class melhoriatarefaFEFO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.print("Digite suas tarefas com data:");
        System.out.print(" \nexemplo: 2026/01/02 - tarefa ");
        while (true){
            System.out.print("Nova tarefa: ");
            tarefas.add(scanner.nextLine());

            System.out.println("Quer adicionar mais alguma tarefa? (digite 'fim' para finalizar o programa)");
            String opcao = scanner.nextLine();

            if (opcao.equals("fim")){
                break;
            }
        }
        System.out.println("\n Tarefas salvas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(" \n Tarefa nº"+(i+1)+" "+tarefas.get(i));

        }
        Collections.sort(tarefas);
        String data = tarefas.remove(0);
        System.out.print("\n Tarefas removidas: " + data);
        System.out.println("\n Tarefas atualizadas : "+ tarefas);
    }
}
