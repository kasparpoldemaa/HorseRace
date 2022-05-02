package com.example.HorseRace.domain.racehorse;

import com.example.HorseRace.domain.horse.HorseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/race-horse")
public class RaceHorseController {


    @Resource
    private RaceHorseService raceHorseService;


    //    @PostMapping("/add")
//    @Operation(summary = "Adds horse to a race")
//    public RaceHorseDto addRaceHorse(@RequestParam Integer raceId,@RequestParam Integer horseId) {
//        return raceHorseService.addRaceHorse(raceId, horseId);
//    }
    @PostMapping("/add")
    @Operation(summary = "Adds horse to a race")
    public RaceHorseDto addRaceHorse(@RequestBody RaceHorseDto raceHorseDto) {
        return raceHorseService.addRaceHorse(raceHorseDto);
    }

    @GetMapping("/id")
    @Operation(summary = "Finds all competing horses by raceId ")
    public List<HorseDto> findRaceHorsesByRaceId(@RequestParam Integer raceId) {
        return raceHorseService.findRaceHorsesByRaceId(raceId);
    }


}
