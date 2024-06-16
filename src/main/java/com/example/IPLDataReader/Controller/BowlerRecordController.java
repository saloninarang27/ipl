package com.example.IPLDataReader.Controller;
import com.example.IPLDataReader.Modules.Bowler;
import com.example.IPLDataReader.Modules.BowlingCard;
import com.example.IPLDataReader.Modules.IPLBOWLINGDATA;
import com.example.IPLDataReader.Repository.BowlingRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/all4")
public class BowlerRecordController {
    @Autowired
    public BowlingRecordRepository bowlingRecordRepository;
    @GetMapping("/getBowlingCard/{MatchId}")
    public BowlingCard getBowlingDetail(@PathVariable("MatchId") String MatchId)
    {
        List<IPLBOWLINGDATA> bowlingRecord=bowlingRecordRepository.getRecordByMatchId(MatchId);
        if(!bowlingRecord.isEmpty()) {
            List<String> team1_bowlers_list = new ArrayList<>();
            List<String> team1_overs_list = new ArrayList<>();
            List<Integer> team1_wickets_list = new ArrayList<>();
            List<Integer> team1_runs_list = new ArrayList<>();
            List<Integer> team1_maidens_list = new ArrayList<>();
            List<String> team1_economy_list = new ArrayList<>();
            String nameOfTeam = null;
            String temp = bowlingRecord.get(0).getTeam();
            int i;
            for (i = 0; i < bowlingRecord.size(); i++) {
                IPLBOWLINGDATA iplbowlingdata = bowlingRecord.get(i);
                nameOfTeam = iplbowlingdata.getTeam();
                if (i >= 1 && !temp.equals(nameOfTeam)) {
                    break;
                }
                team1_bowlers_list.add(iplbowlingdata.getBowlerName());
                team1_overs_list.add(iplbowlingdata.getOvers());
                double w = Double.parseDouble(iplbowlingdata.getWickets());
                int ww = (int) w;
                team1_wickets_list.add(ww);
                double r = Double.parseDouble((iplbowlingdata.getRuns()));
                int rr = (int) r;
                team1_runs_list.add(rr);
                double m = Double.parseDouble((iplbowlingdata.getMaiden()));
                int mm = (int) m;
                team1_maidens_list.add(mm);
                team1_economy_list.add(iplbowlingdata.getEconomy());
                temp = iplbowlingdata.getTeam();

            }


            List<String> team2_bowlers_list = new ArrayList<>();
            List<String> team2_overs_list = new ArrayList<>();
            List<Integer> team2_wickets_list = new ArrayList<>();
            List<Integer> team2_runs_list = new ArrayList<>();
            List<Integer> team2_maidens_list = new ArrayList<>();
            List<String> team2_economy_list = new ArrayList<>();
            String temp2 = null;
            for (; i < bowlingRecord.size(); i++) {
                IPLBOWLINGDATA iplbowlingdata = bowlingRecord.get(i);
                team2_bowlers_list.add(iplbowlingdata.getBowlerName());
                team2_overs_list.add(iplbowlingdata.getOvers());

                double w = Double.parseDouble(iplbowlingdata.getWickets());
                int ww = (int) w;
                team2_wickets_list.add(ww);

                double r = Double.parseDouble(iplbowlingdata.getRuns());
                int rr = (int) r;
                team2_runs_list.add(rr);

                double m = Double.parseDouble(iplbowlingdata.getMaiden());
                int mm = (int) m;
                team2_maidens_list.add(mm);

                team2_economy_list.add(iplbowlingdata.getEconomy());
                temp2 = iplbowlingdata.getTeam();

            }
            double m_id = Double.parseDouble(MatchId);
            int matchidd = (int) m_id;

            BowlingCard bowlingCard = new BowlingCard(matchidd, temp, team1_bowlers_list, team1_overs_list, team1_wickets_list, team1_runs_list, team1_maidens_list, team1_economy_list, temp2, team2_bowlers_list, team2_overs_list, team2_wickets_list, team2_runs_list, team2_maidens_list, team2_economy_list);


            //return bowlingRecord;
            return bowlingCard;
        }
        return  null;
    }

    @GetMapping("/Search/{player}")
    public Bowler getBowlerRecord(@PathVariable("player") String player)
    {
        List<IPLBOWLINGDATA> ListOfBowling= bowlingRecordRepository.getBowlingDetailByName(player);
        int TotalWickets=0;
        int TotalBalls=0;
        int TotalMaidens=0;
        double TotalEconomy=0;
        int best=0;
        String oppTeam;
        List<String> bestFigure = new ArrayList<>();

        for(int i=0;i<ListOfBowling.size();i++)
        {
            IPLBOWLINGDATA line=ListOfBowling.get(i);

            double w=Double.parseDouble(line.getWickets());
            int ww=(int) w;
            TotalWickets+=ww;

            double b=Double.parseDouble(line.getOvers());
            int bb=(int) b;
            double dp=b-bb;
            dp*=10;
            int dpp=(int) dp;
            TotalBalls+=bb*6;
            TotalBalls+=dpp;

            double m=Double.parseDouble(line.getMaiden());
            int mm=(int) m;
            TotalMaidens+=mm;

            double eco=Double.parseDouble(line.getEconomy());
            TotalEconomy+=eco;

            if(ww>best)
            {
                bestFigure.clear();
                best=ww;
                String ht=line.getHomeTeam();
                String at= line.getAwayTeam();
                String pt= line.getTeam();
                if(pt==ht)
                    oppTeam=at;
                else
                    oppTeam=ht;

                bestFigure.add(line.getWickets());
                bestFigure.add(" vs ");
                bestFigure.add(oppTeam);
            }


        }

        TotalEconomy=TotalEconomy/ ListOfBowling.size();



        Bowler bowler=new Bowler(18,ListOfBowling.size(),TotalBalls,TotalWickets,bestFigure,TotalEconomy,TotalMaidens);
        //return  ListOfBowling;
        return  bowler;




    }



}