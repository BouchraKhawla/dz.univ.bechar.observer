/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univ.bechar.dam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class subject implements Isubject {

    int flog;

    List<observer> observers = new ArrayList<observer>();

    public int getflog() {
        return flog;
    }

    public void setflog(int flog) {
        this.flog = flog;

        notifyObservers();
    }

    public void register(observer obj1) {
        observers.add(obj1);
    }

    @Override
    public void unregister(observer obj) {
        observers.remove(obj);
    }

    public void notifyObservers() {

        for (observer observer : observers) {
            observer.update();

        }
    }

    @Override
    public void notifyobserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
