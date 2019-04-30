/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class Temperatura {
        double converteParaCelsius(double fahrenheit){
        double resultado;
        resultado = (fahrenheit - 32) * (5.0/9);
        return resultado;
    }
double coverterParaFahrenheit(double Celsius){
    double resultado; 
    resultado = (Celsius * 9/5)+ 32;
    return resultado;
    
}
}
    


    

