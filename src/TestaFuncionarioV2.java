/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class TestaFuncionarioV2 {
    public static void main(String[]args){
        
        FuncionarioV2 F2= new FuncionarioV2();
        F2.rg= "01328023695";
        F2.ativo=true;
        F2.departamento= "Pagamento";
        F2.funcionario = "Ricardo";
        F2.salario=8000;
        
        F2.bonifica(6);
        System.out.println(F2.salario);
        
        F2.demite();
        System.out.println(F2.ativo);
    }
    
}
