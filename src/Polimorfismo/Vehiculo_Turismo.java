/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author camper
 */

public class Vehiculo_Turismo extends Vehiculo {
    
    private int nPuertas;
    
    public Vehiculo_Turismo(int nPuertas, String matricula, String marca, String modelo){
        super(matricula, marca, modelo);
        this.nPuertas=nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+
        "\nMarca: "+marca+
        "\nModelo: "+modelo+
         "\nNumero de Puertas: "+nPuertas;
    }
}
