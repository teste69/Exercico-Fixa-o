/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class TestaFuncionarioV3 {
    public static void main(String[]args){
        FuncionarioV3 F3= new FuncionarioV3();
        F3.rg= 98528023;
        F3.ativo=true;
        F3.departamento= "Vendas";
        F3.funcionario = "Renato";
        F3.salario=7000;
        
        F3.bonifica(6);
        System.out.println(F3.salario);
        
        F3.demite();
        System.out.println(F3.ativo);
    }
    
}
