package archivos;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";

        try {

            //Leer las lineas del achivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            for (String linea: lineas){
                System.out.println(linea);
            };

            System.out.println("\nUsando lambda: ");
            //Usando un lambda
            lineas.forEach(System.out::println);

        }catch (Exception e){
            System.out.println("Error al leer archivo "+e.getMessage());
            e.printStackTrace();
        }
    }
}
