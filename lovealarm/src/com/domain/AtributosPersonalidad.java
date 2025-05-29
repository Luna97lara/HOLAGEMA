package com.domain;

public class AtributosPersonalidad {
    private EstiloHumor estiloHumor;
    private Empatia empatia;
    private LenguajeAmor lenguajeAmor;
    private TipoApego tipoApego;

    // Constructor vacío
    public AtributosPersonalidad() {}

    // Constructor completo
    public AtributosPersonalidad(EstiloHumor estiloHumor, Empatia empatia, LenguajeAmor lenguajeAmor, TipoApego tipoApego) {
        this.estiloHumor = estiloHumor;
        this.empatia = empatia;
        this.lenguajeAmor = lenguajeAmor;
        this.tipoApego = tipoApego;
    }

    // Getters y setters
    public EstiloHumor getEstiloHumor() {
        return estiloHumor;
    }

    public void setEstiloHumor(EstiloHumor estiloHumor) {
        this.estiloHumor = estiloHumor;
    }

    public Empatia getEmpatia() {
        return empatia;
    }

    public void setEmpatia(Empatia empatia) {
        this.empatia = empatia;
    }

    public LenguajeAmor getLenguajeAmor() {
        return lenguajeAmor;
    }

    public void setLenguajeAmor(LenguajeAmor lenguajeAmor) {
        this.lenguajeAmor = lenguajeAmor;
    }

    public TipoApego getTipoApego() {
        return tipoApego;
    }

    public void setTipoApego(TipoApego tipoApego) {
        this.tipoApego = tipoApego;
    }

    @Override
    public String toString() {
        return "Atributos de Personalidad: " +
                "Estilo de humor = " + estiloHumor +
                ", Empatía = " + empatia +
                ", Lenguaje del amor = " + lenguajeAmor +
                ", Tipo de apego = " + tipoApego;
    }
}
