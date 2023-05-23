package com.gitHub.maikoncarlos.desafio.dominio;

import java.time.LocalDate;

public class Mentoring {

    private String title;
    private String description;
    private LocalDate now_date;

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", now_date=" + now_date +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getNow_date() {
        return now_date;
    }

    public void setNow_date(LocalDate now_date) {
        this.now_date = now_date;
    }
}
