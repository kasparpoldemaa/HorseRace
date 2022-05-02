package com.example.HorseRace.domain.racehorse;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RaceHorseResponseMapper {
    @Mapping(source = "horseId", target = "horse.id")
    @Mapping(source = "horseHorseName", target = "horse.horseName")
    @Mapping(source = "horseHorseColor", target = "horse.horseColor")
    @Mapping(source = "raceId", target = "race.id")
    RaceHorse toRequest(RaceHorseResponse raceHorseResponse);


    @InheritInverseConfiguration(name = "toEntity")
    List<RaceHorseResponse> toResponse(List<RaceHorse> raceHorses);
}
