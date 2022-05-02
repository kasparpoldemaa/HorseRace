package com.example.HorseRace.domain.horse;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HorseMapper {
    Horse toEntity(HorseDto horseDto);

    HorseDto toDto(Horse horse);

    List<HorseDto> toDtos(List<Horse> horses);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(HorseDto horseDto, @MappingTarget Horse horse);
}

