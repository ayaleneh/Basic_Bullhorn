package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Bullhorn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min = 3,max = 20)
    private String title;
    @NotNull
    @Size(min = 10,max = 200)
    private String content;
    @NotNull
    @Size(min = 5,max = 20)
    private String postedDate;
    @NotNull
    @Size(min = 1,max = 20)
    private String postedBy;

    public Bullhorn() {
    }

    public Bullhorn(@NotNull @Size(min = 3, max = 20) String title, @NotNull @Size(min = 10, max = 200) String content, @NotNull @Size(min = 5, max = 20) String postedDate, @NotNull @Size(min = 1, max = 20) String postedBy) {
        this.title = title;
        this.content = content;
        this.postedDate = postedDate;
        this.postedBy = postedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }
}
