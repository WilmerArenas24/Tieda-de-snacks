package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        //Metodo
        maquinaSnacks();
    }

    public static void maquinaSnacks() {
        var salir = false;
        var consola = new Scanner(System.in);
        //Creando lista de productos
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquina Snacks ***");
        Snacks.mostrarSnacks();


        while (!salir){
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);

            }catch (Exception e){
                System.out.println("Error: "+e.getMessage());
            }
            finally {
                System.out.println();//Imprime un salto de linea con cada iteracion
            }
        }




    }

    //Creando mas metodos
    private static int mostrarMenu(Scanner consola){
        System.out.printf("""
                Menu:
                1. Comprar Snack
                2. Mostrar Ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opción:\s""");
        //Leemos y retornamos la opcion
        return Integer.parseInt(consola.nextLine());
    }

    //Metodo ejecutar opciones
    private static boolean ejecutarOpciones(int opcion, Scanner consola,List<Snack> productos){
        var salir = false;

        switch (opcion){
            case 1 -> comprarSnack(consola,productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
        }
        return salir;
    }

    //Mostrar tikets
    private static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;

        for (var producto:productos){
            ticket += "\n\t-" + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }

        ticket += "\n\tTotal: $"+total;
        System.out.println(ticket);
    }

    //Comprar snacks
    private static void comprarSnack(Scanner consola, List<Snack> productos){
        System.out.print("Sanck a comprar (id): ");
        var idSnack = Integer.parseInt(consola.nextLine());
        //Validar que snack exista
        var snackEncontrado = false;
        for (var snack: Snacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                //Agregamos snack
                productos.add(snack);
                System.out.println("Snack agregado: "+ snack.getNombre());
                snackEncontrado = true;
                break;
            }
        }

        if (!snackEncontrado){
            System.out.println("Id no encontrado "+idSnack);
        }
    }

    //Agregando snack
    private static void agregarSnack(Scanner consola){
        System.out.print("Nombre del snack: ");
        var nombre = consola.nextLine();
        System.out.print("Precio: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("\nSnack agregado correctamente\n");
        Snacks.mostrarSnacks();
    }

}
