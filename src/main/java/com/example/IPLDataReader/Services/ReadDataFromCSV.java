package com.example.IPLDataReader.Services;
import com.example.IPLDataReader.Repository.MatchRepository;
import com.example.IPLDataReader.Modules.IPLMatch;
import com.opencsv.CSVReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.apache.commons.lang3.time.DateUtils.parseDate;
@Slf4j
//@Service
public class ReadDataFromCSV {
    //@Autowired
    //  public  MatchRepository matchRepository;
//    public static List<List<String>> readCSV(String path) {
//        List<List<String>> records = new ArrayList<>();
//        try (CSVReader csvReader = new CSVReader(new FileReader(path))) {
//            String[] values;
//            while ((values = csvReader.readNext()) != null) {
//                records.add(Arrays.asList(values));
//            }
//        } catch (IOException e) {
//            log.error("Error in Reading the CSV File", e);
//        }
//        return records;
//    }
    public static List<List<String>> readCSV(String filename) {
        List<List<String>> records = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new InputStreamReader(getResourceAsStream(filename)))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            log.error("Error in Reading the CSV File", e);
        }
        return records;
    }

    private static InputStream getResourceAsStream(String filename) {
        ClassLoader classLoader = ReadDataFromCSV.class.getClassLoader();
        return classLoader.getResourceAsStream(filename);
    }

    public static void main(String[] args) {
        ReadDataFromCSV r = new ReadDataFromCSV();
        String filepath = "C:\\Springboot\\IPLDataReader\\src\\main\\resources\\IPL DATA.csv";
        List<List<String>> rec = r.readCSV(filepath);
        List<IPLMatch> Matches = new ArrayList<>();
        // for (List<String> line : rec) {
        for (int i = 1; i < rec.size(); i++) {
            List<String> line = rec.get(i);

            int matchId =i;// Integer.parseInt(line.get(0));
            String city = line.get(1);
            String team1 = line.get(5);
            String team2 = line.get(6);
            String result = line.get(11);
            String year= line.get(3);
            String toss= line.get(8);
            String umpire1= line.get(18);
            String umpire2=line.get(19);
            String playerOFMatch=line.get(15);
            String playersStringTeam1 = line.get(16);
            String playersStringTeam2=line.get(17);
            String date=line.get(2);
            String venue= line.get(7);
            String margin= line.get(13);
            String method= line.get(14);
            String wonbyrunsorwicket= line.get(12);
            String tossdecision=line.get(9);
            String matchnumber=line.get(4);

            // List<String> playersTeam1 = line.get(16);//Arrays.asList(playersString.split(", "));
            Matches.add(new IPLMatch(matchId, date,year,city, team1, team2,toss, result,playerOFMatch,umpire1,umpire2,playersStringTeam1,playersStringTeam2,venue,wonbyrunsorwicket,margin,method,tossdecision,matchnumber));

        }
        for (IPLMatch match: Matches) {
            System.out.println(match);
        }
    }
}