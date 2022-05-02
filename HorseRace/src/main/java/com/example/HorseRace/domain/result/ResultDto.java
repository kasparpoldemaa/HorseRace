package com.example.HorseRace.domain.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultDto implements Serializable {
    private Integer id;
    private Integer raceId;
    private Integer horseId;
}
