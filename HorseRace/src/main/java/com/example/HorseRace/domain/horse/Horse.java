package com.example.HorseRace.domain.horse;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "horse")
public class Horse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "horse_name", nullable = false, length = 50)
    private String horseName;

    @Column(name = "horse_color", nullable = false, length = 50)
    private String horseColor;

}