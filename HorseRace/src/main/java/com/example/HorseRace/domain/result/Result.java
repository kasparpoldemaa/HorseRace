package com.example.HorseRace.domain.result;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "race_id", nullable = false)
    private Integer raceId;

    @Column(name = "horse_id", nullable = false)
    private Integer horseId;

}