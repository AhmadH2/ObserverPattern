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
public interface IBlogObserver {
     public void update(String userName, String title, String body, LocalDateTime date);

}
