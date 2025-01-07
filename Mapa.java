import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<String,String> persona = new HashMap<>();
        persona.put("Nombre","Wilmer");
        persona.put("Apellido","Arenas");
        persona.put("Edad","33");


        System.out.println("Valores de diccionario: ");
        persona.entrySet().forEach(System.out::println);

        //Iterer sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos por llave:valor");
        persona.forEach((llave,valor) -> {
            System.out.println("Llave: "+llave+" Valor: "+valor);
        });
    }
}
