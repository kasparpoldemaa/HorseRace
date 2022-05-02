package com.example.HorseRace.domain.race;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/race")
public class RaceController {

    @Resource
    private RaceService raceService;

    @PostMapping("/new")
    @Operation(summary = "Create new race")
    public RaceDto createNewRace(@RequestBody RaceDto raceDto) {
        return raceService.createNewRace(raceDto);
    }

    @GetMapping("/all")
    @Operation(summary = "Shows all created horse races")
    public List<RaceDto> getAllRaces() {
        return raceService.getAllRaces();
    }

    @GetMapping("/ongoing")
    @Operation(summary="Shows all races without result")
    public List<RaceDto> getAllRacesWithoutResult() {
        return raceService.getAllRacesWithoutResult();}

    @GetMapping("/finished")
    @Operation(summary="Shows all races with result")
    public List<RaceDto> getAllRacesWithResult() {
        return raceService.getAllRacesWithResult();}

    @PutMapping("/id")
    public void updateHasResult(@RequestParam Integer raceId) {
        raceService.updateHasResult(raceId);
    }
}
