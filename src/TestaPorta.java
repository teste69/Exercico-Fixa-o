/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class TestaPorta {
    public static void main(String[] args){
    Porta P1=new Porta();
    P1.aberta=false;
    P1.cor="marrom";
    P1.dx=5;
    P1.dy=40;
    P1.dz=0.2;
    
    System.out.println(P1.estaAberta());
    P1.abre();
    System.out.println(P1.estaAberta());
    P1.fecha();
    System.out.println(P1.estaAberta());
    P1.pinta("Arcos iris");
    System.out.println("Cor; "+P1.cor+"\n Dimensoes: "+P1.dx+"x"+P1.dy+"x"+P1.dz);
}  
    
    
}
