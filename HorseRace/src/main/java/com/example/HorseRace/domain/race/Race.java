package com.example.HorseRace.domain.race;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "race")
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "race_date", nullable = false)
    private String raceDate;

    @Column(name = "race_time", nullable = false, length = 50)
    private String raceTime;

    @Column(name = "race_place", nullable = false, length = 50)
    private String racePlace;

    @Column(name = "has_result", nullable = false)
    private boolean hasResult;

}