package com.example.IPLDataReader.Modules;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Setter
@Getter
public class IPLBOWLINGDATA {
    @Id
    private int Bowler_id;
    private String BowlerName;
    private String Season;
    private String Overs;
    private String Wickets;
    private String Runs;
    private String Maiden;
    private String Economy;
    private String  Match_id;
    private String Team;
    private String MatchName;
    private String HomeTeam;
    private String AwayTeam;

    public IPLBOWLINGDATA(int bowler_id, String bowlerName, String season, String overs, String wickets, String runs, String maiden, String economy, String match_id, String team, String matchName, String homeTeam, String awayTeam) {
        Bowler_id = bowler_id;
        BowlerName = bowlerName;
        Season = season;
        Overs = overs;
        Wickets = wickets;
        Runs = runs;
        Maiden = maiden;
        Economy = economy;
        Match_id = match_id;
        Team = team;
        MatchName = matchName;
        HomeTeam = homeTeam;
        AwayTeam = awayTeam;
    }

    public IPLBOWLINGDATA() {
    }

    public int getBowler_id() {
        return Bowler_id;
    }

    public void setBowler_id(int bowler_id) {
        Bowler_id = bowler_id;
    }

    public String getBowlerName() {
        return BowlerName;
    }

    public void setBowlerName(String bowlerName) {
        BowlerName = bowlerName;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getOvers() {
        return Overs;
    }

    public void setOvers(String overs) {
        Overs = overs;
    }

    public String getWickets() {
        return Wickets;
    }

    public void setWickets(String wickets) {
        Wickets = wickets;
    }

    public String getRuns() {
        return Runs;
    }

    public void setRuns(String runs) {
        Runs = runs;
    }

    public String getMaiden() {
        return Maiden;
    }

    public void setMaiden(String maiden) {
        Maiden = maiden;
    }

    public String getEconomy() {
        return Economy;
    }

    public void setEconomy(String economy) {
        Economy = economy;
    }

    public String getMatch_id() {
        return Match_id;
    }

    public void setMatch_id(String match_id) {
        Match_id = match_id;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getMatchName() {
        return MatchName;
    }

    public void setMatchName(String matchName) {
        MatchName = matchName;
    }

    public String getHomeTeam() {
        return HomeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        HomeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return AwayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        AwayTeam = awayTeam;
    }
}