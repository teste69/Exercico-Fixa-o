/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class Casa {
    String cor;
    Porta porta1, porta2, porta3;
    
    void pinta (String s){
        this.cor=s;
    }
    
    
         
    int quantasPortasEstaoAbertas(){
    int cont1=0;
     if(this.porta1 . aberta==true){cont1++;}
     if(this.porta2 . aberta==true){cont1++;}
     if(this.porta3 . aberta==true){cont1++;}
     return cont1;
    }
}
