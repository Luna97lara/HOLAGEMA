package com.dao;
import com.domain.*;
import com.ui.GeneradorObjetosRandom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Database {
    private List<User> lista;
    public Database() {
        lista = new ArrayList<User>();
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            String contrasena = "pass" + i; //concatena la palabra pass con el numero de iteracion del bucle (i)
            int edad = 18 + random.nextInt(40); // edad entre 18-57
            boolean visible = random.nextBoolean();
            AtributosFisicos atributosFisicos = GeneradorObjetosRandom.generarAtributosFisicos();
            AtributosPersonalidad atributosPersonalidad = GeneradorObjetosRandom.generarAtributosPersonalidad();
            CriteriosBusqueda criteriosBusqueda = GeneradorObjetosRandom.generarCriteriosBusqueda();
            lista.add(new User(contrasena, edad, visible, atributosFisicos, atributosPersonalidad, criteriosBusqueda));
        }
    }
    public List<User> getLista() {
        return lista;
    }


}
