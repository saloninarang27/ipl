package com.example.IPLDataReader.Repository;
import com.example.IPLDataReader.Modules.IPLBatsmanRecord;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BatsmanRecordRepository extends CrudRepository<IPLBatsmanRecord,Integer>{
    @Query("SELECT r.Runs FROM IPLBatsmanRecord r WHERE r.BatsmanName = :BatsmanName")
    List<String> getRunsByBatsmanName(@Param("BatsmanName") String batsmanName);

    @Query("SELECT r.Team FROM IPLBatsmanRecord r WHERE r.BatsmanName = :BatsmanName")
    List<String> getTeamsOfBatsman(@Param("BatsmanName") String batsmanName);
    @Query("SELECT m FROM IPLBatsmanRecord m WHERE m.Match_id = :matchid")
    List<IPLBatsmanRecord> getRecordByMatchId(@Param("matchid") String Matchid);
    @Query("SELECT m.Match_id FROM IPLBatsmanRecord m WHERE m.Season = :Season AND  (m.HomeTeam = :HomeTeam AND m.AwayTeam= :AwayTeam) ")
    Set<Integer> getDetailsBySeasonAndTeams(@Param("Season") String season, @Param("HomeTeam") String team1, @Param("AwayTeam") String team2);
}
