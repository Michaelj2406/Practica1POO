/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LENOVO
 */
public class Usuario { //Da una estructura para USARLA DONDE QUIERA
    //PUBLICOS-->public: Acceso libre
    //PRIVADOS-->private:Acceso es posible solo para los miembros de la clase 
    //PROTEGIDOS-->protected:Si soy una subclase(hijo) puedo acceder a la informaci[on de la clase
    private String nombre;
    private String apellido;
    private char inicial;
    private String direccion;
    private String correo;
    
    //LLENAR O INICIALIZAR DATOS
    //MÉTODO VACÍO O CON ARGUMENTOS

    public Usuario() {//No es ni void ni class
    }

    public Usuario(String nombre, String apellido, char inicial, String direccion, String correo) {
        //puntero this: puntero es copiar el valor de la variable que están apuntando 
        //VARIABLES LOCALES
        this.nombre = nombre;
        this.apellido = apellido;
        this.inicial = inicial;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public void imprimirVoid(){ //No almacena en memoria, mostrar la información
        System.out.println("---------------DATOS DEL USUARIO:\n " + 
                "Nombre: "+ getNombre() +"\n"+ 
                "Apellido: "+ getApellido()+"\n"+
                "Inicial: "+ getInicial() +"\n"+ 
                "Dirección: "+ getDireccion()+ "\n" + 
                "Correo electrónico: "+ getCorreo());
    }    
        
    public String imprimir(){ //Almacena en memoria, guarda informacion
        return "----------DATOS DEL USUARIO:\n " + 
                "Nombre: "+ getNombre() +"\n"+ 
                "Apellido: "+ getApellido()+"\n"+
                "Inicial: "+ getInicial() +"\n"+ 
                "Dirección: "+ getDireccion()+ "\n" + 
                "Correo electrónico: "+ getCorreo();
    }
}
