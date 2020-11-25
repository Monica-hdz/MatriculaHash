/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.palmartec.matriculahash;

/**
 *
 * @author USER-PC
 */
public class Hash {
    
    public int hashSimple(String matricula){
        int result = 0;
        for (int i = 0; i < matricula.length(); i++) {
            result += Integer.parseInt(String.valueOf(matricula.charAt(i)));
        }
        return result;
    }
    
    public int checkDigit(String matricula){
        int div;
        int suma = hashSimple(matricula);
        
        if(suma <= 19){
            div = 0;
        }else if(suma >= 20 && suma<=29){
            div = 1;
        }else{
            div = 2;
        }
        
        return div;
    }
    
    public String studentGrade(String matricula){
        String result;
        int sumaTotal = 0;
        
        String suma = String.valueOf(hashSimple(matricula));
        for (int i = 0; i < suma.length(); i++) {
            sumaTotal += Integer.parseInt(String.valueOf(suma.charAt(i)));
        }
        
        System.out.println(sumaTotal);
        if(sumaTotal <= 6){
            result = "Reprobado";
        }else if(sumaTotal >= 7 && sumaTotal<=9){
            result = "Aprobado";
        }else{
            result = "Excelente";
        }
        
        System.out.println(result);
        return result;
    }
}