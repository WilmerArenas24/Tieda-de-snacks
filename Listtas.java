import java.util.ArrayList;
import java.util.List;

public class Listtas {
    public static void main(String[] args) {
        //Definiendo una lista
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");

        //Usamos foreach
        for (Object elemento: miLista){
            System.out.println("Dia: "+ elemento);
        }

        System.out.println();
        System.out.println("Lista de animales:\n");

        //Definiendo el tipo de dato de una lista
        List<String> miLista2 = new ArrayList<String>();

        miLista2.add("Perro");
        miLista2.add("Gato");
        miLista2.add("Gallina");
        miLista2.add("Vaca");

        //foreach
        for (Object element: miLista2){
            System.out.println("Animal: "+ element);
        }

        //Nueva lista de numeros
        List<Integer> listaNumeros = new ArrayList<>();

        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(77);

        for (Object i: listaNumeros){
            System.out.println("Numero: "+i);
        }
    }

}
