/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author ahmad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Notifier notifier = new Notifier();
        Moderator moderator = new Moderator();
        ActivityTracker actTracker = new ActivityTracker();
        
        notifier.registerObserver(moderator);
        notifier.registerObserver(actTracker);
        
        String username, title, body;  
        LocalDateTime now;
       
        Scanner in = new Scanner(System.in);
        
        
        int choice;
        
        do {
            System.out.println("enter your choice:\n1- create post\n2-exis");
            choice = in.nextInt();
            switch(choice) {
            case 1 :
                System.out.println("Enter user name");
                in.nextLine();
                username = in.nextLine();
                System.out.println("Enter title");
                title = in.nextLine();
                System.out.println("Enter user body");
                body = in.nextLine();
                now = LocalDateTime.now();
                notifier.createPost(username, title, body, now);
                
                break;
            case 2:
                System.exit(0);
        }
            
        } while(true);  
    }
    
}
