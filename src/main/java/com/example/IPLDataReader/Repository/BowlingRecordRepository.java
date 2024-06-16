package com.example.IPLDataReader.Repository;

import com.example.IPLDataReader.Modules.IPLBOWLINGDATA;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BowlingRecordRepository extends CrudRepository<IPLBOWLINGDATA,Integer> {
    @Query("SELECT m FROM IPLBOWLINGDATA m WHERE m.Match_id = :matchid")
    List<IPLBOWLINGDATA> getRecordByMatchId(@Param("matchid") String Matchid);
    @Query("SELECT m FROM IPLBOWLINGDATA m WHERE m.BowlerName = :BowlerName")
    List<IPLBOWLINGDATA> getBowlingDetailByName(@Param("BowlerName") String Name);
}
