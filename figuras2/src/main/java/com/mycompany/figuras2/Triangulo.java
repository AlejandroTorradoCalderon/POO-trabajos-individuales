/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras2;

/**
 *
 * @author usuario
 */
public class Triangulo {
    public static double calcularArea(double base, double altura){
        return (base*altura)/2;
    }
    
    public static double calcularPerimetro(double base, double altura){
        double hipotenusatriangulo;
        hipotenusatriangulo = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        return base+altura+hipotenusatriangulo;
    }
   
    public static String clasificarTriangulo(double base, double altura){
        double hipotenusatriangulo;
        hipotenusatriangulo = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        if(base==altura && altura==hipotenusatriangulo && base==hipotenusatriangulo){
              return "Triángulo equilatero";
        }
        else if(base!=altura && altura!=hipotenusatriangulo && base!=hipotenusatriangulo){
            return"Triangulo escaleno";
        }
        else{
            return "Triangulo isosceles";
        }
    
}}
