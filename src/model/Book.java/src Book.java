Nama : Putri Nadia Sudartomo
Nim  : 13020210003


package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class Book {

    private int id;
    private String authorName;
    private String title;

    public Book(String title, String authorName) {
        this.title = title;
        this.authorName = authorName;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
