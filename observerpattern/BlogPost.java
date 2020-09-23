package observerpattern;

import java.time.LocalDateTime;

public class BlogPost{
    private String userName;
    private String title;
    private String body;
    private LocalDateTime date;

    public BlogPost(String userName, String title, String body, LocalDateTime date) {
        this.userName = userName;
        this.title = title;
        this.body = body;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
