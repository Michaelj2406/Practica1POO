/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Usuario;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Usuario[] listaUsuarios=new Usuario[10];
        int n=0;
        Scanner es=new Scanner(System.in);
        Usuario objeto0=new Usuario(); //ORGANIZAR EN CARPETAS A TRAVES DE LISTAS
        Usuario objeto1=new Usuario("Michael", "Chasiguano", 'M', "Ibarra", "michael.chasiguano734@ist17dejulio.edu.ec");
        Usuario objeto2=new Usuario("Javier", "García", 'J', "Urcuquí", "javiergarcía@ist17dejulio.edu.ec");
        Usuario objeto3=new Usuario("Daniel", "Goméz", 'D', "Piorato", "danielgoméz@ist17dejulio.edu.ec");
        Usuario objeto4=new Usuario("Alicia", "Burgos", 'A', "San Francisco", "aliciaburgos@ist17dejulio.edu.ec");
        Usuario objeto5=new Usuario("Melanie", "Sinmancas", 'M', "Santa Rosa", "melaniesinmancas@ist17dejulio.edu.ec");
        for (int i = 0; i < listaUsuarios.length; i++) { //For tradicional: Tiene indice i
            Usuario objeto=new Usuario(es.next(), es.next(),es.next().charAt(0), es.next(), es.next());
            listaUsuarios[i]=objeto0; 
            System.out.println(objeto.imprimir());
            String resultado=objeto.imprimir();
            if(resultado.isEmpty()){
                System.out.println("********"+resultado.charAt(1));
            }
            System.out.println("-------------RESULTADO---------"+resultado);
        }
    }
}
