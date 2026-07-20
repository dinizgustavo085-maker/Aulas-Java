package atividades.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class melhoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        System.out.println("Digite suas tarefas com data.");
        System.out.println("Exemplo: 2026/01/02 - Estudar Java");

        while (true) {

            System.out.print("\nNova tarefa: ");
            tarefas.add(scanner.nextLine());

            System.out.print(
                    "Quer adicionar outra tarefa? " +
                            "Digite 'fim' para finalizar: "
            );

            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("fim")) {
                break;
            }
        }

        mostrarTarefas(tarefas);

        int opcaoRemocao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Remover tarefa específica");
            System.out.println("2 - Remover por FIFO");
            System.out.println("3 - Remover por FEFO");
            System.out.println("4 - Remover por LIFO");
            System.out.println("5 - Mostrar tarefas");
            System.out.println("0 - Encerrar");

            System.out.print("Opção: ");
            opcaoRemocao = scanner.nextInt();

            switch (opcaoRemocao) {

                case 1:
                    mostrarTarefas(tarefas);

                    System.out.print(
                            "Digite o número da tarefa que deseja remover: "
                    );

                    int numeroTarefa = scanner.nextInt();

                    removerTarefaEspecifica(
                            tarefas,
                            numeroTarefa
                    );

                    break;

                case 2:
                    removerFIFO(tarefas);
                    break;

                case 3:
                    removerFEFO(tarefas);
                    break;

                case 4:
                    removerLIFO(tarefas);
                    break;

                case 5:
                    mostrarTarefas(tarefas);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcaoRemocao != 0);

        scanner.close();
    }

    public static void mostrarTarefas(
            ArrayList<String> tarefas
    ) {

        System.out.println("\nTarefas atuais:");

        if (tarefas.isEmpty()) {
            System.out.println("Não existem tarefas.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(
                    (i + 1) + " - " + tarefas.get(i)
            );
        }
    }

    public static void removerTarefaEspecifica(
            ArrayList<String> tarefas,
            int numeroTarefa
    ) {

        int posicao = numeroTarefa - 1;

        if (
                posicao >= 0 &&
                        posicao < tarefas.size()
        ) {

            String tarefaRemovida = tarefas.remove(posicao);

            System.out.println(
                    "Tarefa removida: " + tarefaRemovida
            );

        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }

    public static void removerFIFO(
            ArrayList<String> tarefas
    ) {

        if (tarefas.isEmpty()) {
            System.out.println("Não existem tarefas para remover.");
            return;
        }

        String tarefaRemovida = tarefas.remove(0);

        System.out.println(
                "Tarefa removida por FIFO: " + tarefaRemovida
        );
    }

    public static void removerFEFO(
            ArrayList<String> tarefas
    ) {

        if (tarefas.isEmpty()) {
            System.out.println("Não existem tarefas para remover.");
            return;
        }

        Collections.sort(tarefas);

        String tarefaRemovida = tarefas.remove(0);

        System.out.println(
                "Tarefa removida por FEFO: " + tarefaRemovida
        );
    }

    public static void removerLIFO(
            ArrayList<String> tarefas
    ) {

        if (tarefas.isEmpty()) {
            System.out.println("Não existem tarefas para remover.");
            return;
        }

        int ultimaPosicao = tarefas.size() - 1;

        String tarefaRemovida =
                tarefas.remove(ultimaPosicao);

        System.out.println(
                "Tarefa removida por LIFO: " + tarefaRemovida
        );
    }
}