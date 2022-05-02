package com.example.HorseRace.domain.race;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
public class RaceDto implements Serializable {
    private Integer id;
    private String raceDate;
    private String raceTime;
    private String racePlace;
    private boolean hasResult;
}
