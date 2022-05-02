package com.example.HorseRace.service;

import com.example.HorseRace.domain.horse.HorseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/bet")
public class BetController {

    @Resource
    private BetService betService;

    @GetMapping("/winner")
    @Operation (summary = "Returns a race winner by RaceId")
    public HorseDto  decideWinner(@RequestParam Integer raceId) {
        return betService.decideWinner(raceId);
    }
}
