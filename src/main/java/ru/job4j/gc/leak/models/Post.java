package ru.job4j.gc.leak.models;

import java.util.List;
import java.util.Objects;

public class Post {
    private int id;

    private String text;

    private List<Comment> comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Post post = (Post) o;
        return Objects.equals(text, post.text)
                && Objects.equals(comments, post.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, comments);
    }

    @Override
    public String toString() {
        return String.format("Post{id='%s, text=%s, comments=%s}", id, text, comments);
    }
}
