package com.example.HorseRace.domain.horse;

import com.example.HorseRace.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HorseService {
    @Resource
    private HorseRepository horseRepository;

    @Resource
    private HorseMapper horseMapper;



    public List<HorseDto> getAllHorses() {
       return  horseMapper.toDtos(horseRepository.findAll());
    }

    public void addNewHorse(HorseDto horseDto) {
        horseRepository.save(horseMapper.toEntity(horseDto));
    }
}
