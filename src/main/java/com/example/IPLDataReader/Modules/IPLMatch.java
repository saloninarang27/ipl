package com.example.IPLDataReader.Modules;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.ToString;

@ToString
@Entity
//@Table(name="ipl-data")
public class IPLMatch {

    @Id
    private int MatchId;
    private String Date;
    private String TossWinner;
    private String City;
    private String Team1;
    private String Team2;
    private String Result;
    private String   Year;
    private String Umpire1;
    private String Umpire2;
    private String PlayerOFMatch;
    private String PlayersTeam1;
    private String PlayersTeam2;
    private String Venue;
    private String WonByRunsOrWicket;
    private String Margin;
    private String Method;
    private String TossDecision;
    private String MatchNumber;





    public IPLMatch(int matchId,String date, String year,String city, String team1, String team2, String toss,String result,String playerOFMatch,String umpire1,String umpire2,String players1,String players2,String venue,String wonbyrunsorwicket,String margin,String method,String tossDecision,String matchnumber) {
        MatchId = matchId;
        Date=date;
        City = city;
        Team1 = team1;
        Team2 = team2;
        Result = result;
        Year=year;
        Umpire1=umpire1;
        Umpire2=umpire2;
        TossWinner=toss;
        PlayerOFMatch=playerOFMatch;
        PlayersTeam1=players1;
        PlayersTeam2=players2;
        Venue=venue;
        Margin=margin;
        Method=method;
        WonByRunsOrWicket=wonbyrunsorwicket;
        TossDecision=tossDecision;
        MatchNumber=matchnumber;

    }

    public String getMatchNumber() {
        return MatchNumber;
    }

    public void setMatchNumber(String matchNumber) {
        MatchNumber = matchNumber;
    }

    public String getTossWinner() {
        return TossWinner;
    }

    public void setTossWinner(String tossWinner) {
        TossWinner = tossWinner;
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String venue) {
        Venue = venue;
    }

    public String getWonByRunsOrWicket() {
        return WonByRunsOrWicket;
    }

    public void setWonByRunsOrWicket(String wonByRunsOrWicket) {
        WonByRunsOrWicket = wonByRunsOrWicket;
    }

    public String getMargin() {
        return Margin;
    }

    public void setMargin(String margin) {
        Margin = margin;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public String getTossDecision() {
        return TossDecision;
    }

    public void setTossDecision(String tossDecision) {
        TossDecision = tossDecision;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getPlayersTeam1() {
        return PlayersTeam1;
    }

    public void setPlayersTeam1(String playersTeam1) {
        PlayersTeam1 = playersTeam1;
    }

    public String getPlayersTeam2() {
        return PlayersTeam2;
    }

    public void setPlayersTeam2(String playersTeam2) {
        PlayersTeam2 = playersTeam2;
    }

    public String getPlayerOFMatch() {
        return PlayerOFMatch;
    }

    public void setPlayerOFMatch(String playerOFMatch) {
        PlayerOFMatch = playerOFMatch;
    }



    public String getUmpire1() {
        return Umpire1;
    }

    public void setUmpire1(String umpire1) {
        Umpire1 = umpire1;
    }

    public String getUmpire2() {
        return Umpire2;
    }

    public void setUmpire2(String umpire2) {
        Umpire2 = umpire2;
    }

    public IPLMatch() {
    }

    public int getMatchId() {
        return MatchId;
    }

    public void setMatchId(int matchId) {
        MatchId = matchId;
    }

    public void setMatchId(Integer matchId) {
        MatchId = matchId;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getTeam1() {
        return Team1;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String result) {
        Result = result;
    }

}
