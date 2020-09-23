/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author ahmad
 */
public class Notifier implements IBlogNotifier {

    private ArrayList<IBlogObserver> observers;
    
    public Notifier() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(IBlogObserver o) {
        observers.add(o);
    }

    @Override
    public void unRegisterObserver(IBlogObserver o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers(BlogPost post) {
        for (IBlogObserver o : observers){
            o.update(post);
        }
    }
    
}
