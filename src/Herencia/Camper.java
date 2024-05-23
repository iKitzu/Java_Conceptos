/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author camper
 */
public class Camper extends Persona {
    
    private int numeroDocumento;
    private String jornada;
    
    
    // Constructor
    public Camper(String nombre,String apellido,int edad,int numeroDocumento,String jornada){
        
        super(nombre, apellido, edad);
        
        this.numeroDocumento=numeroDocumento;
        this.jornada=jornada;
        
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApelldio: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nNumero de documento: "+numeroDocumento+
                "\nJornada: "+jornada);
    }
    
}
