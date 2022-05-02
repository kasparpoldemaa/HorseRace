package com.example.HorseRace.domain.racehorse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RaceHorseDto implements Serializable {
    private Integer horseId;
//    private String horseHorseName;
//    private String horseHorseColor;
    private Integer raceId;
//    private String raceRaceDate;
//    private String raceRaceTime;
}
