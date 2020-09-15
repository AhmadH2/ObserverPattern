/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ahmad
 */
public class Notifier implements IBlogNotifier {
    private String userName;
    private String title;
    private String body;
    private LocalDateTime  date;
    
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
    public void notifyObservers() {
        for (IBlogObserver o : observers){
            o.update(userName, title, body, date);
        }
    }
    
    public void createPost(String userName, String title, String body, LocalDateTime date) {
        this.userName = userName;
        this.title = title;
        this.body = body;
        this.date = date;
        notifyObservers();
    }
    
}
