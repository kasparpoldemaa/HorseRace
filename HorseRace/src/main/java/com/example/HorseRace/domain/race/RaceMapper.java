package com.example.HorseRace.domain.race;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RaceMapper {
    Race toEntity(RaceDto raceDto);

    RaceDto toDto(Race race);
    List<RaceDto> toDtos (List<Race> races);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRaceFromRaceDto(RaceDto raceDto, @MappingTarget Race race);
}
