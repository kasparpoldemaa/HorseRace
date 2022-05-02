package com.example.HorseRace.domain.racehorse;

import com.example.HorseRace.domain.horse.Horse;
import com.example.HorseRace.domain.horse.HorseDto;
import com.example.HorseRace.domain.horse.HorseMapper;
import com.example.HorseRace.domain.horse.HorseRepository;
import com.example.HorseRace.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RaceHorseService {


    @Resource
    private HorseMapper horseMapper;
    @Resource
    private HorseRepository horseRepository;
    @Resource
    private RaceHorseMapper raceHorseMapper;
    @Resource
    private RaceHorseRepository raceHorseRepository;
    @Resource
    private ValidationService validationService;


    public RaceHorseDto addRaceHorse(RaceHorseDto raceHorseDto) {
        RaceHorse raceHorse1 = raceHorseMapper.toEntity(raceHorseDto);
        boolean raceHorseExists = raceHorseRepository.existsByHorseIdAndRaceId(raceHorse1.getHorse().getId(),
                raceHorse1.getRace().getId());
        validationService.raceHorseAlreadyExists(raceHorseExists);
        RaceHorse raceHorse = raceHorseRepository.save(raceHorse1);
        return raceHorseMapper.toDto(raceHorse);
    }

    public List<HorseDto> findRaceHorsesByRaceId(Integer raceId) {
        List<RaceHorse> raceHorses = raceHorseRepository.findByRaceId(raceId);
        List<Horse> horses = new ArrayList<>();
        for (RaceHorse raceHorse : raceHorses) {
            horses.add(horseRepository.getById(raceHorse.getHorse().getId()));
        }
        return horseMapper.toDtos(horses);
    }
}
