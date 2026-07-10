import java.util.Scanner;

public class SegundaAula {
    public static void main(String[] args){
        int valor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite: ");
        valor = entrada.nextInt();


        System.out.printf("Comparando os if e else\n");
        if (valor < 10){
            System.out.println("Menor que 10");
        }else{
            System.out.println("Maior que 10");
        }

        System.out.printf("comparando o switch case \n");

        switch (valor){
            case 1:
                System.out.printf("Escolher 1");
                break;
            case 2:
                System.out.println("Igual a 10");
            case 3:
                System.out.println("Menor que 10");
            default:
                System.out.printf("Escolher uma opacao");
                break;
        }
    }
}
