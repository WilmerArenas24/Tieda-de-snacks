import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaJava {
    public static void main(String[] args) {
        List<Integer> misNumeros = new ArrayList<>();
        misNumeros.add(1);
        misNumeros.add(7);
        misNumeros.add(9);
        misNumeros.add(11);
        misNumeros.add(13);

        List<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");

        //Funciones lambda (función anonima de un codigo compacto)
        misNumeros.forEach(elemento -> {
            System.out.println("Elemento: "+elemento);
        });

        System.out.println("\nRecorriendo días semana:\n");
        //Metodos de referencia
        dias.forEach(System.out::println);

        System.out.println("\nRecorriendo nombres:\n");
        //Otra forma de crear lista
        List<String> nombre = Arrays.asList("Wilmer","Laura","Ivone");

        nombre.forEach(System.out::println);


    }
}
