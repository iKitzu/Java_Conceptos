/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author camper
 */
public class Impresora {

    // Método para imprimir un entero
    public void imprimir(int numero) {
        System.out.println("Número entero: " + numero);
    }

    // Sobrecarga del método imprimir para imprimir una cadena de texto
    public void imprimir(String texto) {
        System.out.println("Texto: " + texto);
    }

    // Sobrecarga del método imprimir para imprimir un número decimal
    public void imprimir(double numero) {
        System.out.println("Número decimal: " + numero);
    }

    // Sobrecarga del método imprimir para imprimir un booleano
    public void imprimir(boolean valor) {
        System.out.println("Valor booleano: " + valor);
    }

    public static void main(String[] args) {
        Impresora impresora = new Impresora();

        // Uso del primer método imprimir(int numero)
        impresora.imprimir(13);

        // Uso del segundo método imprimir(String texto)
        impresora.imprimir("Hola pedrito!");

        // Uso del tercer método imprimir(double numero)
        impresora.imprimir(3.1416);

        // Uso del cuarto método imprimir(boolean valor)
        impresora.imprimir(true);
    }
}
