package com.example.HorseRace.validation;

import com.example.HorseRace.domain.racehorse.RaceHorse;
import com.example.HorseRace.infrastructure.exception.BusinessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidationService {


    public static final String HORSE_IS_ALREADY_ADDED = "Horse is already added";
    public static final String HORSE_RACE_COMPLETED = "Horse race has already been completed!";

    public void raceHorseAlreadyExists(Boolean raceHorseExists) {
        if (raceHorseExists) {
            throw new BusinessException(HORSE_IS_ALREADY_ADDED, "Horse is already competing, choose another one!");
        }
    }

    public void isValidRace(boolean hasResult, String date, String time, String place) {
        if (hasResult) {
            throw new BusinessException(HORSE_RACE_COMPLETED,
                    "Race at " + place + " on " + date + " " + time + " is already finished.");
        }
    }

    public void hasEnoughHorses(int size) {
        if (size < 3) {
            throw new BusinessException("Not enough horses!", "You need at least 3 horses for an eligible race.");
        }
    }
}
