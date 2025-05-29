package com.ui;
import com.domain.*;
import java.util.Scanner;

public class FormularioUsuario {
    public static User createUser() {
        Scanner sc = new Scanner(System.in);
        //Nombre:
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        //Correo
        String correo;
        do {
            System.out.print("Introduce tu correo: ");
            correo = sc.nextLine();
            if (!Validador.correoValido(correo)) {
                System.out.println("Correo no válido. Inténtelo de nuevo");
            }
        } while (!Validador.correoValido(correo));

        //Contraseña:
        System.out.print("Introduce tu contraseña: ");
        String contrasena = sc.nextLine();

        //Edad:
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        //Género:
        System.out.print("¿Eres hombre? (true/false): ");
        boolean genero = sc.nextBoolean();
        sc.nextLine();

        //Altura
        System.out.print("Introduce tu altura en cm: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        //Color de ojos
        System.out.println("Selecciona tu color de ojos");
        for (ColordeOjos color : ColordeOjos.values()) {
            System.out.println("- " + color);
        }
        System.out.print("Escribe uno: ");
        ColordeOjos colordeOjos = ColordeOjos.valueOf(sc.nextLine().toUpperCase());

        //Etnicidad
        System.out.println("Selecciona tu etnicidad: ");
        for (Etnicidad etnicidad : Etnicidad.values()) {
            System.out.println("- " + etnicidad);
        }
        System.out.print("Escribe una: ");
        Etnicidad etnicidad = Etnicidad.valueOf(sc.nextLine().toUpperCase());

        AtributosFisicos atributosFisicos = new AtributosFisicos(genero, altura, colordeOjos, etnicidad);

        //Estilo de humor:
        System.out.println("Selecciona un estilo de humor: ");
        for (EstiloHumor estiloHumor : EstiloHumor.values()) {
            System.out.println("- " + estiloHumor);
        }
        System.out.print("Escribe uno: ");
        EstiloHumor estiloHumor = EstiloHumor.valueOf(sc.nextLine().toUpperCase());

        //Empatía:
        System.out.println("Selecciona tu nivel de empatía: ");
        for (Empatia empatia : Empatia.values()) {
            System.out.println("- " + empatia);
        }
        System.out.print("Escribe uno: ");
        Empatia empatia = Empatia.valueOf(sc.nextLine().toUpperCase());

        //Lenguaje de amor
        System.out.println("Selecciona tu lenguaje de amor más destacado: ");
        for (LenguajeAmor lenguajeAmor : LenguajeAmor.values()) {
            System.out.println("- " + lenguajeAmor);
        }
        System.out.print("Escribe uno: ");
        LenguajeAmor lenguajeAmor = LenguajeAmor.valueOf(sc.nextLine().toUpperCase());

        //Tipo de apego
        System.out.println("Selecciona tu tipo de apego: ");
        for (TipoApego tipoApego : TipoApego.values()) {
            System.out.println("- " + tipoApego);
        }
        System.out.print("Escribe uno: ");
        TipoApego tipoApego = TipoApego.valueOf(sc.nextLine().toUpperCase());

        AtributosPersonalidad atributosPersonalidad = new AtributosPersonalidad(estiloHumor, empatia, lenguajeAmor, tipoApego);

        //Ahora preguntamos por los criterios de búsqueda del usuario:
        //Género deseado:
        System.out.println("¿Estás interesado en en género masculino? (true/false) ");
        boolean generoDeseado = sc.nextBoolean();
        sc.nextLine();

        //Rango de altura
        System.out.print("¿Cuál es tu altura mínima ideal en el otro?: ");
        double alturaMin = sc.nextDouble();
        sc.nextLine();
        System.out.print("¿Cuál es tu altura máxima ideal en el otro?: ");
        double alturaMax = sc.nextDouble();
        sc.nextLine();

        //Color de ojos
        System.out.println("¿Qué color de ojos prefieres?: ");
        for (ColordeOjos colorOjosDeseado : ColordeOjos.values()) {
            System.out.println("- " + colorOjosDeseado);
        }
        System.out.print("Escribe uno: ");
        ColordeOjos colorOjosDeseado = ColordeOjos.valueOf(sc.nextLine().toUpperCase());

        //Etnicidad:
        System.out.println("Selecciona una etnicidad: ");
        for (Etnicidad etnicidadDeseada : Etnicidad.values()) {
            System.out.println("- " + etnicidadDeseada);
        }
        System.out.print("Escribe una: ");
        Etnicidad etnicidadDeseada = Etnicidad.valueOf(sc.nextLine().toUpperCase());

        //Estilo de humor:
        System.out.println("Selecciona un estilo de humor: ");
        for (EstiloHumor estiloHumorDeseado : EstiloHumor.values()) {
            System.out.println("- " + estiloHumorDeseado);
        }
        System.out.print("Escribe uno: ");
        EstiloHumor estiloHumorDeseado = EstiloHumor.valueOf(sc.nextLine().toUpperCase());

        //Empatía
        System.out.println("Selecciona un nivel de empatia: ");
        for (Empatia empatiaDeseada : Empatia.values()) {
            System.out.println("- " + empatiaDeseada);
        }
        System.out.print("Escribe una: ");
        Empatia empatiaDeseada = Empatia.valueOf(sc.nextLine().toUpperCase());

        //Lenguaje de amor:
        System.out.println("Selecciona un tipo de lenguaje de amor: ");
        for (LenguajeAmor lenguajeAmorDeseado : LenguajeAmor.values()) {
            System.out.println("- " + lenguajeAmorDeseado);
        }
        System.out.print("Escribe uno: ");
        LenguajeAmor lenguajeAmorDeseado = LenguajeAmor.valueOf(sc.nextLine().toUpperCase());

        //Tipo de apego:
        System.out.println("Selecciona un tipo de apego: ");
        for (TipoApego tipoApegoDeseado : TipoApego.values()) {
            System.out.println("- " + tipoApegoDeseado);
        }
        System.out.print("Escribe uno: ");
        TipoApego tipoApegoDeseado = TipoApego.valueOf(sc.nextLine().toUpperCase());

        CriteriosBusqueda criteriosBusqueda = new CriteriosBusqueda();

        //Crear usuario
        User user = new User(nombre, correo, contrasena, edad, genero, atributosFisicos, atributosPersonalidad, criteriosBusqueda);

        //Mostrar usuario creado:
        System.out.println("\nUsuario creado:");
        System.out.println(user);

        return new User(nombre, correo, contrasena, edad, genero, atributosFisicos, atributosPersonalidad, criteriosBusqueda);
    }
}
