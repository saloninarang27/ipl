package com.example.IPLDataReader.Modules;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.ToString;

import java.util.List;
@Entity
@ToString
public class BattingCard {
    @Id
    private  int matcheid;
    private String Team1;
    private List<String> Player_Name_Team1;
    private List<Integer>Player_Runs_Team1;
    private List<Integer>Player_Balls_Team1;
    private List<String>Player_StrikeRate_Team1;
    private List<String>Player_BattingStatus_Team1;
    private List<Integer>Player_Fours_Team1;
    private List<Integer>Player_Sixes_Team1;


    private String Teeam2;
    private List<String> Player_Name_Team2;
    private List<Integer>Player_Runs_Team2;
    private List<Integer>Player_Balls_Team2;
    private List<String>Player_StrikeRate_Team2;
    private List<String>Player_BattingStatus_Team2;
    private List<Integer>Player_Fours_Team2;
    private List<Integer>Player_Sixes_Team2;

    public BattingCard(int matcheid, String team1, List<String> player_Name_Team1, List<Integer> player_Runs_Team1, List<Integer> player_Balls_Team1, List<String> player_StrikeRate_Team1, List<String> player_BattingStatus_Team1, List<Integer> player_Fours_Team1, List<Integer> player_Sixes_Team1, String teeam2, List<String> player_Name_Team2, List<Integer> player_Runs_Team2, List<Integer> player_Balls_Team2, List<String> player_StrikeRate_Team2, List<String> player_BattingStatus_Team2, List<Integer> player_Fours_Team2, List<Integer> player_Sixes_Team2) {
        this.matcheid = matcheid;
        Team1 = team1;
        Player_Name_Team1 = player_Name_Team1;
        Player_Runs_Team1 = player_Runs_Team1;
        Player_Balls_Team1 = player_Balls_Team1;
        Player_StrikeRate_Team1 = player_StrikeRate_Team1;
        Player_BattingStatus_Team1 = player_BattingStatus_Team1;
        Player_Fours_Team1 = player_Fours_Team1;
        Player_Sixes_Team1 = player_Sixes_Team1;
        Teeam2 = teeam2;
        Player_Name_Team2 = player_Name_Team2;
        Player_Runs_Team2 = player_Runs_Team2;
        Player_Balls_Team2 = player_Balls_Team2;
        Player_StrikeRate_Team2 = player_StrikeRate_Team2;
        Player_BattingStatus_Team2 = player_BattingStatus_Team2;
        Player_Fours_Team2 = player_Fours_Team2;
        Player_Sixes_Team2 = player_Sixes_Team2;
    }

    public BattingCard() {
    }

    public int getMatcheid() {
        return matcheid;
    }

    public void setMatcheid(int matcheid) {
        this.matcheid = matcheid;
    }

    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public List<String> getPlayer_Name_Team1() {
        return Player_Name_Team1;
    }

    public void setPlayer_Name_Team1(List<String> player_Name_Team1) {
        Player_Name_Team1 = player_Name_Team1;
    }

    public List<Integer> getPlayer_Runs_Team1() {
        return Player_Runs_Team1;
    }

    public void setPlayer_Runs_Team1(List<Integer> player_Runs_Team1) {
        Player_Runs_Team1 = player_Runs_Team1;
    }

    public List<Integer> getPlayer_Balls_Team1() {
        return Player_Balls_Team1;
    }

    public void setPlayer_Balls_Team1(List<Integer> player_Balls_Team1) {
        Player_Balls_Team1 = player_Balls_Team1;
    }

    public List<String> getPlayer_StrikeRate_Team1() {
        return Player_StrikeRate_Team1;
    }

    public void setPlayer_StrikeRate_Team1(List<String> player_StrikeRate_Team1) {
        Player_StrikeRate_Team1 = player_StrikeRate_Team1;
    }

    public List<String> getPlayer_BattingStatus_Team1() {
        return Player_BattingStatus_Team1;
    }

    public void setPlayer_BattingStatus_Team1(List<String> player_BattingStatus_Team1) {
        Player_BattingStatus_Team1 = player_BattingStatus_Team1;
    }

    public List<Integer> getPlayer_Fours_Team1() {
        return Player_Fours_Team1;
    }

    public void setPlayer_Fours_Team1(List<Integer> player_Fours_Team1) {
        Player_Fours_Team1 = player_Fours_Team1;
    }

    public List<Integer> getPlayer_Sixes_Team1() {
        return Player_Sixes_Team1;
    }

    public void setPlayer_Sixes_Team1(List<Integer> player_Sixes_Team1) {
        Player_Sixes_Team1 = player_Sixes_Team1;
    }

    public String getTeeam2() {
        return Teeam2;
    }

    public void setTeeam2(String teeam2) {
        Teeam2 = teeam2;
    }

    public List<String> getPlayer_Name_Team2() {
        return Player_Name_Team2;
    }

    public void setPlayer_Name_Team2(List<String> player_Name_Team2) {
        Player_Name_Team2 = player_Name_Team2;
    }

    public List<Integer> getPlayer_Runs_Team2() {
        return Player_Runs_Team2;
    }

    public void setPlayer_Runs_Team2(List<Integer> player_Runs_Team2) {
        Player_Runs_Team2 = player_Runs_Team2;
    }

    public List<Integer> getPlayer_Balls_Team2() {
        return Player_Balls_Team2;
    }

    public void setPlayer_Balls_Team2(List<Integer> player_Balls_Team2) {
        Player_Balls_Team2 = player_Balls_Team2;
    }

    public List<String> getPlayer_StrikeRate_Team2() {
        return Player_StrikeRate_Team2;
    }

    public void setPlayer_StrikeRate_Team2(List<String> player_StrikeRate_Team2) {
        Player_StrikeRate_Team2 = player_StrikeRate_Team2;
    }

    public List<String> getPlayer_BattingStatus_Team2() {
        return Player_BattingStatus_Team2;
    }

    public void setPlayer_BattingStatus_Team2(List<String> player_BattingStatus_Team2) {
        Player_BattingStatus_Team2 = player_BattingStatus_Team2;
    }

    public List<Integer> getPlayer_Fours_Team2() {
        return Player_Fours_Team2;
    }

    public void setPlayer_Fours_Team2(List<Integer> player_Fours_Team2) {
        Player_Fours_Team2 = player_Fours_Team2;
    }

    public List<Integer> getPlayer_Sixes_Team2() {
        return Player_Sixes_Team2;
    }

    public void setPlayer_Sixes_Team2(List<Integer> player_Sixes_Team2) {
        Player_Sixes_Team2 = player_Sixes_Team2;
    }
}