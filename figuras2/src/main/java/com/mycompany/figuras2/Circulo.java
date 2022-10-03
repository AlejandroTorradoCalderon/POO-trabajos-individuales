/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras2;

/**
 *
 * @author usuario
 */
public class Circulo {
    public static double calcularArea(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
    public static double calcularPerimetro(double radio){
        return 2*Math.PI*radio;
    }
}
