package com.gitHub.maikoncarlos.desafio.dominio;

public class Course extends Content {
    private int duration;
    @Override
    public double calcularXp() {
        return XP_STANDARD * duration;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", duration=" + duration +
                '}';
    }

}
