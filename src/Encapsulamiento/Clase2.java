/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento;

/**
 *
 * @author camper
 */
public class Clase2 {
    
    public static void main (String[] args){
        Clase1 objeto1=new Clase1();
        //
        objeto1.setEdad(10);
        System.out.println("La edad es: "+objeto1.getEdad());
        
        objeto1.setNombre("Pedrito");
        System.out.println("El nombre es: "+objeto1.getNombre());
    }
    
}
