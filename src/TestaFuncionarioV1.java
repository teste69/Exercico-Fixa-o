/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class TestaFuncionarioV1 {
    public static void main (String[] args){
        FuncionarioV1 F1 = new FuncionarioV1();
        F1.rg= "01328027915";
        F1.ativo=true;
        F1.departamento= "Pagamento";
        F1.funcionario= "Rodrigo";
        F1.salario=4000;
        
        F1.bonifica(6);
        System.out.println(F1.salario);
        
        F1.demite();
        System.out.println(F1.ativo);
        
    }
    
}
