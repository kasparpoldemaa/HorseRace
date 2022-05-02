package com.example.HorseRace.service;

import com.example.HorseRace.domain.horse.HorseDto;
import com.example.HorseRace.domain.horse.HorseMapper;
import com.example.HorseRace.domain.horse.HorseRepository;
import com.example.HorseRace.domain.result.Result;
import com.example.HorseRace.domain.result.ResultDto;
import com.example.HorseRace.domain.result.ResultMapper;
import com.example.HorseRace.domain.result.ResultRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ResultService {

    @Resource
    private ResultRepository resultRepository;

    @Resource
    private HorseMapper horseMapper;

    @Resource
    private HorseRepository horseRepository;

    @Resource
    private ResultMapper resultMapper;

    public List<ResultDto> getAllResults() {
        return resultMapper.toDtos(resultRepository.findAll());
    }

    public HorseDto findResultByRaceId(Integer raceId) {
        Result result = resultRepository.findByRaceId(raceId);
        return horseMapper.toDto(horseRepository.getById(result.getHorseId()));
    }
}
