package com.example.IPLDataReader.Modules;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@Entity
@ToString
public class IPLBatsmanRecord {
    @Id
    private int Batsman_id;
    private String BatsmanName;
    private String Season;
    private String Runs;
    private String  Match_id;
    private String Team;
    private String MatchName;
    private String HomeTeam;
    private String AwayTeam;
    private String BallFaced;
    private String StrikeRate;
    private String BattingStatus;
    private String Fours;
    private String Sixes;

    public IPLBatsmanRecord(int batsman_id, String batsmanName, String season, String runs, String match_id, String team, String matchName,String ballFaced,String strikeRate,String battingStatus,String fours,String sixes,String homeTeam,String awayTeam) {
        Batsman_id = batsman_id;
        BatsmanName = batsmanName;

        Season = season;
        Runs = runs;
        Match_id = match_id;
        Team = team;
        MatchName = matchName;
        BallFaced=ballFaced;
        StrikeRate=strikeRate;
        BattingStatus=battingStatus;
        Fours=fours;
        Sixes=sixes;
        AwayTeam=awayTeam;
        HomeTeam=homeTeam;
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
    public String getFours() {
        return Fours;
    }
    public void setFours(String fours) {
        Fours = fours;
    }

    public String getSixes() {
        return Sixes;
    }

    public void setSixes(String sixes) {
        Sixes = sixes;
    }

    public String getBallFaced() {
        return BallFaced;
    }

    public void setBallFaced(String ballFaced) {
        BallFaced = ballFaced;
    }

    public String getStrikeRate() {
        return StrikeRate;
    }

    public void setStrikeRate(String strikeRate) {
        StrikeRate = strikeRate;
    }

    public String getBattingStatus() {
        return BattingStatus;
    }

    public void setBattingStatus(String battingStatus) {
        BattingStatus = battingStatus;
    }

    public String getMatchName() {
        return MatchName;
    }

    public void setMatchName(String matchName) {
        MatchName = matchName;
    }

    public IPLBatsmanRecord() {
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public int getBatsman_id() {
        return Batsman_id;
    }

    public void setBatsman_id(int batsman_id) {
        Batsman_id = batsman_id;
    }

    public String getBatsmanName() {
        return BatsmanName;
    }

    public void setBatsmanName(String batsmanName) {
        BatsmanName = batsmanName;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getRuns() {
        return Runs;
    }

    public void setRuns(String runs) {
        Runs = runs;
    }

    public String getMatch_id() {
        return Match_id;
    }

    public void setMatch_id(String match_id) {
        Match_id = match_id;
    }
}
