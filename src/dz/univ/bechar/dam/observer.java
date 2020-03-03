/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univ.bechar.dam;

/**
 *
 * @author Hp
 */
public  class observer {
       private static observer obs=null;
     observer (){
     System.out.println("je sius le capitian");}
     public static observer khawla(){
         if(obs ==null){
          obs=new observer();    
         }
         return  obs;
     }    
    public void update(){
        System.out.println("updated");
        
    }

    
}
