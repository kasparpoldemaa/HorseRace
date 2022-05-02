package com.example.HorseRace.domain.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class BetRequest implements Serializable {

    private Integer raceId;
    private Integer horseId;
}
