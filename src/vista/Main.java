/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author LENOVO
 */
public class Main {
    //1.- MÉTODO TRADUCTOR O INTERPRETE
    public static void main(String[] args) { //Todo se va a mostrar en la consola
        System.out.println("HOLA");
        //DECLARACIÓN DE LISTA.
        String[] listaDatos = new String[5];
        //VARIABLES
        System.out.println("DATOS DEL USUARIO:");
        String nombre="Michael";
        String apellido="Chasiguano";
        char inicial='M';
        String direccion="Ibarra";
        String correo="michael.chasiguano734@ist17dejulio.edu.ec";
        listaDatos[0]=nombre;
        listaDatos[1]=apellido;
        listaDatos[2]=direccion;
        listaDatos[3]=correo;
        
        System.out.println("1)"+listaDatos[0]);
        System.out.println("2)"+listaDatos[1]);
        System.out.println("3)"+listaDatos[2]);
        System.out.println("4)"+listaDatos[3]);
        System.out.println("5)"+listaDatos[4]);
        
        System.out.println("DATOS DEL USUARIO:");
        //VARIABLES
        String nombre1="Javier";
        String apellido1="Chasiguano";
        char inicial1='J';
        String direccion1="Urcuquí";
        String correo1="michael.chasiguano734@ist17dejulio.edu.ec";
    }
}
