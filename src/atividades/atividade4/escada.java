package atividades.atividade4;

public class escada {
    public static void main(String[] args) {
        escada();
    }
    public static int escada(){
        char simbolo = '#';
        for (int x = 0; x < 10; x++ ){
            for (int y =0; y < x;y++ ){
                System.out.print(simbolo);
            }
            System.out.println("");
        }
        return 0;
    }
}
