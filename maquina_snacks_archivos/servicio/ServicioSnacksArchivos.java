package maquina_snacks_archivos.servicio;

import maquina_snacks.Snack;
import maquina_snacks.Snacks;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks {

    private final String NOMBRE_ARCHIVO = "snack.txt";
    //Crear lista de snack
    private List<Snack> snacks = new ArrayList<>();

    //Crear constructor
    public ServicioSnacksArchivos(){
        //Creamos archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;

        try {
            existe = archivo.exists();
            if (existe){
                //this.snacks = obtenerSnacks();
            }else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();//Guardando el archivo en disco
                System.out.println("Archivo creado");
            }

        }catch (Exception e){
            System.out.println("Error al crear archivo "+e.getMessage());
        }
        //Si no existe el archivo, cargamo algunos snacks iniciales
        if (!existe){
            cargarSancksIniciales();
        }
    }

    private void cargarSancksIniciales(){
        this.agregarSnack(new Snack("De Todito",70));
        this.agregarSnack(new Snack("Refresco",50));
        this.agregarSnack(new Snack("Sandwich",120));
    }


    @Override
    public void agregarSnack(Snack snack) {

        //Agregar a lista, 1. a lista en memoria
        this.snacks.add(snack);
        //2. Guardamos el nuevo snack en archivo
        this.agregarSnackArchivo(snack);

    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);

        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack);
            salida.close();//Se escribe en archivo

        }catch (Exception e){
            System.out.println("Error al agregar snack "+e.getMessage());

        }
    }

    @Override
    public void mostrarSnacks() {
        
    }

    @Override
    public List<maquina_snacks_archivos.dominio.Snack> getSnacks() {
        return List.of();
    }

    @Override
    public void agregarSnack(maquina_snacks_archivos.dominio.Snack snack) {

    }
}
