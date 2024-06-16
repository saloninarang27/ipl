package com.example.IPLDataReader.Modules;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

import java.util.List;
@Entity
@ToString


public class Bowler {
    @Id
    private int id;
    private int Innings;
    private int Balls;
    private int Wickets;
    private int Maidens;
    private List<String> BestFigure;
    private double Economy;

    public Bowler(int id, int innings, int balls, int wickets, List<String> bestFigure, double economy,int maidens) {
        this.id = id;
        Innings = innings;
        Balls = balls;
        Wickets = wickets;
        BestFigure = bestFigure;
        Economy = economy;
        Maidens=maidens;
    }

    public Bowler() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaidens() {
        return Maidens;
    }

    public void setMaidens(int maidens) {
        Maidens = maidens;
    }

    public int getInnings() {
        return Innings;
    }

    public void setInnings(int innings) {
        Innings = innings;
    }

    public int getBalls() {
        return Balls;
    }

    public void setBalls(int balls) {
        Balls = balls;
    }

    public int getWickets() {
        return Wickets;
    }

    public void setWickets(int wickets) {
        Wickets = wickets;
    }

    public List<String> getBestFigure() {
        return BestFigure;
    }

    public void setBestFigure(List<String> bestFigure) {
        BestFigure = bestFigure;
    }

    public double getEconomy() {
        return Economy;
    }

    public void setEconomy(double economy) {
        Economy = economy;
    }
}