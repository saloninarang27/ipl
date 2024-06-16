package com.example.IPLDataReader.Services;
import com.example.IPLDataReader.Modules.IPLBOWLINGDATA;
import com.example.IPLDataReader.Modules.IPLBatsmanRecord;
import com.example.IPLDataReader.Modules.IPLMatch;
import com.example.IPLDataReader.Repository.BatsmanRecordRepository;
import com.example.IPLDataReader.Repository.BowlingRecordRepository;
import com.example.IPLDataReader.Repository.MatchRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import static com.example.IPLDataReader.Services.ReadDataFromCSV.readCSV;
@Slf4j
@Service
public class PushDB {
    @Autowired
    public MatchRepository matchRepository;
    @Autowired
    BatsmanRecordRepository batsmanRecordRepository;
    @Autowired
    BowlingRecordRepository bowlingRecordRepository;
    public void processCSVData() {
        //String filepath = "classpath:IPLDATA.csv";

        //String filepath= "src/main/resources/IPLDATA.csv";
        String filepath= "IPL DATA.csv";
        List<List<String>> rec = readCSV(filepath);
        //   String filepath = "D:\\SpringbootProject\\IPLDataReaderUsingHSql\\src\\main\\resources\\IPLDATA.csv";
        for (int i = 1; i < rec.size(); i++) {
            List<String> line = rec.get(i);
            //int matchId = Integer.parseInt(line.get(0));
            int matchId = i;
            String city = line.get(1);
            String team1 = line.get(5);
            String team2 = line.get(6);
            String result = line.get(11);
            String year = line.get(3);
            String toss = line.get(8);
            String umpire1 = line.get(18);
            String umpire2 = line.get(19);
            String playerOFMatch = line.get(15);
            String playersTeam1 = line.get(16);
            String playersTeam2 = line.get(17);
            String date = line.get(2);
            String venue = line.get(7);
            String margin = line.get(13);
            String method = line.get(14);
            String wonbyrunsorwicket = line.get(12);
            String tossdecision = line.get(9);
            String matchnumber = line.get(4);

            // List<String> playersTeam1 = Arrays.asList(playersString.split(", "));
            IPLMatch match = new IPLMatch(matchId, date, year, city, team1, team2, toss, result, playerOFMatch, umpire1, umpire2, playersTeam1, playersTeam2, venue, wonbyrunsorwicket, margin, method, tossdecision, matchnumber);
            matchRepository.save(match);
        }
    }
    public void InsertBatsmanRecord()
    {

        //String filepath = "D:\\SpringbootProject\\IPLDataReader\\src\\main\\resources\\IPLDATA2.csv";
        //String filepath="src/main/resources/IPLDATA2.csv";
        String filepath = "IPLDATA2.csv";

        List<List<String>> rec= readCSV(filepath);
        //List<IPLBatsmanRecord> Innings = new ArrayList<>();
        for (int i = 1; i < rec.size(); i++)
        {
            List<String> line = rec.get(i);
            int batsmanid=i;
            String batsmanname=line.get(11);
            String  season= (line.get(0));
            String runs= (line.get(12));
            String match_id= (line.get(1));
            String team=(line.get(8));
            String matchname= line.get(2);
            String ballfaced= line.get(13);
            String strikeRate= line.get(17);
            String battingStatus= line.get(22);
            String fours= line.get(15);
            String sixes=line.get(16);
            String homeTeam= line.get(3);
            String awayTeam= line.get(4);
            //String country = line.get(7);
            IPLBatsmanRecord iplrecord=new IPLBatsmanRecord(batsmanid,batsmanname,season,runs,match_id,team,matchname,ballfaced,strikeRate,battingStatus,fours,sixes,homeTeam,awayTeam);
            batsmanRecordRepository.save(iplrecord);
        }
    }

    public void InsertBowlingRecord()
    {
        // ReadDataFromCSV r = new ReadDataFromCSV(resourceLoader);
        //String filepath = "D:\\SpringbootProject\\IPLDataReaderUsingHSql\\src\\main\\resources\\IPLBOWLINGDATA.csv";
        //  String filepath="src/main/resources/IPLBOWLINGDATA.csv";
        String filepath = "IPLBOWLINGDATA.csv";

        List<List<String>> rec= readCSV(filepath);

        for (int i = 1; i < rec.size(); i++)
        {
            List<String> line = rec.get(i);
            int bowlerId=i;
            String bowlerName=line.get(11);
            String  season= (line.get(0));
            String overs= (line.get(12));
            String wickets= (line.get(15));
            String runs=(line.get(14));
            String maiden= line.get(13);
            String economy= line.get(16);
            String match_id= line.get(1);
            String team= line.get(5);
            String matchname= line.get(2);

            String homeTeam= line.get(3);
            String awayTeam= line.get(4);


            IPLBOWLINGDATA iplbowlingdata=new IPLBOWLINGDATA(bowlerId,bowlerName,season,overs,wickets,runs,maiden,economy,match_id,team,matchname,homeTeam,awayTeam);
            bowlingRecordRepository.save(iplbowlingdata);
        }
    }


}
