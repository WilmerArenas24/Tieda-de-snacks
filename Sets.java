import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Marlon");
        conjunto.add("Marlon");
        conjunto.add("Valen");

        conjunto.forEach(System.out::println);

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(22);
        numeros.add(22);
        numeros.add(4);
        numeros.add(7);
        numeros.add(4);
        numeros.add(5);

        numeros.forEach(System.out::println);
        System.out.println("Eliminando una vez 4");
        numeros.remove(4);
        numeros.forEach(System.out::println);
    }
}
