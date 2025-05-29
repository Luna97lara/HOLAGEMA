package com.service;
import com.domain.User;
import java.util.List;
import java.util.stream.Collectors;

public class CompatiblesOrdenados {
    public static List<User> obtenerCompatiblesOrdenados(User buscador, List<User> usuarios) {
        return usuarios.stream()
                //descarta usuarios que noG están activos y al propio usuario:
                .filter(u -> u.isVisible() && !u.getCorreo().equals(buscador.getCorreo()))
                /*ordena por compatibilidad, de mayor a menor:
                compara dos usuarios u1 y u2 para ordenarlos
                usa el metodo compatibilidad para obtener la puntuacion de cada uno
                orden descendente: u2 con u1, asi los mas compatibles quedan primero
                */
                .sorted((u1, u2) -> Integer.compare(
                        Compatibilidad.calcularCompatibilidad(buscador, u2),
                        Compatibilidad.calcularCompatibilidad(buscador, u1)))
                //convierte el stream de nuevo ordenado a una lista:
                .collect(Collectors.toList());
    }
}
