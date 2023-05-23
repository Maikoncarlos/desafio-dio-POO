package com.gitHub.maikoncarlos.desafio.dominio;

public class Course {
    private String title;
    private String description;
    private int duration;

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}