/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class Testapessoa {
    
    public static void main(String[]args){
        
        Pessoa p1=new Pessoa();
        p1.nome="Rodrigo";
        p1.idade=38;

        p1.fazAniversario();
        System.out.println(p1.nome+"  "+p1.idade+ "..");
    }
    
}
