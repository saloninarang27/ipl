package com.example.IPLDataReader.Controller;
import com.example.IPLDataReader.Modules.Batsman;
import com.example.IPLDataReader.Modules.BattingCard;
import com.example.IPLDataReader.Modules.IPLBatsmanRecord;
import com.example.IPLDataReader.Repository.BatsmanRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/all3")
@CrossOrigin
public class BatsmanRecordController {
    @Autowired
    public BatsmanRecordRepository batsmanRecordRepository;




    @GetMapping("/Search/{player}")
    public Batsman RunsOfBatman(@PathVariable("player") String player) {
        //  Batsman batsman =new Batsman();
        int totalruns = 0;
        int Matches=0;
        int halfCentury=0;
        int Century=0;
        int highest=0;


        List<String> l = batsmanRecordRepository.getRunsByBatsmanName(player);
        for (int i = 0; i < l.size(); i++) {
            double value = Double.parseDouble(l.get(i));
            int temp = (int) value;
            totalruns += temp;
            if(temp>highest)
                highest=temp;

            if(temp>=50 && temp<100)
                halfCentury=halfCentury+1;
            if(temp>99)
                Century=Century+1;
        }
        List<String> l2 = batsmanRecordRepository.getTeamsOfBatsman(player);
        Set<String> s = new HashSet<>(); // Initialize the set

        for (String team : l2) {
            s.add(team);
        }


        Batsman batsman =new Batsman(18,player,s,l.size(),totalruns,highest,halfCentury,Century);
        //return batsman(18,player,s,l.size(),totalruns,highest,halfCentury,Century);
        return batsman;

    }



    @GetMapping("/getScoreCard/{MatchId}")
    public BattingCard getScoreeCard(@PathVariable("MatchId") String MatchId)
    {

        List<IPLBatsmanRecord> matchRecord=batsmanRecordRepository.getRecordByMatchId(MatchId);

        if (!matchRecord.isEmpty()) {
            List<String> Players_List=new ArrayList<>();
            List<Integer>Runs_List=new ArrayList<>();
            List<Integer>Balls_List=new ArrayList<>();
            List<String>StrikeRate_List =new ArrayList<>();
            List<String>BattingStatus_List=new ArrayList<>();
            List<Integer>Fours_List=new ArrayList<>();
            List<Integer>Sixes_List=new ArrayList<>();
            String nameOfTeam="";

            int i;
            String temp = matchRecord.get(0).getTeam();
            for( i=0;i<matchRecord.size();i++)
            { IPLBatsmanRecord line= matchRecord.get(i);

                nameOfTeam = line.getTeam();
                //  System.out.println("i= "+i+"temp= "+temp+" nameofTeam ="+nameOfTeam);
                if(i>=1&& !temp.equals(nameOfTeam))
                { //System.out.println("not matched");
                    break;}

                Players_List.add(line.getBatsmanName());
                //System.out.println(line.getBatsmanName());

                double r=Double.parseDouble(line.getRuns());
                int rr=(int) r;
                Runs_List.add(rr);

                double b=Double.parseDouble(line.getBallFaced());
                int bb=(int) b;
                Balls_List.add(bb);

                StrikeRate_List.add(line.getStrikeRate());

                BattingStatus_List.add(line.getBattingStatus());

                double f=Double.parseDouble(line.getFours());
                int ff=(int) f;
                Fours_List.add(ff);

                double s=Double.parseDouble(line.getSixes());
                int ss=(int) s;
                Sixes_List.add(ss);



                temp= line.getTeam();
            }




            List<String> Players_List2=new ArrayList<>();
            List<Integer>Runs_List2=new ArrayList<>();
            List<Integer>Balls_List2=new ArrayList<>();
            List<String>StrikeRate_List2 =new ArrayList<>();
            List<String>BattingStatus_List2=new ArrayList<>();
            List<Integer>Fours_List2=new ArrayList<>();
            List<Integer>Sixes_List2=new ArrayList<>();
            String temp2=null;
            for(;i<matchRecord.size();i++)
            { IPLBatsmanRecord line= matchRecord.get(i);
                Players_List2.add(line.getBatsmanName());
                // System.out.println("i= "+i+"temp2 = "+temp2);
                double r=Double.parseDouble(line.getRuns());
                int rr=(int) r;
                Runs_List2.add(rr);

                double b=Double.parseDouble(line.getBallFaced());
                int bb=(int) b;
                Balls_List2.add(bb);

                StrikeRate_List2.add(line.getStrikeRate());

                BattingStatus_List2.add(line.getBattingStatus());

                double f=Double.parseDouble(line.getFours());
                int ff=(int) f;
                Fours_List2.add(ff);

                double s=Double.parseDouble(line.getSixes());
                int ss=(int) s;
                Sixes_List2.add(ss);


                temp2=line.getTeam();
            }

            double m_id=Double.parseDouble(MatchId);
            int matchidd=(int) m_id;
            BattingCard matchScoreCard=new BattingCard(matchidd,temp,Players_List,Runs_List,Balls_List,StrikeRate_List,BattingStatus_List,Fours_List,Sixes_List,temp2,Players_List2,Runs_List2,Balls_List2,StrikeRate_List2,BattingStatus_List2,Fours_List2,Sixes_List2);
            return matchScoreCard;
        }
        else
            return  null;
    }

    @GetMapping("/getScoreCardByYearsTeams/{Season}/{Team1}/{Team2}")
    public Set<Integer>getDetail(@PathVariable("Season") String Season,@PathVariable("Team1")String Team1,@PathVariable("Team2") String Team2)
    {

        Set<Integer> MId=  batsmanRecordRepository.getDetailsBySeasonAndTeams(Season,Team1,Team2);
        //System.out.println(records.size());
        return MId;
    }




}