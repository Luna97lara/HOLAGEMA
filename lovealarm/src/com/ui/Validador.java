package com.ui;
import java.util.regex.Pattern; //Define la expresión regular que vamos a usar
import java.util.regex.Matcher; //Aplica esta expresión al texto y compara

public class Validador {
     private static final String EMAIL_REGEX = "^[\\w-\\.]+@[\\w-\\.]+\\.[a-zA-Z]{2,}$";
     private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

     public static boolean correoValido(String correo) {
         Matcher matcher = EMAIL_PATTERN.matcher(correo);
         return matcher.matches();
     }
}
