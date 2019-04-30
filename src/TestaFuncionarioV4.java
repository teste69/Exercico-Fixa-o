/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class TestaFuncionarioV4 {
    public static void main(String[]args){
        FuncionarioV4 F4 = new FuncionarioV4();
        F4.rg= 985280;
        F4.ativo=true;
        F4.departamento= "Vendas";
        F4.funcionario = "Reiner";
        F4.salario=7000;
        
        F4.bonifica(6);
        System.out.println(F4.salario);
        
        F4.demite();
        System.out.println(F4.ativo);
    }
    
}

    
}