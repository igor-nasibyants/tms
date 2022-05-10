package by.mycompany.ast.entity;

import java.io.Serializable;
import java.util.Objects;

public class Post implements Serializable {
    private String header;
    private String text;
    private User user;

    public Post() {
    }

    public Post(String header, String text, User user) {
        this.header = header;
        this.text = text;
        this.user = user;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post :" +
                " header = " + header +
                ", text = " + text +
                ", user = " + user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(header, post.header) && Objects.equals(text, post.text) && Objects.equals(user, post.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, text, user);
    }
}