/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figuras2;

/**
 *
 * @author usuario
 */
public class Trapecio {
    public static double calcularArea(double altura, double basemenor, double basemayor){
        return altura*((basemenor+basemayor)/2);
    }
  
    public static double calcularPerimetro(double altura, double basemenor, double basemayor){
        double ladosobrante, HipotenusaTrap;
        ladosobrante = (basemayor-basemenor)/2;
        HipotenusaTrap = Math.sqrt(Math.pow(altura, 2)+Math.pow(ladosobrante,2));
        return HipotenusaTrap*2+basemenor+basemayor;
    }
    
}
