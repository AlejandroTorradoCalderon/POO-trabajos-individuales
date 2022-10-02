package com.mycompany.cap4ej10;

public class calculo {
    public static double calculo_de_pago(double pat, double est){
        if ((pat>2000000 && est>3)){
            return 0.03*pat +50000;
        }
        else{
            return 50000;
        }
        
        
    }
}
    
        
	   
 

    

