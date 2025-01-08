package maquina_snacks_archivos.servicio;

import maquina_snacks.Snack;

import java.util.List;

public interface IServicioSnacks{
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<maquina_snacks_archivos.dominio.Snack> getSnacks();

    void agregarSnack(maquina_snacks_archivos.dominio.Snack snack);
}
