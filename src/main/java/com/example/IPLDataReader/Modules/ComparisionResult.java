package com.example.IPLDataReader.Modules;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ComparisionResult {
    private int TotalMatch;
    private  int Team1MatchWon;
    private  int Team2MatchWon;
    private  int Team1TossWon;
    private  int Team2TossWon;
    private int NoResult;


}
