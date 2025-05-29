package com.domain;

public class CriteriosBusqueda {
    //atributos fisicos deseados:
    private boolean generoDeseado;
    private double alturaMin;
    private double alturaMax;
    private ColordeOjos colorOjosDeseado;

    //atributos personalidad deseados:
    private EstiloHumor estiloHumorDeseado;
    private Empatia empatiaDeseada;
    private Etnicidad etnicidadDeseada;
    private LenguajeAmor lenguajeAmorDeseado;
    private TipoApego tipoApegoDeseado;

    //constructores
    public CriteriosBusqueda() {}
    public CriteriosBusqueda (boolean generoDeseado, double alturaMin, double alturaMax, ColordeOjos colorOjosDeseado, EstiloHumor estiloHumorDeseado, Empatia empatiaDeseada, Etnicidad etnicidadDeseada, LenguajeAmor lenguajeAmorDeseado, TipoApego tipoApegoDeseado) {
        this.generoDeseado = generoDeseado;
        this.alturaMin = alturaMin;
        this.alturaMax = alturaMax;
        this.colorOjosDeseado = colorOjosDeseado;
        this.estiloHumorDeseado = estiloHumorDeseado;
        this.empatiaDeseada = empatiaDeseada;
        this.etnicidadDeseada = etnicidadDeseada;
        this.lenguajeAmorDeseado = lenguajeAmorDeseado;
        this.tipoApegoDeseado = tipoApegoDeseado;
    }

    //getters y setters
    public boolean isGeneroDeseado() {
        return generoDeseado;
    }
    public void setGeneroDeseado(boolean generoDeseado) {
        this.generoDeseado = generoDeseado;
    }
    public double getAlturaMin() {
        return alturaMin;
    }
    public void setAlturaMin(double alturaMin) {
        this.alturaMin = alturaMin;
    }
    public double getAlturaMax() {
        return alturaMax;
    }
    public void setAlturaMax(double alturaMax) {
        this.alturaMax = alturaMax;
    }
    public ColordeOjos getColorOjosDeseado() {
        return colorOjosDeseado;
    }
    public EstiloHumor getEstiloHumorDeseado() {
        return estiloHumorDeseado;
    }
    public Empatia getEmpatiaDeseada() {
        return empatiaDeseada;
    }
    public Etnicidad getEtnicidadDeseada() {
        return etnicidadDeseada;
    }
    public LenguajeAmor getLenguajeAmorDeseado() {
        return lenguajeAmorDeseado;
    }
    public TipoApego getTipoApegoDeseado() {
        return tipoApegoDeseado;
    }


}
