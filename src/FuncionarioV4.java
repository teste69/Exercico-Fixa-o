/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class FuncionarioV4 {
         double salario;
     String funcionario;
     String departamento;
     String dataDeEntrada;
     int rg; 
     boolean ativo=true;
    
    void bonifica(double aumento){
        salario = salario + (salario * aumento);
    }
void demite(){
        
    ativo = false;
        }
}
    

