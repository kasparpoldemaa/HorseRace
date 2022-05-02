package com.example.HorseRace.domain.horse;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class HorseDto implements Serializable {
    private Integer id;
    @NotNull
    private String horseName;
    @NotNull
    private String horseColor;
}
