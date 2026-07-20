package atividades.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MelhoriaListaTarefas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();
        ArrayList<String> tarefasConcluidas = new ArrayList<>();

        System.out.println("Digite suas tarefas com data.");
        System.out.println("Exemplo: 2026/01/02 - Estudar Java");

        while (true) {
            System.out.print("\nNova tarefa: ");
            String novaTarefa = scanner.nextLine();

            tarefas.add(novaTarefa);

            System.out.print("Adicionar outra tarefa? Digite 'fim' para encerrar: ");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("fim")) {
                break;
            }
        }

        mostrarTarefas(tarefas);

        // Ordenação alfabética pelo nome da tarefa
        ordenarAlfabeticamente(tarefas);

        System.out.println("\nTarefas em ordem alfabética:");
        mostrarTarefas(tarefas);

        // Exemplos dos métodos de remoção:
        // removerFIFO(tarefas);
        // removerFEFO(tarefas);
        // removerLIFO(tarefas);
        // removerTarefaEspecifica(tarefas, 1);
        // concluirTarefa(tarefas, tarefasConcluidas, 1);

        scanner.close();
    }

    public static void mostrarTarefas(ArrayList<String> tarefas) {
        System.out.println("\nTarefas salvas:");

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefas.get(i));
        }
    }

    public static void ordenarAlfabeticamente(ArrayList<String> tarefas) {
        tarefas.sort(Comparator.comparing(
                MelhoriaListaTarefas::pegarDescricao,
                String.CASE_INSENSITIVE_ORDER
        ));
    }

    public static String pegarDescricao(String tarefa) {
        int posicao = tarefa.indexOf(" - ");

        if (posicao >= 0) {
            return tarefa.substring(posicao + 3);
        }

        return tarefa;
    }

    public static void removerFIFO(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Não existem tarefas para remover.");
            return;
        }

        String removida = tarefas.remove(0);
        System.out.println("Tarefa removida por FIFO: " + removida);
    }

    public static void removerFEFO(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Não existem tarefas para remover.");
            return;
        }

        String tarefaComMenorData = Collections.min(tarefas);
        tarefas.remove(tarefaComMenorData);

        System.out.println("Tarefa removida por FEFO: " + tarefaComMenorData);
    }

    public static void removerLIFO(ArrayList<String> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Não existem tarefas para remover.");
            return;
        }

        int ultimaPosicao = tarefas.size() - 1;
        String removida = tarefas.remove(ultimaPosicao);

        System.out.println("Tarefa removida por LIFO: " + removida);
    }

    public static void removerTarefaEspecifica(
            ArrayList<String> tarefas,
            int numeroTarefa
    ) {
        int posicao = numeroTarefa - 1;

        if (posicao < 0 || posicao >= tarefas.size()) {
            System.out.println("Número de tarefa inválido.");
            return;
        }

        String removida = tarefas.remove(posicao);
        System.out.println("Tarefa específica removida: " + removida);
    }

    public static void concluirTarefa(
            ArrayList<String> tarefas,
            ArrayList<String> tarefasConcluidas,
            int numeroTarefa
    ) {
        int posicao = numeroTarefa - 1;

        if (posicao < 0 || posicao >= tarefas.size()) {
            System.out.println("Número de tarefa inválido.");
            return;
        }

        String tarefaConcluida = tarefas.remove(posicao);
        tarefasConcluidas.add(tarefaConcluida);

        System.out.println("Tarefa concluída: " + tarefaConcluida);
    }
}