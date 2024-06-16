package com.example.IPLDataReader.Modules;
import java.util.List;

public class TeamDetail {
    private String TeamName;
    private int MatchPlayed;
    private int TotalWins;
    private int TotalLoss;
    private int NoResult;
    private int TossWon;
    private List<IPLMatch> IPLMatchList;


    public TeamDetail(String teamName, int matchPlayed, int totalWins, int totalLoss, int noResult, int tossWon, List<IPLMatch> IPLMatchList) {
        TeamName = teamName;
        MatchPlayed = matchPlayed;
        TotalWins = totalWins;
        TotalLoss = totalLoss;
        NoResult = noResult;
        TossWon = tossWon;
        this.IPLMatchList = IPLMatchList;
    }

    public TeamDetail() {
    }

    public List<IPLMatch> getIPLMatchList() {
        return IPLMatchList;
    }

    public void setIPLMatchList(List<IPLMatch> IPLMatchList) {
        this.IPLMatchList = IPLMatchList;
    }

    public int getNoResult() {
        return NoResult;
    }

    public void setNoResult(int noResult) {
        NoResult = noResult;
    }

    public int getTossWon() {
        return TossWon;
    }

    public void setTossWon(int tossWon) {
        TossWon = tossWon;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public int getMatchPlayed() {
        return MatchPlayed;
    }

    public void setMatchPlayed(int matchPlayed) {
        MatchPlayed = matchPlayed;
    }

    public int getTotalWins() {
        return TotalWins;
    }

    public void setTotalWins(int totalWins) {
        TotalWins = totalWins;
    }

    public int getTotalLoss() {
        return TotalLoss;
    }

    public void setTotalLoss(int totalLoss) {
        TotalLoss = totalLoss;
    }
}

