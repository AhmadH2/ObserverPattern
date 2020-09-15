/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.time.LocalDateTime;

/**
 *
 * @author ahmad
 */
public class Moderator implements IBlogObserver {
    private String userName;
    private String title;
    private String body;
    private LocalDateTime  date;

    @Override
    public void update(String userName, String title, String body, LocalDateTime date) {
        this.userName = userName;
        this.title = title;
        this.body = body;
        this.date = date;
        notifyModerator();
    }
    
    public void notifyModerator() {
        System.out.println("New post created:\nUser Name: " + userName + "\nTitle: "
        + title + "\nBody: " + body + "\nDate: " + date);    
    }

    
}
