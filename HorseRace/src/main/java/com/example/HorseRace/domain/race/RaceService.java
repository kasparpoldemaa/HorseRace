package com.example.HorseRace.domain.race;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RaceService {
    @Resource
    private RaceRepository raceRepository;
    @Resource
    private RaceMapper raceMapper;

    public RaceDto createNewRace(RaceDto raceDto) {
        Race race = raceMapper.toEntity(raceDto);
        race.setHasResult(false);
        raceRepository.save(race);
        return raceMapper.toDto(race);
    }

    public List<RaceDto> getAllRaces() {
        return raceMapper.toDtos(raceRepository.findAll());
    }

    public List<RaceDto> getAllRacesWithoutResult() {
      return raceMapper.toDtos(raceRepository.findByHasResult(false));
    }

    public void updateHasResult(Integer id) {
        Race race = raceRepository.getById(id);
        race.setHasResult(true);
        raceRepository.save(race);
    }

    public List<RaceDto> getAllRacesWithResult() {
        return raceMapper.toDtos(raceRepository.findByHasResult(true));
    }

    public Race getRaceByRaceId(Integer raceId) {
       return raceRepository.getById(raceId);
    }
}
