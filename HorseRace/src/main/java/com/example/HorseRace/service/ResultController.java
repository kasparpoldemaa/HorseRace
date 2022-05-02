package com.example.HorseRace.service;

import com.example.HorseRace.domain.horse.HorseDto;
import com.example.HorseRace.domain.result.ResultDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Resource
    private ResultService resultService;

    @GetMapping("/all")
    @Operation(summary = "Returns all results")
    public List<ResultDto> getAllResults() {
        return resultService.getAllResults();
    }

    @GetMapping("/id")
    @Operation (summary = "Returns a winning horse by raceId")
    public HorseDto findResultByRaceId(Integer raceId) {
        return resultService.findResultByRaceId(raceId);
    }



}
