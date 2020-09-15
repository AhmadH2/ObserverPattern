/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author ahmad
 */
public class ActivityTracker implements IBlogObserver {
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
        savePost();
    }
    
    private void savePost() {
        System.out.println("post saved successfully!");    
    }

    
}
