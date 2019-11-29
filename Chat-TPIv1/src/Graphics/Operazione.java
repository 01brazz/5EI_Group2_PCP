/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

/**
 *
 * @author 18072
 */
public class Operazione {

    public double operation (String s){
        
        
        
        if (s.contains("-")){
            
            String[] parts = s.split("-");
        
        double op1 = Double.parseDouble(parts[0]);
        double op2 = Double.parseDouble(parts[1]);
        
        return op1 - op2;
            
        }
        
        else if(s.contains("+")){
            
            String[] parts = s.split("\\+");
        
        double op1 = Double.parseDouble(parts[0]);
        double op2 = Double.parseDouble(parts[1]);
        
        return op1 + op2;
        
        }
        
        else if(s.contains("*")){
            
            String[] parts = s.split("\\*");
        
        double op1 = Double.parseDouble(parts[0]);
        double op2 = Double.parseDouble(parts[1]);
        
        return op1 * op2;
        
        }
        
        else if(s.contains("/")){
            
            String[] parts = s.split("/");
        
        double op1 = Double.parseDouble(parts[0]);
        double op2 = Double.parseDouble(parts[1]);
        
        return op1 / op2;
        
        }
        
        else{
            
            return 0;
        }
        
            
    }
    // costruttore 
    public Operazione() {
        
    }


}

