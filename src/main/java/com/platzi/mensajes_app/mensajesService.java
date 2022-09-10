package com.platzi.mensajes_app;

import java.util.Scanner;

public class mensajesService {

    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.CrearMensajeDB(registro);

    }

    public static void listarMensajes(){
        MensajesDAO.LeerMensajesDB();
    }

    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensajeDB(id_mensaje);

    }

    public static void ediatrMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);

    }
}
