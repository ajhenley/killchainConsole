package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Gamestate {
    private String score;
    private String server;
    private String status;

    public Gamestate() {
    }

    public Gamestate(String score, String server, String status) {
        this.score = score;
        this.server = server;
        this.status = status;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Gamestate{" +
                "score='" + score + '\'' +
                ", server='" + server + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
