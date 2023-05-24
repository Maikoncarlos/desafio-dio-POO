package com.gitHub.maikoncarlos.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;

    @Override
    public double calcularXp() {
        return XP_STANDARD + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setNow_date(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", now_date=" + date +
                '}';
    }

}
