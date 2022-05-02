package com.example.HorseRace.service;

import com.example.HorseRace.domain.horse.HorseDto;
import com.example.HorseRace.domain.race.Race;
import com.example.HorseRace.domain.race.RaceService;
import com.example.HorseRace.domain.racehorse.RaceHorseService;
import com.example.HorseRace.domain.result.Result;
import com.example.HorseRace.domain.result.ResultRepository;
import com.example.HorseRace.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class BetService {

    @Resource
    private RaceHorseService raceHorseService;

    @Resource
    private RaceService raceService;

    @Resource
    private ResultRepository resultRepository;

    @Resource
    private ValidationService validationService;

    public HorseDto decideWinner(Integer raceId) {
        Race race = raceService.getRaceByRaceId(raceId);
        validationService.isValidRace(
                race.isHasResult(),
                race.getRaceDate(),
                race.getRaceTime(),
                race.getRacePlace());
        List<HorseDto> horses = raceHorseService.findRaceHorsesByRaceId(raceId);
        validationService.hasEnoughHorses(horses.size());
        Collections.shuffle(horses);
        addNewResult(raceId, horses);
        raceService.updateHasResult(raceId);
        return horses.get(0);
    }

    private void addNewResult(Integer raceId, List<HorseDto> horses) {
        Result result = new Result();
        result.setHorseId(horses.get(0).getId());
        result.setRaceId(raceId);
        resultRepository.save(result);
    }

}
