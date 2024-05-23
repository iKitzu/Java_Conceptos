/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraccion;

/**
 *
 * @author Usuario
 */
public class Rectangulo extends FiguraGeometrica {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = 2;
        this.alto = 2;
    }

    @Override
    public double area() {
        return ancho * alto;
    }

    @Override
    public double perimetro() {
        return 2 * (ancho + alto);
    }
}
