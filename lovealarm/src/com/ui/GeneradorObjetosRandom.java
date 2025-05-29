package com.ui;
import com.domain.*;
import java.util.Random;

public class GeneradorObjetosRandom {
    private static final Random random = new Random();

    public static AtributosFisicos generarAtributosFisicos() {
        boolean sexo = random.nextBoolean();
        double altura = 150 + random.nextDouble() * 50; //altura entre 150-200 cm
        ColordeOjos ojos = ColordeOjos.values()[random.nextInt(ColordeOjos.values().length)];
        Etnicidad etnicidad = Etnicidad.values()[random.nextInt(Etnicidad.values().length)];
        return new AtributosFisicos(sexo, altura, ojos, etnicidad);
    }

    public static AtributosPersonalidad generarAtributosPersonalidad() {
        EstiloHumor estiloHumor = EstiloHumor.values()[random.nextInt(EstiloHumor.values().length)];
        Empatia empatia = Empatia.values()[random.nextInt(Empatia.values().length)];
        LenguajeAmor lenguajeAmor = LenguajeAmor.values()[random.nextInt(LenguajeAmor.values().length)];
        TipoApego tipoApego = TipoApego.values()[random.nextInt(TipoApego.values().length)];
        return new AtributosPersonalidad(estiloHumor, empatia, lenguajeAmor, tipoApego);
    }

    public static CriteriosBusqueda generarCriteriosBusqueda() {
        boolean generoDeseado = random.nextBoolean();
        double alturaMin = 150 + random.nextDouble() * 50;
        double alturaMax = 150 + random.nextDouble() * 50;
        ColordeOjos colorOjosDeseado = ColordeOjos.values()[random.nextInt(ColordeOjos.values().length)];
        Etnicidad etnicidadDeseada = Etnicidad.values()[random.nextInt(Etnicidad.values().length)];
        EstiloHumor estiloHumorDeseado = EstiloHumor.values()[random.nextInt(EstiloHumor.values().length)];
        Empatia empatiaDeseada = Empatia.values()[random.nextInt(Empatia.values().length)];
        LenguajeAmor lenguajeAmorDeseado = LenguajeAmor.values()[random.nextInt(LenguajeAmor.values().length)];
        TipoApego tipoApegoDeseado = TipoApego.values()[random.nextInt(TipoApego.values().length)];
        return new CriteriosBusqueda(generoDeseado, alturaMin, alturaMax, colorOjosDeseado, estiloHumorDeseado, empatiaDeseada, etnicidadDeseada, lenguajeAmorDeseado, tipoApegoDeseado);
    }
}
