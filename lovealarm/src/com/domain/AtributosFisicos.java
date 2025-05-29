package com.domain;

public class AtributosFisicos {
    private boolean sexo;
    private double altura;
    private ColordeOjos colordeOjos;
    private Etnicidad etnicidad;

    //constructores:
    public AtributosFisicos(){}
    public AtributosFisicos(boolean sexo, double altura, ColordeOjos colordeOjos, Etnicidad etnicidad) {
        this.sexo = sexo;
        this.altura = altura;
        this.colordeOjos = colordeOjos;
        this.etnicidad = etnicidad;
    }

    //getters y setters:
    public boolean isSexo() {
        return sexo;
    }
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public ColordeOjos getColordeOjos() {
        return colordeOjos;
    }
    public void setColordeOjos(ColordeOjos colordeOjos) {
        this.colordeOjos = colordeOjos;
    }
    public Etnicidad getEtnicidad() {
        return etnicidad;
    }
    public void setEtnicidad(Etnicidad etnicidad) {
        this.etnicidad = etnicidad;
    }


    public String toString() {
        return "Atributos Físicos: " +
                "Sexo = " + (sexo ? "Hombre" : "Mujer") +
                ", Altura mínima = " + altura +
                ", Color de ojos = '" + colordeOjos + '\'' +
                ", Etnicidad = '" + etnicidad + '\'';
    }
}
