package com.example.HorseRace.domain.result;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ResultRepository extends JpaRepository<Result, Integer> {
    @Query("select r from Result r where r.raceId = ?1")
    Result findByRaceId(Integer raceId);

}