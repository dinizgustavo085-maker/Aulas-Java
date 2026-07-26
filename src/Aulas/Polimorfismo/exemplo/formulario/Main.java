package Aulas.Polimorfismo.exemplo.formulario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Cadastro> daddosIcompletos = new ArrayList<>();

        Cadastro pessoa1 = new Cadastro("gustavo", 19,"Professor", true);
        Cadastro pessoa2 = new Cadastro("diego", 24);
        Cadastro pessoa3 = new Cadastro("gustavo");

        System.out.println("\n -----------  DADOS CADASTRADOS ----------- \n ");
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);


        if (pessoa1.isIncompleto()){
            daddosIcompletos.add(pessoa1);
        }
        if (pessoa2.isIncompleto()) {
            daddosIcompletos.add(pessoa2);
        }
        if (pessoa3.isIncompleto()){
            daddosIcompletos.add(pessoa3);
        }

        System.out.println("\n--- LISTA DE DADOS INCOMPLETOS ---");
        for (int i = 0; i < daddosIcompletos.size(); i++){
            System.out.println(daddosIcompletos.get(i));
        }

        System.out.println("\n--- PREENCHENDO DADOS FALTANTES ---");
        for (int i = 0; i < daddosIcompletos.size(); i++){
            Cadastro pessoa = daddosIcompletos.get(i);
            System.out.println("Verificando cadastro de: " + pessoa.getNome());

            if (pessoa.getIdade() == 0){
                System.out.println("Digite sua idade faltante: " + pessoa.getNome() + ": ");
                int novaIdade = input.nextInt();
                input.nextLine();
                pessoa.setIdade(novaIdade);
            }
            if (pessoa.getCargo() == null){
                System.out.println("Digite cargo faltante: " + pessoa.getNome()+ ": ");
                String novoCargo = input.nextLine();
                pessoa.setCargo(novoCargo);
            }

            System.out.println("-> Cadastro atualizado!\n");

        }
        for (int i = daddosIcompletos.size() - 1; i >= 0; i--){
            Cadastro pessoa = daddosIcompletos.get(i);

            if (pessoa.getIdade() != 0 && pessoa.getCargo() != null) {
                daddosIcompletos.remove(i);
            }

            pessoa.setAtivo(true);
        }

        System.out.println("--- PENDÊNCIAS RESTANTES NA LISTA ---");
        System.out.println("Incompletos pendentes: " + daddosIcompletos.size());

        System.out.println("\n--- CADASTROS FINAIS ---");
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);

        input.close();


    }
}
