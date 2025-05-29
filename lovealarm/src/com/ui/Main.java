package com.ui;
import com.domain.*;

import java.util.List;

import com.dao.Database;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        User usuario = FormularioUsuario.createUser();
        System.out.println("\nUsuario creado:");
        System.out.println(usuario);

        System.out.println("Usuarios generados automáticamente:");
        List<User> usuarios = database.getLista();
        for (User user : usuarios) {
            System.out.println(user);
            System.out.println("--------------------");
        }
    }
}
