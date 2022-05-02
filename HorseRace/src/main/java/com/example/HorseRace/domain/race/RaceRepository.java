package com.example.HorseRace.domain.race;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RaceRepository extends JpaRepository<Race, Integer> {
    @Query("select r from Race r where r.hasResult = ?1")
    List<Race> findByHasResult(boolean hasResult);



}