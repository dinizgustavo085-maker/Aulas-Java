package Aulas.heranca.atividade8;

public class ArraAzul extends Animal{


    public void emitirSom(String nome){
        System.out.println("O som deste Animal "+nome+" esta 'Grasnar'");
    }

    public void comer(String nome){
        System.out.println("Este animal "+nome+" esta comendo sementes  ");
    }
}
