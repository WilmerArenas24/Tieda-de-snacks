package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

//Como se va a crear objectos no se agrega JavaBeans
public class ServicioSnacksLista  implements IServicioSnacks{
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

    public  void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    @Override
    public void agregarSnack(maquina_snacks.Snack snack) {

    }

    public  void mostrarSnacks(){
        var inventarioSnacks = "";

        for (var snack:snacks){
            inventarioSnacks += snack.toString() + "\n";
        }

        System.out.println("---Inventaio Snack---");
        System.out.println(inventarioSnacks);

    }

    public List<Snack> getSnacks(){
        return snacks;
    }
}
