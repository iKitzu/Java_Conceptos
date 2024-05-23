/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Circulo(5.0);
        FiguraGeometrica figura2 = new Rectangulo(4.0, 6.0);

        System.out.println("Área del círculo: " + figura1.area());
        System.out.println("Perímetro del círculo: " + figura1.perimetro());

        System.out.println("Área del rectángulo: " + figura2.area());
        System.out.println("Perímetro del rectángulo: " + figura2.perimetro());
    }
}
