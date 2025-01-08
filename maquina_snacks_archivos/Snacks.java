package maquina_snacks_archivos;

import java.util.ArrayList;
import java.util.List;

//Como se va a crear objectos no se agrega JavaBeans
public class Snacks {
    private static final List<Snack> snacks;

    //No se usa constructor para iniciar la variable snacks ya que el constructor es para objectos
    //Bloque de tipo statico inicializador
    static {
        //Snacks.snacks
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas",70));
        snacks.add(new Snack("Refresco",50));
        snacks.add(new Snack("Sandwich",120));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnacks = "";

        for (var snack:snacks){
            inventarioSnacks += snack.toString() + "\n";
        }

        System.out.println("---Inventaio Snack---");
        System.out.println(inventarioSnacks);

    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
