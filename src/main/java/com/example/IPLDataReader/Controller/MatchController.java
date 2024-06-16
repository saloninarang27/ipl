package com.example.IPLDataReader.Controller;
//package com.example.IPLDataReader.Controller;

import com.example.IPLDataReader.Modules.ComparisionResult;
import com.example.IPLDataReader.Modules.TeamDetail;
import com.example.IPLDataReader.Repository.MatchRepository;
import com.example.IPLDataReader.Modules.IPLMatch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.example.IPLDataReader.Services.ReadDataFromCSV.readCSV;
@CrossOrigin
@RestController
@RequestMapping("/all2")
public class MatchController {
   // @Autowired
    //public MatchRepository matchRepository;
    private final MatchRepository matchRepository;

    @Autowired
     public MatchController(MatchRepository matchRepository) {
         this.matchRepository = matchRepository;
     }
    @GetMapping("/MatchData")
    public void processCSVData() {
        // MatchRepository matchRepository = null;
        String filepath = "C:\\Springboot\\IPLDataReader\\src\\main\\resources\\IPL DATA.csv";
        List<List<String>> rec = readCSV(filepath);

        for (int i = 1; i < rec.size(); i++) {
            List<String> line = rec.get(i);

            //int matchId = Integer.parseInt(line.get(0));
            int matchId=i;
            String city = line.get(1);
            String team1 = line.get(5);
            String team2 = line.get(6);
            String result = line.get(11);
            String year=line.get(3);
            String toss= line.get(8);
            String umpire1= line.get(18);
            String umpire2=line.get(19);
            String playerOFMatch=line.get(15);
            String playersTeam1 = line.get(16);
            String playersTeam2=line.get(17);
            String date= line.get(2);
            String venue= line.get(7);
            String margin= line.get(13);
            String method= line.get(14);
            String wonbyrunsorwicket= line.get(12);
            String tossdecision=line.get(9);
            String matchnumber=line.get(4);
            // List<String> playersTeam1 = Arrays.asList(playersString.split(", "));


            IPLMatch match = new IPLMatch(matchId,date,year ,city, team1, team2,toss, result,playerOFMatch,umpire1,umpire2,playersTeam1,playersTeam2,venue,wonbyrunsorwicket,margin,method,tossdecision,matchnumber);
            matchRepository.save(match);
        }
    }


            @GetMapping("/MatchesOf/{year}")
    public List<IPLMatch> getWinnersForYear(@PathVariable("year") String year) {
        //MatchRepository matchRepository1 = null;

        return matchRepository.findByYear(year);
    }
    @GetMapping("/Matches/{year}/{team}")
    public List<IPLMatch>getMatchOfATeamYearWise(@PathVariable("year") String year,@PathVariable("team") String team)
    {
        return  matchRepository.findByYearAndTeam(year,team);
    }
    @GetMapping("Match/{year}/{team1}/{team2}")
    public List<IPLMatch>getMatchOfTeam(@PathVariable("team1") String team1,@PathVariable("team2") String team2,@PathVariable("year") String year)
    {
        return matchRepository.findByTeam1VsTeam2OfYear(year,team1,team2);
    }

    @GetMapping("Data/{team}")
    public TeamDetail Teamdata(@PathVariable("team") String team) {
        String NoResult="NA";
        TeamDetail teamDetail = new TeamDetail();
        List<IPLMatch> l = matchRepository.findTeamDetail(team);
        int cntMatchWinn = 0;
        int cntNoResult=0;
        int cntTossWin=0;
        List<IPLMatch>listOfLast4IPLMatch =new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            IPLMatch m = l.get(i);
            System.out.println(m.getResult().toString());
            if (m.getResult().equals(team)) {
                cntMatchWinn++;
            }
            if(m.getResult().equals(NoResult))
            {
                cntNoResult++;
            }
            if (m.getTossWinner().equals(team)) {
                cntTossWin++;
            }

        }
        int i=0;
        while (listOfLast4IPLMatch.size()!=4)
        {   IPLMatch m = l.get(i);
            if(m.getTeam1().equals(team)|| m.getTeam2().equals(team))
                listOfLast4IPLMatch.add(m);
            i++;
        }
        teamDetail.setIPLMatchList(listOfLast4IPLMatch);
        teamDetail.setTossWon(cntTossWin);
        teamDetail.setNoResult(cntNoResult);
        teamDetail.setMatchPlayed(l.size());
        teamDetail.setTeamName(team);

        int totalMatch = l.size();
        int totalLoss = (totalMatch - cntMatchWinn)-cntNoResult;
        teamDetail.setTotalLoss(totalLoss);
        teamDetail.setTotalWins(cntMatchWinn);

        return teamDetail;
    }


    @GetMapping("/last4MatchesOf/{year}")
    public List<IPLMatch>LastFourMatchesOfSeason(@PathVariable("year") String year){
        List<IPLMatch> iplMatches=new ArrayList<>();
        List<IPLMatch>l=matchRepository.findByYear(year);
        for(int i=0;i<l.size();i++)
        {
            IPLMatch m=new IPLMatch();
            m=l.get(i);
            if(m.getMatchNumber().length()>2)
            {
                iplMatches.add(m);
            }
        }
        return iplMatches;

    }
    @GetMapping("/Match/{id}")
    public Optional<IPLMatch> getMatchById(@PathVariable("id") int id)
    {
        return matchRepository.findById(id);
    }

    @GetMapping("TeamCompare/{team1}/{team2}")
    public ComparisionResult getMatchOfTeam(@PathVariable("team1") String team1,@PathVariable("team2") String team2)
    {
        List<IPLMatch> l = matchRepository.findByTeam1VsTeam2(team1,team2);
        int TotalMatchPlayed = l.size();
        int MatchWonTeam1 = 0;
        int MatchWonTeam2 = 0;
        int TossWonTeam1 = 0;
        int TossWonTeam2 = 0;
        int NoResult =0;
        for(int i=0;i<l.size();i++){
            IPLMatch m = l.get(i);
            if (m.getResult().equals(team1)){
                MatchWonTeam1++;
            } else if (m.getResult().equals(team2) ){
                MatchWonTeam2++;
            }
            else {
                NoResult++;
            }
            if(m.getTossWinner().equals(team1)){
                TossWonTeam1++;
            } else if (m.getTossWinner().equals(team2)) {
                TossWonTeam2++;
            }
        }
        //TeamDetail TD = new TeamDetail(TotalMatchPlayed)
        ComparisionResult CR = new ComparisionResult(TotalMatchPlayed,MatchWonTeam1,MatchWonTeam2,TossWonTeam1,TossWonTeam2, NoResult);
        return CR;
        //return matchRepository.findByTeam1VsTeam2(team1,team2);
    }

}