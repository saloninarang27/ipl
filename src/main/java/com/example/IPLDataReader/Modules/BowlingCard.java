package com.example.IPLDataReader.Modules;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.ToString;

import java.util.List;

@Entity
@ToString


public class BowlingCard {
    @Id
    private int MatchId;
    private String Team1;
    private List<String> Team1_Bowlers_List;
    private List<String>Team1_Overs_List;
    private List<Integer>Team1_Wickets_List;
    private List<Integer>Team1_Runs_List;
    private List<Integer>Team1_Maidens_List;
    private List<String>Team1_Economy_List;

    private String Team2;
    private List<String> Team2_Bowlers_List;
    private List<String>Team2_Overs_List;
    private List<Integer>Team2_Wickets_List;
    private List<Integer>Team2_Runs_List;
    private List<Integer>Team2_Maidens_List;
    private List<String>Team2_Economy_List;

    public BowlingCard(int matchId, String team1, List<String> team1_Bowlers_List, List<String> team1_Overs_List, List<Integer> team1_Wickets_List, List<Integer> team1_Runs_List, List<Integer> team1_Maidens_List, List<String> team1_Economy_List, String team2, List<String> team2_Bowlers_List, List<String> team2_Overs_List, List<Integer> team2_Wickets_List, List<Integer> team2_Runs_List, List<Integer> team2_Maidens_List, List<String> team2_Economy_List) {
        MatchId = matchId;
        Team1 = team1;
        Team1_Bowlers_List = team1_Bowlers_List;
        Team1_Overs_List = team1_Overs_List;
        Team1_Wickets_List = team1_Wickets_List;
        Team1_Runs_List = team1_Runs_List;
        Team1_Maidens_List = team1_Maidens_List;
        Team1_Economy_List = team1_Economy_List;
        Team2 = team2;
        Team2_Bowlers_List = team2_Bowlers_List;
        Team2_Overs_List = team2_Overs_List;
        Team2_Wickets_List = team2_Wickets_List;
        Team2_Runs_List = team2_Runs_List;
        Team2_Maidens_List = team2_Maidens_List;
        Team2_Economy_List = team2_Economy_List;
    }

    public BowlingCard() {
    }

    public int getMatchId() {
        return MatchId;
    }

    public void setMatchId(int matchId) {
        MatchId = matchId;
    }

    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public List<String> getTeam1_Bowlers_List() {
        return Team1_Bowlers_List;
    }

    public void setTeam1_Bowlers_List(List<String> team1_Bowlers_List) {
        Team1_Bowlers_List = team1_Bowlers_List;
    }

    public List<String> getTeam1_Overs_List() {
        return Team1_Overs_List;
    }

    public void setTeam1_Overs_List(List<String> team1_Overs_List) {
        Team1_Overs_List = team1_Overs_List;
    }

    public List<Integer> getTeam1_Wickets_List() {
        return Team1_Wickets_List;
    }

    public void setTeam1_Wickets_List(List<Integer> team1_Wickets_List) {
        Team1_Wickets_List = team1_Wickets_List;
    }

    public List<Integer> getTeam1_Runs_List() {
        return Team1_Runs_List;
    }

    public void setTeam1_Runs_List(List<Integer> team1_Runs_List) {
        Team1_Runs_List = team1_Runs_List;
    }

    public List<Integer> getTeam1_Maidens_List() {
        return Team1_Maidens_List;
    }

    public void setTeam1_Maidens_List(List<Integer> team1_Maidens_List) {
        Team1_Maidens_List = team1_Maidens_List;
    }

    public List<String> getTeam1_Economy_List() {
        return Team1_Economy_List;
    }

    public void setTeam1_Economy_List(List<String> team1_Economy_List) {
        Team1_Economy_List = team1_Economy_List;
    }

    public String getTeam2() {
        return Team2;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }

    public List<String> getTeam2_Bowlers_List() {
        return Team2_Bowlers_List;
    }

    public void setTeam2_Bowlers_List(List<String> team2_Bowlers_List) {
        Team2_Bowlers_List = team2_Bowlers_List;
    }

    public List<String> getTeam2_Overs_List() {
        return Team2_Overs_List;
    }

    public void setTeam2_Overs_List(List<String> team2_Overs_List) {
        Team2_Overs_List = team2_Overs_List;
    }

    public List<Integer> getTeam2_Wickets_List() {
        return Team2_Wickets_List;
    }

    public void setTeam2_Wickets_List(List<Integer> team2_Wickets_List) {
        Team2_Wickets_List = team2_Wickets_List;
    }

    public List<Integer> getTeam2_Runs_List() {
        return Team2_Runs_List;
    }

    public void setTeam2_Runs_List(List<Integer> team2_Runs_List) {
        Team2_Runs_List = team2_Runs_List;
    }

    public List<Integer> getTeam2_Maidens_List() {
        return Team2_Maidens_List;
    }

    public void setTeam2_Maidens_List(List<Integer> team2_Maidens_List) {
        Team2_Maidens_List = team2_Maidens_List;
    }

    public List<String> getTeam2_Economy_List() {
        return Team2_Economy_List;
    }

    public void setTeam2_Economy_List(List<String> team2_Economy_List) {
        Team2_Economy_List = team2_Economy_List;
    }
}