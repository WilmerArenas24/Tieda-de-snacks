package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {


            if (archivo.exists()){
                System.out.println("El archivo ya existe");
            }else {
                //Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();//Se crea archivo en disco
                System.out.println("Archivo creado: "+nombreArchivo);
            }

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }


    }
}
