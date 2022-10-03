
package com.mycompany.cap4ej23;

public class cuadratica {
    public static String calculo_cuadratica(double A, double B, double C){
        double ecuacion1, ecuacion2;
        if (A==0){
            return "No es cuadratica";
        }
        else if ((Math.pow(B, 2)-4*A*C)<0){
            return "Valores complejos";
        }
        else if ((Math.pow(B, 2)-4*A*C)==0){
            return String.valueOf("X₁ = "+-B/2*A);
        }
        else {
            ecuacion1=-B+Math.sqrt((Math.pow(B, 2)-4*A*C))/2*A;
            ecuacion2=-B-Math.sqrt((Math.pow(B, 2)-4*A*C))/2*A;
            return String.valueOf("X₁ = "+String.format("%.5f",ecuacion1)+  "  X₂ = "+String.format("%.5f",ecuacion2));
            
        }
    }   
}
