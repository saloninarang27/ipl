package com.example.IPLDataReader.Modules;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@ToString
@Entity
public class Batsman {
    @Id
    private int id;
    private String Name;
    //private List<String> Teams;
    private Set<String> Teams;
    private int Matches;

    private int runs;
    private int Highest;
    private int HalfCentury;
    private int Century;

    public Batsman(int id, String name, Set<String> teams, int matches,  int runs, int highest, int halfCentury, int century) {
        this.id = id;
        Name = name;
        Teams = teams;
        Matches = matches;

        this.runs = runs;
        Highest = highest;
        HalfCentury = halfCentury;
        Century = century;
    }

    public Batsman() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Set<String> getTeams() {
        return Teams;
    }

    public void setTeams(Set<String> teams) {
        Teams = teams;
    }

    public int getMatches() {
        return Matches;
    }

    public void setMatches(int matches) {
        Matches = matches;
    }



    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHighest() {
        return Highest;
    }

    public void setHighest(int highest) {
        Highest = highest;
    }

    public int getHalfCentury() {
        return HalfCentury;
    }

    public void setHalfCentury(int halfCentury) {
        HalfCentury = halfCentury;
    }

    public int getCentury() {
        return Century;
    }

    public void setCentury(int century) {
        Century = century;
    }
}