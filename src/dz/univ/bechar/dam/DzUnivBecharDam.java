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
public class DzUnivBecharDam {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       observer obj1=new observer();
        observer obj2=new observer();
         observer obj3=new observer();
         subject  a3 = new subject();
        a3.register(obj1);
         a3.register(obj2);
         a3.register(obj3);
          a3.setflog(6);
        
    
    
}}
