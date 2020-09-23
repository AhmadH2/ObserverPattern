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
public class ActivityTracker implements IBlogObserver {

    @Override
    public void update(BlogPost post) {
        System.out.println("New post created: from activity tracker");
    }

}
