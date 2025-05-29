

package com.service;
import com.domain.AtributosFisicos;
import com.domain.AtributosPersonalidad;
import com.domain.CriteriosBusqueda;
import com.domain.User;

public class Compatibilidad {
   public static int calcularCompatibilidad(User buscador, User candidato) {
       CriteriosBusqueda criterios = buscador.getCriteriosBusqueda();
       AtributosFisicos fisicos = candidato.getAtributosFisicos();
       AtributosPersonalidad personalidad = candidato.getAtributosPersonalidad();

       int score=0;

       if(fisicos.isSexo() == criterios.isGeneroDeseado()) score+=15;
       if (fisicos.getAltura() >= criterios.getAlturaMin() && fisicos.getAltura() <= criterios.getAlturaMax()) score+=15;
       if (fisicos.getColordeOjos() == criterios.getColorOjosDeseado()) score+=10;
       if (fisicos.getEtnicidad() == criterios.getEtnicidadDeseada()) score+=10;

       if (personalidad.getEstiloHumor() == criterios.getEstiloHumorDeseado()) score+=15;
       if (personalidad.getEmpatia() == criterios.getEmpatiaDeseada()) score+=10;
       if (personalidad.getLenguajeAmor() == criterios.getLenguajeAmorDeseado()) score+=15;
       if (personalidad.getTipoApego() == criterios.getTipoApegoDeseado()) score+=10;

       return score; //de 0 a 100




   }
}