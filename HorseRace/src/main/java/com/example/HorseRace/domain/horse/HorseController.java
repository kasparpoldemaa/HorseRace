package com.example.HorseRace.domain.horse;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/horse")
public class HorseController {
    @Resource
    private HorseService horseService;

    @GetMapping("/all")
    @Operation(summary = "Returns list of all horses")
    public List<HorseDto> getAllHorses() {
        return horseService.getAllHorses();
    }

    @PostMapping("/new")
    @Operation(summary = "Add new horse to a database")
    public void addNewHorse(@RequestBody @Valid HorseDto horseDto) {
        horseService.addNewHorse(horseDto);
    }
}
