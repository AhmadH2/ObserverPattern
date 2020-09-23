/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author ahmad
 */
public interface IBlogNotifier {
    public void registerObserver(IBlogObserver o);
    public void unRegisterObserver(IBlogObserver o);
    public void notifyObservers(BlogPost post);
}
