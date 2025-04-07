package fr.ensai.running.model;

import java.time.LocalDate;

public class Competition {

    private long idCompetition;
    private String designation;
    private String city;
    private LocalDate eventDate;
    private float distance;
    private int maxAthletes;

    // Getters et setters
    public long getIdCompetition() {
        return idCompetition;
    }

    public void setIdCompetition(long idCompetition) {
        this.idCompetition = idCompetition;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getMaxAthletes() {
        return maxAthletes;
    }

    public void setMaxAthletes(int maxAthletes) {
        this.maxAthletes = maxAthletes;
    }
}
