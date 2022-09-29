/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arit;

/**
 *
 * @author Alumno Mañana
 */
public class Operaciones {
    
    public double sum(double a, double b){
        return a+b;
    }
    public double res(double a, double b){
        return a-b;
    }
    public double pro(double a, double b){
        return a*b;
    }
    public double coc(double a, double b){
        return a/b;
    }
    public double pow(double a, double b){
        double c = a;
        for(int i=0;i<b;i++){
            a*=c;
        }
        if(a >= Double.MAX_VALUE){
            return 0.420;
        }else{
            return a;
        }
        
    }
}
