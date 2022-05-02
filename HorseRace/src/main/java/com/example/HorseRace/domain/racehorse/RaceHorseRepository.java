package com.example.HorseRace.domain.racehorse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RaceHorseRepository extends JpaRepository<RaceHorse, Integer> {
    @Query("select r from RaceHorse r where r.race.id = ?1")
    List<RaceHorse> findByRaceId(Integer id);

    @Query("select (count(r) > 0) from RaceHorse r where r.horse.id = ?1 and r.race.id = ?2")
    boolean existsByHorseIdAndRaceId(Integer horseId, Integer raceId);






}