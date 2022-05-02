package com.example.HorseRace.domain.result;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ResultMapper {
    Result toEntity(ResultDto resultDto);

    ResultDto toDto(Result result);
    List<ResultDto> toDtos(List<Result> results);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateResultFromResultDto(ResultDto resultDto, @MappingTarget Result result);
}
