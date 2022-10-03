/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cap3ej19;

/**
 *
 * @author usuario
 */
public class Triangulo {
    public static double calcular_perimetro(double lado){
        double perimetro;
        perimetro = lado * 3;
        return perimetro;
    }
    
    public static double calcular_altura(double lado){
        double altura;
        altura = (lado * Math.sqrt(3))/2;
        return altura;
    }
    
    public static double calcular_area(double lado){
        double area;
        area = (Math.pow(lado,2) * Math.sqrt(3))/4;
        return area;
    }
    
    
}
