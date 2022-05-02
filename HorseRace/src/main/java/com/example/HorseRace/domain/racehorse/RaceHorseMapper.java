package com.example.HorseRace.domain.racehorse;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RaceHorseMapper {
    @Mapping(source = "horseId", target = "horse.id")
//    @Mapping(source = "horseHorseName", target = "horse.horseName")
//    @Mapping(source = "horseHorseColor", target = "horse.horseColor")
    @Mapping(source = "raceId", target = "race.id")
//    @Mapping(source = "raceRaceDate", target = "race.raceDate")
//    @Mapping(source = "raceRaceTime", target = "race.raceTime")
    RaceHorse toEntity(RaceHorseDto raceHorseDto);

    @InheritInverseConfiguration(name = "toEntity")
    RaceHorseDto toDto(RaceHorse raceHorse);

    List<RaceHorseDto> toDtos(List<RaceHorse> raceHorses);

    @InheritConfiguration(name = "toEntity")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(RaceHorseDto raceHorseDto, @MappingTarget RaceHorse raceHorse);

}
