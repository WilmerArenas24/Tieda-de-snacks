package maquina_snacks_archivos.dominio;

import java.io.Serializable;
import java.util.Objects;

//JabaBeans impleneta serializable
public class Snack implements Serializable {
    private static int contadorSnack = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    //Constructor vacio
    public Snack(){
        this.idSnack = ++contadorSnack;
    }

    //Constructor con parametros
    public Snack(String nombre, double precio){

        this();//Llamando el constructor vacio, debe ser la primera linea
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContadorSnack() {
        return contadorSnack;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Generar metodo toString
    @Override
    public String toString() {
        return "Snack{" +
                "idSnack: " + idSnack +
                ", nombre: '" + nombre + '\'' +
                ", precio: " + precio +
                '}';
    }

    //Para agregar los snack a la lista de snacks se crea el equals

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
