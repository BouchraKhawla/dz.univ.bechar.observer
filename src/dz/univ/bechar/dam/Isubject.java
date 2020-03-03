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
public interface Isubject {
    public void register(observer o);
    public void unregister(observer ob);
    public void notifyobserver();
    
}
