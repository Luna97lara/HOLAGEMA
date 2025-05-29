package com.domain;

import com.dao.RepositorioUsuariosSimulado;

import java.io.Serializable;
import java.util.Random;

public class User implements Serializable {
    private String nombre;
    private String correo;
    private String contrasena;
    private int edad;
    private boolean visible;

    private AtributosFisicos atributosFisicos;
    private AtributosPersonalidad atributosPersonalidad;
    private CriteriosBusqueda criteriosBusqueda;

    //constructores:
    public User() {
    }

    public User(String nombre, String correo, String contrasena, int edad, boolean visible, AtributosFisicos atributosFisicos, AtributosPersonalidad atributosPersonalidad, CriteriosBusqueda criteriosBusqueda) {
        this(contrasena, edad, visible, atributosFisicos, atributosPersonalidad, criteriosBusqueda);
    }

    public User(String contrasena, int edad, boolean visible, AtributosFisicos atributosFisicos, AtributosPersonalidad atributosPersonalidad, CriteriosBusqueda criteriosBusqueda) {
        this.contrasena = contrasena;
        this.edad = edad;
        this.visible = visible;
        this.atributosFisicos = atributosFisicos;
        Random random = new Random();
        if (atributosFisicos.isSexo()) {
            this.nombre = RepositorioUsuariosSimulado.nombresMasculinos[random.nextInt(RepositorioUsuariosSimulado.nombresMasculinos.length)];
        } else {
            this.nombre = RepositorioUsuariosSimulado.nombresFemeninos[random.nextInt(RepositorioUsuariosSimulado.nombresFemeninos.length)];
        }
        this.correo = this.nombre + "@gmail.com";
        this.atributosPersonalidad = atributosPersonalidad;
        this.criteriosBusqueda = criteriosBusqueda;
    }

    //getters y setters:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public AtributosFisicos getAtributosFisicos() {
        return atributosFisicos;
    }

    public void setAtributosFisicos(AtributosFisicos atributosFisicos) {
        this.atributosFisicos = atributosFisicos;
    }

    public AtributosPersonalidad getAtributosPersonalidad() {
        return atributosPersonalidad;
    }

    public void setAtributosPersonalidad(AtributosPersonalidad atributosPersonalidad) {
        this.atributosPersonalidad = atributosPersonalidad;
    }

    public CriteriosBusqueda getCriteriosBusqueda() {
        return criteriosBusqueda;
    }

    public void setCriteriosBusqueda(CriteriosBusqueda criteriosBusqueda) {
        this.criteriosBusqueda = criteriosBusqueda;
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", edad=" + edad +
                ", visible=" + visible + "\n" +
                atributosFisicos + "\n" +
                atributosPersonalidad +
                '}';
    }
}
