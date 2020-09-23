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
public class Moderator implements IBlogObserver {

    @Override
    public void update(BlogPost post) {
        System.out.println("New post created:\nUser Name: " + post.getUserName() + "\nTitle: "
                + post.getTitle() + "\nBody: " + post.getBody() + "\nDate: " + post.getDate());
    }

    
}
